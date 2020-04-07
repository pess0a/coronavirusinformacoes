package com.pessoadev.coronavirusinformacoes.presentation.dashboard.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.pessoadev.coronavirusinformacoes.R
import com.pessoadev.coronavirusinformacoes.util.toBrazilianStringDate
import com.prof.rssparser.Article
import kotlinx.android.synthetic.main.item_news.view.*


class NewsAdapter(list: List<Article>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    lateinit var onSelectedListener: OnSelectedListener

    private var articlesList: List<Article> = list

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(article: Article) {
            itemView.textViewTitleNews.text = article.title
            if (article.image.isNullOrEmpty()) {
                itemView.imageViewNews.visibility = View.GONE
            } else {
                itemView.imageViewNews.load(article.image)
                itemView.imageViewNews.visibility = View.VISIBLE
            }

            itemView.textViewDate.text = article.pubDate?.toBrazilianStringDate()
            itemView.setOnClickListener {
                onSelectedListener.onClick(article.link!!)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return articlesList.size
    }

    private fun getItem(position: Int): Article {
        return articlesList[position]
    }

    inline fun onSelectedListener(crossinline listener: (String) -> Unit) {
        this.onSelectedListener = object : OnSelectedListener {
            override fun onClick(url: String) = listener(url)
        }
    }

    interface OnSelectedListener {
        fun onClick(url: String) = Unit
    }


}