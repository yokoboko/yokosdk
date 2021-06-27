package com.example.yokosdk

import okhttp3.OkHttpClient

class YokoSDK {
    companion object {
        fun meaningOfLife(): Int {
            val client = OkHttpClient()
            return 42
        }
    }
}