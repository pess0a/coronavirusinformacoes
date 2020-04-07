package com.pessoadev.coronavirusinformacoes.presentation.dashboard.news

import androidx.lifecycle.MutableLiveData
import com.pessoadev.coronavirusinformacoes.base.BaseViewModel
import com.prof.rssparser.Article
import com.prof.rssparser.Parser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel : BaseViewModel() {
    val newsList = MutableLiveData<List<Article>>()
    val error = MutableLiveData<String>()

    fun getG1RSS() {
        val url = "https://g1.globo.com/dynamo/ciencia-e-saude/rss2.xml"

        scope.launch(Dispatchers.Main) {
            try {
                val parser = Parser()
                val channel = parser.getChannel(url)
                newsList.value = channel.articles.toList()
            } catch (e: Exception) {
                e.printStackTrace()
                error.value = e.localizedMessage
            }
        }
    }

}