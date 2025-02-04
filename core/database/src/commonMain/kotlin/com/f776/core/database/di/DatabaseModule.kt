package com.f776.core.database.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.f776.core.database.DatabaseFactory
import com.f776.core.database.UserDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

expect val PlatformDatabaseModule: Module

val DatabaseModule = module {
    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<UserDatabase>().userDao() }
}