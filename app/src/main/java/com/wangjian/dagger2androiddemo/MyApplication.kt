package com.wangjian.dagger2androiddemo

import android.app.Application
import com.wangjian.dagger2androiddemo.login.DaggerApplicationComponent

class MyApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()
}