package com.wangjian.dagger_scope_sample.activity

import android.app.Application
import com.wangjian.dagger_scope_sample.component.DaggerScope1ActivityComponent
import com.wangjian.dagger_scope_sample.component.Scope1ActivityComponent

class MyApplication : Application() {
    lateinit var scope1ActivityComponent: Scope1ActivityComponent
    override fun onCreate() {
        super.onCreate()
        scope1ActivityComponent = DaggerScope1ActivityComponent.create()
    }
}