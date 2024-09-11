package com.erdemtsynduev.todo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform