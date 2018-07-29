package com.ade.kotlin.footballclub.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.ade.kotlin.footballclub.R
import com.ade.kotlin.footballclub.model.Item
import com.bumptech.glide.Glide
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class RecyclerAdapter constructor(private val context: Context, private val items: ArrayList<Item>,
                                  private val listenerRecyclerAdapter: ListenerRecyclerAdapter)
                                    : RecyclerView.Adapter<RecyclerAdapter.ViewHolderItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        return ViewHolderItem(
                ItemUI().createView(
                        AnkoContext.Companion.create(parent.context, parent)
                )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val item = items[position]
        holder.txtNamaClub.text = item.name
        Glide.with(context)
                .load(item.logo)
                .into(holder.imgClub)
    }

    inner class ViewHolderItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val relativeLayoutContainerItem: RelativeLayout = itemView.find(R.id.relative_layout)
        val imgClub: ImageView = itemView.find(R.id.image)
        val txtNamaClub: TextView = itemView.find(R.id.text)

        init {
            relativeLayoutContainerItem.setOnClickListener {
                listenerRecyclerAdapter.onClick(item = items[adapterPosition])
            }
        }

    }

    interface ListenerRecyclerAdapter {

        fun onClick(item: Item)

    }

}

class ItemUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        cardView{
            lparams(width = matchParent, height = wrapContent){
                topMargin = dip(10)
                rightMargin = dip(16)
                leftMargin = dip(16)
                bottomMargin = dip(10)
            }
            relativeLayout {
                imageView {
                    id = R.id.image
                    setImageDrawable(ContextCompat.getDrawable(context, R.drawable.aceh_logo))
                }.lparams(width = 120, height = 120) {
                    rightMargin = dip(8)
                }
                textView {
                    id = R.id.text
                    text = "Club name"
                }.lparams {
                    width = wrapContent
                    height = wrapContent
                    centerVertically()
                    rightOf(R.id.image)
                }

                id = R.id.relative_layout
                lparams(width = matchParent, height = wrapContent) {
                    topPadding = dip(8)
                    rightPadding = dip(16)
                    bottomPadding = dip(8)
                    leftPadding = dip(16)
                }
            }

        }

    }
}