package com.pessoadev.coronavirusinformacoes.presentation.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pessoadev.coronavirusinformacoes.R
import com.pessoadev.coronavirusinformacoes.data.cache.CountriesCache
import kotlinx.android.synthetic.main.activity_countries.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CountriesActivity : AppCompatActivity() {


    private val viewModel: CountriesViewModel by viewModel()
    private lateinit var countriesAdapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countries)

        setupCountriesRecyclerView()

    }

    private fun setupCountriesRecyclerView() {
        val countriesList = CountriesCache.getCountriesList()
        countriesAdapter = CountriesAdapter(countriesList)
        recyclerViewCountries.apply {
            adapter = countriesAdapter
            this.layoutManager = LinearLayoutManager(this@CountriesActivity)
        }
    }
}
