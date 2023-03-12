package com.wangjian.dagger2androiddemo.login.repository

class UserRepository {
    fun getList(): MutableList<String> {
        return mutableListOf<String>("one","two","three")
    }
}