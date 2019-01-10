package com.chrizzz35.app.di

import com.chrizzz35.core.ApiService
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

/**
 * Created by christian.leonard on 1/10/19
 */

val appModule: Module = module {
    single { ApiService() }
}