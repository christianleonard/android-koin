package com.chrizzz35.app

import android.app.Application
import com.chrizzz35.app.di.appModule
import com.chrizzz35.flight.di.flightPresenterModule
import com.chrizzz35.flight.di.flightProviderModule
import com.chrizzz35.flighthotel.di.flightHotelPresenterModule
import com.chrizzz35.hotel.di.hotelPresenterModule
import com.chrizzz35.hotel.di.hotelProviderModule
import org.koin.android.ext.android.startKoin

/**
 * Created by christian.leonard on 1/10/19
 */

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
            appModule,

            flightPresenterModule,
            flightProviderModule,

            hotelPresenterModule,
            hotelProviderModule,

            flightHotelPresenterModule
        ))
    }
}