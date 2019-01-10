package com.chrizzz35.hotelapi

/**
 * Created by christian.leonard on 1/10/19
 */

interface HotelProvider {
    fun getHotelList(): MutableList<String>
}