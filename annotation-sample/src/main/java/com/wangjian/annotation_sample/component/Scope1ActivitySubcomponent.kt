package com.wangjian.annotation_sample.component

import com.wangjian.annotation_sample.activity.Scope1Activity
import com.wangjian.annotation_sample.module.Scope1Module
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [Scope1Module::class])
interface Scope1ActivitySubcomponent : AndroidInjector<Scope1Activity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<Scope1Activity> {}
}