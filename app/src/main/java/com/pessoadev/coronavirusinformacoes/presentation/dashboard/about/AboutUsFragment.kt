package com.pessoadev.coronavirusinformacoes.presentation.dashboard.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pessoadev.coronavirusinformacoes.R

/**
 * A simple [Fragment] subclass.
 */
class AboutUsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about_us, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    companion object {

        @JvmStatic
        fun newInstance() = AboutUsFragment()
    }
}
