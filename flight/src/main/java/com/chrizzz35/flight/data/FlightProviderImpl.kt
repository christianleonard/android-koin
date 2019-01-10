package com.chrizzz35.flight.data

import com.chrizzz35.core.ApiService
import com.chrizzz35.flightapi.FlightProvider

/**
 * Created by christian.leonard on 1/10/19
 */

class FlightProviderImpl (private val apiService: ApiService) : FlightProvider {
    override fun getFlightList(): MutableList<String> {
        return if(apiService.isActive) {
            (0..5).map {
                "Flight-$it"
            }.toMutableList()
        } else mutableListOf()
    }
}