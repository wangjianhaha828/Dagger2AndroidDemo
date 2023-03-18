package com.wangjian.dagger_scope_sample.component

import com.wangjian.dagger_scope_sample.activity.Scope3Activity
import com.wangjian.dagger_scope_sample.module.Scope1ActivityModule
import com.wangjian.dagger_scope_sample.module.Scope3ActivityModule
import com.wangjian.dagger_scope_sample.scope.ScopeA
import dagger.Component
import javax.inject.Singleton

@Singleton
@ScopeA
@Component(modules = [Scope1ActivityModule::class])
interface Scope3ActivityComponent {
    fun inject(scope1Activity: Scope3Activity)
}