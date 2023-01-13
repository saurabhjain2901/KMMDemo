package com.example.kmmdemo

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello Somesh - , ${platform.name}!"
    }
}