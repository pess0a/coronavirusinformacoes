package com.pessoadev.coronavirusnumbers.presentation.dashboard.general.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pessoadev.coronavirusnumbers.R
import com.pessoadev.coronavirusnumbers.data.cache.CountriesCache
import com.pessoadev.coronavirusnumbers.util.toDecimalFormat
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

        textViewInfected.text = CountriesCache.getCountriesInfected().toDecimalFormat()
        textViewVictims.text = CountriesCache.getCountriesDeath().toDecimalFormat()
        textViewRecovery.text = CountriesCache.getCountriesRecovery().toDecimalFormat()
        textViewCountries.text = CountriesCache.getCountriesCount().toDecimalFormat()

        textViewInfectedLast24Hours.text = CountriesCache.getCountriesInfectedLast24Hours().toDecimalFormat()
        textViewVictimsLast24Hours.text = CountriesCache.getCountriesDeathLast24Hours().toDecimalFormat()
        textViewRecoveryLast24Hours.text = CountriesCache.getCountriesRecoveryLast24Hours().toDecimalFormat()
        textViewCountriesLast24Hours.text = CountriesCache.getCountriesCountLast24Hours().toDecimalFormat()

        vm.getG1RSS()
    }

    companion object {

        @JvmStatic
        fun newInstance() = GeneralInformationFragment()
    }
}
