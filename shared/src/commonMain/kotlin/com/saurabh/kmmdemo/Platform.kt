package com.saurabh.kmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform