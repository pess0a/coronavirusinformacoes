package com.pessoadev.coronavirusinformacoes.presentation.dashboard.news

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.pessoadev.coronavirusinformacoes.R
import com.prof.rssparser.Article
import kotlinx.android.synthetic.main.fragment_news.*
import org.koin.androidx.viewmodel.ext.android.viewModel


/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {

    private val vm: NewsViewModel by viewModel()
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.getG1RSS()

        vm.newsList.observe(requireActivity(), Observer {
            setupNewsRecyclerView(it)
        })

        vm.error.observe(requireActivity(), Observer {
            Toast.makeText(context,it,Toast.LENGTH_LONG).show()
        })
    }

    private fun setupNewsRecyclerView(listArticle : List<Article>) {
        newsAdapter = NewsAdapter(listArticle.filter { it.image!=null })
        recyclerViewArticles.apply {
            adapter = newsAdapter
            this.layoutManager = LinearLayoutManager(context)
        }
        newsAdapter.onSelectedListener { url ->
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = NewsFragment()
    }

}
