package com.pessoadev.coronavirusnumbers.presentation.countries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.pessoadev.coronavirusnumbers.R
import com.pessoadev.coronavirusnumbers.model.Country
import com.pessoadev.coronavirusnumbers.util.CountryCodeUtil
import kotlinx.android.synthetic.main.item_country.view.*

class CountriesAdapter(list: List<Country>) :
    RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {

    lateinit var onSelectedListener: OnSelectedListener

    private var countriesList: List<Country> = list
    private val flagUrl = "https://restcountries.eu/rest/v2/name/"

    inner class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(country: Country) {
            itemView.textViewCountryName.text = country.name
            val countryCode = CountryCodeUtil().getCode(country.name)
            itemView.imageViewCountryFlag.load("https://www.countryflags.io/$countryCode/shiny/32.png")

            itemView.setOnClickListener {
                onSelectedListener.onClick(country)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return countriesList.size
    }

    private fun getItem(position: Int): Country {
        return countriesList[position]
    }

    inline fun onSelectedListener(crossinline listener: (Country) -> Unit) {
        this.onSelectedListener = object : OnSelectedListener {
            override fun onClick(country: Country) = listener(country)
        }
    }

    interface OnSelectedListener {
        fun onClick(country: Country) = Unit
    }


}