package com.f776

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform