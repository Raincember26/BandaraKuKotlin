package com.ade.kotlin.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ade.kotlin.footballclub.R.id.*
import com.ade.kotlin.footballclub.model.Item
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getSerializableExtra("data") as Item
        Glide.with(this)
                .load(data.image)
                .into(image_view_club_activity_detail_club)
        Glide. with (this)
                .load(data.logo)
                .into(image_view_provinsi_activity_detail_club)
        text_view_club_detaiL_activity_detail_club.text = data.detail
        text_view_header_detaiL_activity_detail_club.text = data.header
    }
}
