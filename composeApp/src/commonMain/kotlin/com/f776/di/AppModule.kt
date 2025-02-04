package com.f776.di

import com.f776.data.di.DataModule
import org.koin.dsl.module

val AppModule = module {
    includes(DataModule)
}