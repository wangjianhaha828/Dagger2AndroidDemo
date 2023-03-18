package com.wangjian.annotation_sample.application

import com.wangjian.annotation_sample.module.Scope1ActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, Scope1ActivityModule::class])
interface ApplicationComponent {
    fun injectApplication(application: MyApplication)
}