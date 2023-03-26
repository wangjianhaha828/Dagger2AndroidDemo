package com.wangjian.annotation_sample.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.wangjian.annotation_sample.R
import com.wangjian.annotation_sample.data.BaseData
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import javax.inject.Named


class Scope2Activity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
    @Inject
    @Named("Scope2Data")
    lateinit var baseData: BaseData
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope2)
        findViewById<Button>(R.id.btn_get_data).setOnClickListener {
            Log.d("TAG", baseData.getData())
        }
        supportFragmentManager.beginTransaction().add(R.id.container, Scope2Fragment.newInstance())
            .commit()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}