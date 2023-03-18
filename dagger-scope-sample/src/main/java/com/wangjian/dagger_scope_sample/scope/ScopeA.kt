package com.wangjian.dagger_scope_sample.scope

import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ScopeA()
