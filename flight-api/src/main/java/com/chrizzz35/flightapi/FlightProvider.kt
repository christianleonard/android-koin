package com.chrizzz35.flightapi

/**
 * Created by christian.leonard on 1/10/19
 */

interface FlightProvider {
    fun getFlightList(): MutableList<String>
}