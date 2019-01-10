package com.chrizzz35.hotel.ui

import com.chrizzz35.hotelapi.HotelProvider

/**
 * Created by christian.leonard on 1/10/19
 */

class HotelPresenter(private val hotelProvider: HotelProvider) {

    lateinit var viewModel: HotelViewModel

    fun initHotelData() {
        viewModel.hotelList = hotelProvider.getHotelList()
    }
}