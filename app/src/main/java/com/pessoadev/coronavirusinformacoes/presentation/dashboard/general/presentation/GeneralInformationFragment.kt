package com.pessoadev.coronavirusinformacoes.presentation.dashboard.general.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pessoadev.coronavirusinformacoes.R
import com.pessoadev.coronavirusinformacoes.data.cache.CountriesCache
import com.pessoadev.coronavirusinformacoes.util.toDecimalFormat
import kotlinx.android.synthetic.main.fragment_general_information.*
import kotlinx.android.synthetic.main.layout_last_24_hours.*
import kotlinx.android.synthetic.main.layout_totals.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class GeneralInformationFragment : Fragment() {

    private val vm: GeneralInformationViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_general_information, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(CountriesCache.getCountriesList().isNullOrEmpty()) {
            textViewError.visibility = View.VISIBLE
        }

        textViewInfected.text = CountriesCache.getCountriesInfected().toDecimalFormat()
        textViewVictims.text = CountriesCache.getCountriesDeath().toDecimalFormat()
        textViewRecovery.text = CountriesCache.getCountriesRecovery().toDecimalFormat()
        textViewCountries.text = CountriesCache.getCountriesCount().toDecimalFormat()

        textViewInfectedLast24Hours.text = CountriesCache.getCountriesInfectedLast24Hours().toDecimalFormat()
        textViewVictimsLast24Hours.text = CountriesCache.getCountriesDeathLast24Hours().toDecimalFormat()
        textViewRecoveryLast24Hours.text = CountriesCache.getCountriesRecoveryLast24Hours().toDecimalFormat()

    }

    companion object {

        @JvmStatic
        fun newInstance() = GeneralInformationFragment()
    }
}
