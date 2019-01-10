package com.chrizzz35.app.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chrizzz35.app.R
import com.chrizzz35.flight.ui.FlightActivity
import com.chrizzz35.flighthotel.ui.FlightHotelActivity
import com.chrizzz35.hotel.ui.HotelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_flight.setOnClickListener {
            startActivity(Intent(this, FlightActivity::class.java))
        }

        btn_hotel.setOnClickListener {
            startActivity(Intent(this, HotelActivity::class.java))
        }

        btn_flight_hotel.setOnClickListener {
            startActivity(Intent(this, FlightHotelActivity::class.java))
        }
    }
}
