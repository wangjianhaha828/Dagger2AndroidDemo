package com.wangjian.dagger_scope_sample.module

import com.wangjian.dagger_scope_sample.data.ActivityUserData
import com.wangjian.dagger_scope_sample.data.ApplicationUserData
import com.wangjian.dagger_scope_sample.data.SingletonUserData
import com.wangjian.dagger_scope_sample.data.UserData
import com.wangjian.dagger_scope_sample.scope.ScopeA
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//同一个Module可以提供不同作用域的依赖, 其中@Scope1与 @Singleton实现的效果是一致的
//全局单例和Activity单例的区别就是component在activity还是application中实例化，生命周期是多少
@Module
class Scope1ActivityModule {
    @Provides
    fun provideUserData(): UserData {
        return UserData()
    }

    @ScopeA
    @Provides
    fun provideActivityUserData(): ActivityUserData {
        return ActivityUserData()
    }

    @Singleton
    @Provides
    fun provideSingletonUserData(): SingletonUserData {
        return SingletonUserData()
    }

    @ScopeA
    @Provides
    fun provideApplicationUserData(): ApplicationUserData {
        return ApplicationUserData()
    }
}