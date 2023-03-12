package com.wangjian.dagger2androiddemo.login.sub

import dagger.Module

//告诉Dagger哪些子组件是该模块所包含的组件的子组件
@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule {
}