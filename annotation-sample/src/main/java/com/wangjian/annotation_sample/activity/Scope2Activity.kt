package com.wangjian.annotation_sample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.wangjian.annotation_sample.R
import com.wangjian.annotation_sample.data.BaseData2
import dagger.android.AndroidInjection
import javax.inject.Inject

class Scope2Activity : AppCompatActivity() {
    @Inject
    lateinit var baseData: BaseData2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope2)
        AndroidInjection.inject(this)
        findViewById<Button>(R.id.btn_get_data).setOnClickListener {
            Log.d("TAG", baseData.getData())
        }

    }
}