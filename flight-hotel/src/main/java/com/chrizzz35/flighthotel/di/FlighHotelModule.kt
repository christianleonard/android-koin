package com.chrizzz35.flighthotel.di

import com.chrizzz35.flighthotel.ui.FlightHotelPresenter
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

/**
 * Created by christian.leonard on 1/10/19
 */

val flightHotelPresenterModule: Module = module {
    factory { FlightHotelPresenter(get(), get()) }
}
