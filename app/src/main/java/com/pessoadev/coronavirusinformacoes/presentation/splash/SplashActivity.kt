package com.pessoadev.coronavirusinformacoes.presentation.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.pessoadev.coronavirusinformacoes.R
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.DashboardActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity() {

    private val vm: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        vm.getCountries()

        setupObservers()
    }

    private fun setupObservers() {
        vm.onLoadCountries.observe(this, Observer {
            Handler().postDelayed({
                startActivity(Intent(this@SplashActivity, DashboardActivity::class.java))
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
                finish()
            }, 3000)
        })
    }
}
