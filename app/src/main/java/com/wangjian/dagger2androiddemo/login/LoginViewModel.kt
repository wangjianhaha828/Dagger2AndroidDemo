package com.wangjian.dagger2androiddemo.login

import android.util.Log
import com.wangjian.dagger2androiddemo.login.repository.UserRepository
import com.wangjian.dagger2androiddemo.login.scope.ActivityScope
import javax.inject.Inject

//UserRepository由ApplicationComponent负责构建
class LoginViewModel @Inject constructor(private val userRepository : UserRepository) {
    fun login(){
        Log.d("TAG","登录:${this}")
    }
    fun getData(){
        Log.d("TAG",userRepository.getList().toString()+":${this}")
    }
}