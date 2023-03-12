package com.wangjian.dagger2androiddemo.login.sub

import com.wangjian.dagger2androiddemo.login.LoginActivity
import com.wangjian.dagger2androiddemo.login.scope.ActivityScope
import dagger.Subcomponent

//因为UserRepositoryModel由ApplicationComponent提供，所以要使用，必须将LoginComponent定义为ApplicationComponent的子组件
//子组件使用:
//1.声明为@Subcomponent
//2.定义子组件 factory,以便 ApplicationComponent 知道如何创建 LoginComponent 的实例。
//3.告知 Dagger LoginComponent 是 ApplicationComponent 的子组件，需以下三步:
//3.1: 创建新的 Dagger 模块（例如 SubcomponentsModule），并将子组件的类传递给注解的 subcomponents 属性。
//3.2: 将新模块（即 SubcomponentsModule）添加到 ApplicationComponent
//3.3: 在 ApplicationComponent 中提供在接口中创建 LoginComponent 实例的 factory
@ActivityScope
@Subcomponent
interface LoginComponent {
    fun inject(activity: LoginActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }
}