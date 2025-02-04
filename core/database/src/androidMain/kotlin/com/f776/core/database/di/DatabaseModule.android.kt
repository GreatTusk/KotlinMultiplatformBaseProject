package com.f776.core.database.di

import com.f776.core.database.DatabaseFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val PlatformDatabaseModule: Module
    get() = module {
        singleOf(::DatabaseFactory)
    }