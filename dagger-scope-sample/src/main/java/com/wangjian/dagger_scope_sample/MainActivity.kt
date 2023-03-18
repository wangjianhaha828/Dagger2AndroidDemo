package com.wangjian.dagger_scope_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wangjian.dagger_scope_sample.activity.Scope1Activity
import com.wangjian.dagger_scope_sample.activity.Scope2Activity
import com.wangjian.dagger_scope_sample.activity.Scope3Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_to_scope1).setOnClickListener {
            startActivity(Intent(this, Scope1Activity::class.java))
        }
        findViewById<Button>(R.id.btn_to_scope2).setOnClickListener {
            startActivity(Intent(this, Scope2Activity::class.java))
        }
        findViewById<Button>(R.id.btn_to_scope3).setOnClickListener {
            startActivity(Intent(this, Scope3Activity::class.java))
        }
    }
}