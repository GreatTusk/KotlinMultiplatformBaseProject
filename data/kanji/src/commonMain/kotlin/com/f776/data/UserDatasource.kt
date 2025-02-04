package com.f776.data

import com.f776.core.database.UserDao
import com.f776.core.database.UserEntity

class UserDatasource(private val userDao: UserDao) {

    suspend fun insertUser() {
        userDao.insertUser(UserEntity((1..999999).random(), name = "Anonymous"))
    }

    suspend fun getUser(): User {
        val user = userDao.getUser()
        return User(
            id = user.id,
            name = user.name
        )
    }
}