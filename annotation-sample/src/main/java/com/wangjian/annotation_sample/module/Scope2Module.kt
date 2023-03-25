package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.data.BaseData
import com.wangjian.annotation_sample.data.Scope2Data
import dagger.Binds
import dagger.Module

@Module
abstract class Scope2Module {
    @Binds
    abstract fun bindScope2Data(scope2Data: Scope2Data): BaseData
}