package com.chrizzz35.hotel.di

import com.chrizzz35.hotel.data.HotelProviderImpl
import com.chrizzz35.hotel.ui.HotelPresenter
import com.chrizzz35.hotelapi.HotelProvider
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

/**
 * Created by christian.leonard on 1/10/19
 */

val hotelPresenterModule: Module = module {
    factory { HotelPresenter(get()) }
}

val hotelProviderModule: Module = module {
    single { HotelProviderImpl(get()) as HotelProvider }
}