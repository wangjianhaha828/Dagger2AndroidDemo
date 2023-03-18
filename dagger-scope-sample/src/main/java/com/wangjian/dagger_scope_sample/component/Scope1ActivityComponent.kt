package com.wangjian.dagger_scope_sample.component

import com.wangjian.dagger_scope_sample.activity.Scope1Activity
import com.wangjian.dagger_scope_sample.activity.Scope2Activity
import com.wangjian.dagger_scope_sample.module.Scope1ActivityModule
import com.wangjian.dagger_scope_sample.scope.ScopeA
import dagger.Component
import javax.inject.Singleton

@Singleton
@ScopeA
@Component(modules = [Scope1ActivityModule::class])
interface Scope1ActivityComponent {
    fun inject(scope1Activity: Scope1Activity)
    fun inject(scope2Activity: Scope2Activity)
}