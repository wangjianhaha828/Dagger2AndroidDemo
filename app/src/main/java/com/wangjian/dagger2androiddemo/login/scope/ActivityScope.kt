package com.wangjian.dagger2androiddemo.login.scope

import javax.inject.Scope

//自定义作用域
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope
