package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.data.BaseData
import com.wangjian.annotation_sample.data.Scope2Data
import com.wangjian.annotation_sample.data.Scope2DataF
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class Scope2ModuleF {
    @Named("Scope2DataF")
    @Binds
    abstract fun bindScope2Data(scope2DataF: Scope2DataF): BaseData
}