package com.chrizzz35.flight.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chrizzz35.flight.R
import org.koin.android.ext.android.inject

class FlightActivity : AppCompatActivity() {

    private val presenter: FlightPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight)

        presenter.viewModel = FlightViewModel()

        if(presenter.viewModel.flightList.isEmpty()) {
            presenter.initFlightData()
        }
    }
}
