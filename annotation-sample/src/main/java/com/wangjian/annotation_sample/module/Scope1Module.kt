package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.data.BaseData
import com.wangjian.annotation_sample.data.Scope1Data
import dagger.Binds
import dagger.Module

@Module
abstract class Scope1Module {
    @Binds
    abstract fun bindScope1Data(scope1Data: Scope1Data): BaseData
}