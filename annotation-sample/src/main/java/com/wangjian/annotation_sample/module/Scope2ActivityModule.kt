package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.activity.Scope2Activity
import dagger.Module
import dagger.android.ContributesAndroidInjector

//这个Module只负责与applicationComponent关联，一般不负责提供数据
@Module
interface Scope2ActivityModule {
    @ContributesAndroidInjector(modules = [Scope2Module::class])
    fun contributeLoginAndroidInjector():Scope2Activity
}