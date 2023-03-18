package com.wangjian.dagger_scope_sample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.wangjian.dagger_scope_sample.R
import com.wangjian.dagger_scope_sample.component.DaggerScope1ActivityComponent
import com.wangjian.dagger_scope_sample.data.ActivityUserData
import com.wangjian.dagger_scope_sample.data.ApplicationUserData
import com.wangjian.dagger_scope_sample.data.SingletonUserData
import com.wangjian.dagger_scope_sample.data.UserData
import javax.inject.Inject

class Scope2Activity : AppCompatActivity() {
    @Inject
    lateinit var userData1: UserData
    @Inject
    lateinit var userData2: UserData
    @Inject
    lateinit var activityUserData1: ActivityUserData
    @Inject
    lateinit var activityUserData2: ActivityUserData
    @Inject
    lateinit var singletonUserData1: SingletonUserData
    @Inject
    lateinit var singletonUserData2: SingletonUserData
    @Inject
    lateinit var applicationUserData1: ApplicationUserData
    @Inject
    lateinit var applicationUserData2: ApplicationUserData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope2)
        (applicationContext as MyApplication).scope1ActivityComponent.inject(this)
        findViewById<Button>(R.id.btn_get_data).setOnClickListener{
            Log.d("TAG",userData1.toString())
            Log.d("TAG",userData2.toString())
        }
        findViewById<Button>(R.id.btn_get_data_activity).setOnClickListener{
            Log.d("TAG",activityUserData1.toString())
            Log.d("TAG",activityUserData2.toString())
        }
        findViewById<Button>(R.id.btn_get_data_singleton).setOnClickListener {
            Log.d("TAG",singletonUserData1.toString())
            Log.d("TAG",singletonUserData1.toString())
        }
        findViewById<Button>(R.id.btn_get_data_application).setOnClickListener{
            Log.d("TAG",applicationUserData1.toString())
            Log.d("TAG",applicationUserData2.toString())
        }

    }
}