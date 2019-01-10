package com.chrizzz35.hotel.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chrizzz35.hotel.R
import org.koin.android.ext.android.inject

class HotelActivity : AppCompatActivity() {

    private val presenter: HotelPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        presenter.viewModel = HotelViewModel()

        if(presenter.viewModel.hotelList.isEmpty()) {
            presenter.initHotelData()
        }
    }
}
