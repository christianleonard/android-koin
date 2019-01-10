package com.chrizzz35.hotel.data

import com.chrizzz35.core.ApiService
import com.chrizzz35.hotelapi.HotelProvider

/**
 * Created by christian.leonard on 1/10/19
 */

class HotelProviderImpl(private val apiService: ApiService) : HotelProvider {
    override fun getHotelList(): MutableList<String> {
        return if (apiService.isActive) (0..5).map {
            "Hotel-$it"
        }.toMutableList() else mutableListOf()
    }
}