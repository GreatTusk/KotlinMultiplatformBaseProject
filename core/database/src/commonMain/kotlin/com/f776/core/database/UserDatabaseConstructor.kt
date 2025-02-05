package com.f776.core.database

import androidx.room.RoomDatabaseConstructor

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object UserDatabaseConstructor: RoomDatabaseConstructor<UserDatabase> {
    override fun initialize(): UserDatabase
}