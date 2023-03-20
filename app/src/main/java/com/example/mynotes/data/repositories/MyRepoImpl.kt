package com.example.mynotes.data.repositories

import javax.inject.Inject

class MyRepoImpl @Inject constructor(): MyRepo {
    override fun getString(): String {
        return "Hello from the repo IMPL"
    }
}