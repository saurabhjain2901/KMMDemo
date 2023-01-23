package com.saurabh.kmmdemo

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello Somesh Verma - , ${platform.name}!"
        return "Hello World - , ${platform.name}!"
    }
}