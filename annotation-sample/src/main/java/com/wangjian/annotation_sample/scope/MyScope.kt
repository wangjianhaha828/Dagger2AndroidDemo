package com.wangjian.annotation_sample.scope

import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class MyScope