package com.chrizzz35.flight.ui

import com.chrizzz35.flightapi.FlightProvider

/**
 * Created by christian.leonard on 1/10/19
 */

class FlightPresenter(private val flightProvider: FlightProvider) {

    lateinit var viewModel: FlightViewModel

    fun initFlightData() {
        viewModel.flightList = flightProvider.getFlightList()
    }
}