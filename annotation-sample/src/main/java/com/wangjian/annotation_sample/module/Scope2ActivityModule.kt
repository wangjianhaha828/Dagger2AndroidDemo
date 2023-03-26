package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.activity.Scope2Activity
import com.wangjian.annotation_sample.activity.Scope2Fragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

//这个Module只负责与applicationComponent关联，一般不负责提供数据
@Module
interface Scope2ActivityModule {
    @ContributesAndroidInjector(modules = [Scope2FragmentModule::class,Scope2Module::class])
    fun contributeScope2ActivityAndroidInjector():Scope2Activity

    @Module
    interface Scope2FragmentModule{
        @ContributesAndroidInjector(modules = [Scope2ModuleF::class])
        fun contributeScope2FragmentAndroidInjector():Scope2Fragment
    }
}