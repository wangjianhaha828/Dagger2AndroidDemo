package com.wangjian.dagger2androiddemo.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wangjian.dagger2androiddemo.MyApplication
import com.wangjian.dagger2androiddemo.R
import com.wangjian.dagger2androiddemo.login.sub.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    //loginViewModel是在构造器上加的Inject
    lateinit var loginComponent: LoginComponent
    @Inject
    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        (applicationContext as MyApplication).appComponent.inject(this)
        //LoginComponent 是在 activity 的 onCreate() 方法中创建的，将随着 activity 的销毁而被隐式销毁。
        loginComponent = (applicationContext as MyApplication)
            .appComponent.loginComponent().create()
        loginComponent.inject(this)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            loginViewModel.login()
        }
        findViewById<Button>(R.id.btn_get_data).setOnClickListener {
            loginViewModel.getData()
        }
    }
}