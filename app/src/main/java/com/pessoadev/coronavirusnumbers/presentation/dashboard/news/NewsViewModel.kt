package com.pessoadev.coronavirusnumbers.presentation.dashboard.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pessoadev.coronavirusnumbers.base.BaseViewModel
import com.prof.rssparser.Article
import com.prof.rssparser.Parser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel : BaseViewModel() {
    val newsList = MutableLiveData<List<Article>>()

    fun getG1RSS() {
        val url = "http://g1.globo.com/dynamo/ciencia-e-saude/rss2.xml"

        scope.launch(Dispatchers.Main) {
            try {
                val parser = Parser()
                val channel = parser.getChannel(url)
                newsList.value = channel.articles.toList()
                var a = 1
            } catch (e: Exception) {
                // Handle the exception
            }
        }
    }

}