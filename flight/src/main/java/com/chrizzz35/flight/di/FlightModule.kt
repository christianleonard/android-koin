package com.chrizzz35.flight.di

import com.chrizzz35.flight.data.FlightProviderImpl
import com.chrizzz35.flight.ui.FlightPresenter
import com.chrizzz35.flightapi.FlightProvider
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

/**
 * Created by christian.leonard on 1/10/19
 */

val flightPresenterModule: Module = module {
    factory { FlightPresenter(get()) }
}

val flightProviderModule: Module = module {
    single { FlightProviderImpl(get()) as FlightProvider }
}