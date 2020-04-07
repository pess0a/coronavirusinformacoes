package com.pessoadev.coronavirusinformacoes.presentation.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.pessoadev.coronavirusinformacoes.R
import com.pessoadev.coronavirusinformacoes.presentation.countries.CountriesActivity
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.about.AboutUsFragment
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.general.presentation.GeneralInformationFragment
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.news.NewsFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
//
//        textViewCountriesNumber.text = CountriesCache.getCountriesNumbers().toString()
//        textViewCountriesDeath.text = CountriesCache.getCountriesDeath().toString()
//        textViewCountriesRecovery.text = CountriesCache.getCountriesRecovery().toString()
//        textViewCountriesInfected.text = CountriesCache.getCountriesInfected().toString()
//
//        textViewCountriesInfected.setOnClickListener {
//            goToCountriesList()
//        }



        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val fragmentList = arrayListOf<Fragment>(
            GeneralInformationFragment.newInstance(),
            NewsFragment.newInstance(),
            AboutUsFragment.newInstance()
        )

        viewPager.adapter = ViewPagerAdapter(this, fragmentList)

        TabLayoutMediator(tabLayout, viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> { tab.text = "Geral"}
                    1 -> { tab.text = "Notícias"}
                    2 -> { tab.text = "Sobre nós"}
                }
            }).attach()

    }

    private fun goToCountriesList() {
        startActivity(Intent(this, CountriesActivity::class.java))
    }
}
