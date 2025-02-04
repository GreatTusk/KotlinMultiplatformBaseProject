package com.f776.data.di

import com.f776.core.database.di.DatabaseModule
import com.f776.core.database.di.PlatformDatabaseModule
import com.f776.data.UserDatasource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val DataModule = module {
    includes(DatabaseModule, PlatformDatabaseModule)
    singleOf(::UserDatasource)
}