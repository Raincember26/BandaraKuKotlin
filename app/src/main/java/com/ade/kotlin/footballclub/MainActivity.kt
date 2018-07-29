package com.ade.kotlin.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ade.kotlin.footballclub.adapter.RecyclerAdapter
import com.ade.kotlin.footballclub.model.Item
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {

    private val recyclerView by lazy {
        find<RecyclerView>(R.id.recycler_view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)

        val items = ArrayList<Item>()
        items.add(Item(name = getString(R.string.aceh), image = R.drawable.aceh, logo = R.drawable.aceh_logo, header = getString(R.string.jdl_aceh), detail = getString(R.string.aceh_detail)))
        items.add(Item(name = getString(R.string.sumut),image = R.drawable.sumut, logo = R.drawable.sumut_logo,header = getString(R.string.jdl_sumut), detail = getString(R.string.sumut_detail)))
        items.add(Item(name = getString(R.string.sumbar), image = R.drawable.sumbar, logo = R.drawable.sumbar_logo,header = getString(R.string.jdl_sumbar), detail = getString(R.string.sumbar_detail)))
        items.add(Item(name = getString(R.string.riau), image = R.drawable.riau, logo = R.drawable.riau_logo, header = getString(R.string.jdl_riau),detail = getString(R.string.riau_detail)))
        items.add(Item(name = getString(R.string.kepriau), image = R.drawable.kepriau, logo = R.drawable.kepriau_logo, header = getString(R.string.jdl_kepriau),detail = getString(R.string.kepriau_detail)))
        items.add(Item(name = getString(R.string.jambi), image = R.drawable.jambi,logo = R.drawable.jambi_logo,header = getString(R.string.jdl_jambi), detail = getString(R.string.jambi_detail)))
        items.add(Item(name = getString(R.string.sumsel),image = R.drawable.sumsel, logo = R.drawable.sumsel_logo,header = getString(R.string.jdl_sumsel), detail = getString(R.string.sumsel_detail)))
        items.add(Item(name = getString(R.string.bangka), image = R.drawable.bangka,logo = R.drawable.bangka_logo,header = getString(R.string.jdl_bangka), detail = getString(R.string.bangka_detail)))
        items.add(Item(name = getString(R.string.bengkulu),image = R.drawable.bengkulu, logo = R.drawable.bengkulu_logo,header = getString(R.string.jdl_bengkulu), detail = getString(R.string.bengkulu_detail)))
        items.add(Item(name = getString(R.string.lampung), image = R.drawable.lampung,logo = R.drawable.lampung_logo,header = getString(R.string.jdl_lampung), detail = getString(R.string.lampung_detail)))

        items.add(Item(name = getString(R.string.jakarta), image = R.drawable.jakarta, logo = R.drawable.jakarta_logo, header = getString(R.string.jdl_jakarta), detail = getString(R.string.jakarta_detail)))
        items.add(Item(name = getString(R.string.jabar),image = R.drawable.jabar, logo = R.drawable.jabar_logo,header = getString(R.string.jdl_jabar), detail = getString(R.string.jabar_detail)))
        items.add(Item(name = getString(R.string.banten), image = R.drawable.banten, logo = R.drawable.banten_logo,header = getString(R.string.jdl_banten), detail = getString(R.string.banten_detail)))
        items.add(Item(name = getString(R.string.jateng), image = R.drawable.jateng, logo = R.drawable.jateng_logo, header = getString(R.string.jdl_jateng),detail = getString(R.string.jateng_detail)))
        items.add(Item(name = getString(R.string.jogja), image = R.drawable.jogja, logo = R.drawable.jogja_logo, header = getString(R.string.jdl_jogja),detail = getString(R.string.jogja_detail)))
        items.add(Item(name = getString(R.string.jatim), image = R.drawable.jatim,logo = R.drawable.jatim_logo,header = getString(R.string.jdl_jatim), detail = getString(R.string.jatim_detail)))
        items.add(Item(name = getString(R.string.bali),image = R.drawable.bali, logo = R.drawable.bali_logo,header = getString(R.string.jdl_bali), detail = getString(R.string.bali_detail)))
        items.add(Item(name = getString(R.string.ntb), image = R.drawable.ntb,logo = R.drawable.ntb_logo,header = getString(R.string.jdl_ntb), detail = getString(R.string.ntb_detail)))
        items.add(Item(name = getString(R.string.ntt),image = R.drawable.ntt, logo = R.drawable.ntt_logo,header = getString(R.string.jdl_ntt), detail = getString(R.string.ntt_detail)))
        items.add(Item(name = getString(R.string.kalbar), image = R.drawable.kalbar,logo = R.drawable.kalbar_logo,header = getString(R.string.jdl_kalbar), detail = getString(R.string.kalbar_detail)))

        items.add(Item(name = getString(R.string.kalteng), image = R.drawable.kalteng, logo = R.drawable.kalteng_logo, header = getString(R.string.jdl_kalteng), detail = getString(R.string.kalteng_detail)))
        items.add(Item(name = getString(R.string.kalsel),image = R.drawable.kalsel, logo = R.drawable.kalsel_logo,header = getString(R.string.jdl_kalsel), detail = getString(R.string.kalsel_detail)))
        items.add(Item(name = getString(R.string.kaltim), image = R.drawable.kaltim, logo = R.drawable.kaltim_logo,header = getString(R.string.jdl_kaltim), detail = getString(R.string.kaltim_detail)))
        items.add(Item(name = getString(R.string.kaltara), image = R.drawable.kaltara, logo = R.drawable.kaltara_logo, header = getString(R.string.jdl_kaltara),detail = getString(R.string.kaltara_detail)))
        items.add(Item(name = getString(R.string.sulut), image = R.drawable.sulut, logo = R.drawable.sulut_logo, header = getString(R.string.jdl_sulut),detail = getString(R.string.sulut_detail)))
        items.add(Item(name = getString(R.string.sulbar), image = R.drawable.sulbar,logo = R.drawable.sulbar_logo,header = getString(R.string.jdl_sulbar), detail = getString(R.string.sulbar_detail)))
        items.add(Item(name = getString(R.string.sulteng),image = R.drawable.sulteng, logo = R.drawable.sulteng_logo,header = getString(R.string.jdl_sulteng), detail = getString(R.string.sulteng_detail)))
        items.add(Item(name = getString(R.string.sultera), image = R.drawable.sultera,logo = R.drawable.sultera_logo,header = getString(R.string.jdl_sultera), detail = getString(R.string.sultera_detail)))
        items.add(Item(name = getString(R.string.sulsel),image = R.drawable.sulsel, logo = R.drawable.sulsel_logo,header = getString(R.string.jdl_sulsel), detail = getString(R.string.sulsel_detail)))
        items.add(Item(name = getString(R.string.gorontalo), image = R.drawable.gorontalo,logo = R.drawable.gorontalo_logo,header = getString(R.string.jdl_gorontalo), detail = getString(R.string.gorontalo_detail)))

        items.add(Item(name = getString(R.string.maluku),image = R.drawable.maluku, logo = R.drawable.maluku_logo,header = getString(R.string.jdl_maluku), detail = getString(R.string.maluku_detail)))
        items.add(Item(name = getString(R.string.malut), image = R.drawable.malut,logo = R.drawable.malut_logo,header = getString(R.string.jdl_malut), detail = getString(R.string.malut_detail)))
        items.add(Item(name = getString(R.string.papuabar),image = R.drawable.papuabar, logo = R.drawable.papuabar_logo,header = getString(R.string.jdl_papuabar), detail = getString(R.string.papuabar_detail)))
        items.add(Item(name = getString(R.string.papua), image = R.drawable.papua,logo = R.drawable.papua_logo,header = getString(R.string.jdl_papua), detail = getString(R.string.papua_detail)))


        val adapterRecylerView = RecyclerAdapter(context = this, items = items, listenerRecyclerAdapter = object : RecyclerAdapter.ListenerRecyclerAdapter {
            override fun onClick(item: Item) {
                startActivity(intentFor<DetailActivity>("data" to item))
            }
        })
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapterRecylerView
    }

    class MainActivityUI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            relativeLayout {
                recyclerView {
                    id = R.id.recycler_view
                }.lparams(width = matchParent, height = wrapContent)
            }
        }
    }

}