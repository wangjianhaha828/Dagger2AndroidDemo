package com.wangjian.dagger_scope_sample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.wangjian.dagger_scope_sample.R
import com.wangjian.dagger_scope_sample.component.DaggerScope1ActivityComponent
import com.wangjian.dagger_scope_sample.data.ApplicationUserData
import javax.inject.Inject

class Scope2Activity : AppCompatActivity() {
    @Inject
    lateinit var applicationUserData1: ApplicationUserData
    @Inject
    lateinit var applicationUserData2: ApplicationUserData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope2)
        (applicationContext as MyApplication).scope1ActivityComponent.inject(this)
        findViewById<Button>(R.id.btn_get_data_application).setOnClickListener{
            Log.d("TAG",applicationUserData1.toString())
            Log.d("TAG",applicationUserData2.toString())
        }

    }
}