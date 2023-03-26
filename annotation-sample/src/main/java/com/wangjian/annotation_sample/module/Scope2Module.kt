package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.data.BaseData
import com.wangjian.annotation_sample.data.Scope2Data
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class Scope2Module {
    @Named("Scope2Data")
    @Binds
    abstract fun bindScope2Data(scope2Data: Scope2Data): BaseData
}