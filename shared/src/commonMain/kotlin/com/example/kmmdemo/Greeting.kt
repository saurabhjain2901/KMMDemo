package com.example.kmmdemo

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello World - , ${platform.name}!"
    }
}