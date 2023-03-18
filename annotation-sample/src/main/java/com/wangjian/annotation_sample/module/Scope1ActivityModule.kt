package com.wangjian.annotation_sample.module

import com.wangjian.annotation_sample.activity.Scope1Activity
import com.wangjian.annotation_sample.component.Scope1ActivitySubcomponent
import com.wangjian.annotation_sample.data.BaseData
import com.wangjian.annotation_sample.data.Scope1Data
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

//这个Module只负责与applicationComponent关联，一般不负责提供数据
@Module(subcomponents = [Scope1ActivitySubcomponent::class])
abstract class Scope1ActivityModule {
    //将Scope1ActivitySubcomponent.Factory与ApplicationComponent绑定
    @Binds
    @IntoMap
    @ClassKey(Scope1Activity::class)
    abstract fun bindYourAndroidInjectorFactory(factory: Scope1ActivitySubcomponent.Factory):AndroidInjector.Factory<*>
}