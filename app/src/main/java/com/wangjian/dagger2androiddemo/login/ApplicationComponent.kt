package com.wangjian.dagger2androiddemo.login

import com.wangjian.dagger2androiddemo.login.repository.UserRepositoryModel
import com.wangjian.dagger2androiddemo.login.sub.LoginComponent
import com.wangjian.dagger2androiddemo.login.sub.SubcomponentsModule
import dagger.Component
import javax.inject.Singleton

//UserRepositoryModel对象与ApplicationComponent生命周期相同
@Singleton
@Component(modules = [UserRepositoryModel::class, SubcomponentsModule::class])
interface ApplicationComponent {
    //因为使用子组件LoginComponent进行注入，所以可以移除
//    fun inject(activity: LoginActivity)
    fun loginComponent() : LoginComponent.Factory
}