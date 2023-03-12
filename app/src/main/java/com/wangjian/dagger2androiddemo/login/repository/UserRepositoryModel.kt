package com.wangjian.dagger2androiddemo.login.repository

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModel {
    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }
}