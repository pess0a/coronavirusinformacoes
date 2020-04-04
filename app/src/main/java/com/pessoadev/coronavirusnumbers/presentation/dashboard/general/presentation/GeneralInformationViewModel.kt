package com.pessoadev.coronavirusnumbers.presentation.dashboard.general.presentation

import com.pessoadev.coronavirusnumbers.base.BaseViewModel
import com.prof.rssparser.Parser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class GeneralInformationViewModel : BaseViewModel() {


    fun getG1RSS() {
        val url = "http://g1.globo.com/dynamo/ciencia-e-saude/rss2.xml"

        scope.launch(Dispatchers.Main) {
            try {
                val parser = Parser()
                val articleList = parser.getChannel(url)
                var a = 1
            } catch (e: Exception) {
                // Handle the exception
            }
        }
    }

}
