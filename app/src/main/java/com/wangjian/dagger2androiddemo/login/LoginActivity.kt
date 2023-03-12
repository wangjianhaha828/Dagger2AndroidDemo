package com.wangjian.dagger2androiddemo.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.wangjian.dagger2androiddemo.MyApplication
import com.wangjian.dagger2androiddemo.R
import com.wangjian.dagger2androiddemo.login.fragment.LoginFragment1
import com.wangjian.dagger2androiddemo.login.fragment.LoginFragment2
import com.wangjian.dagger2androiddemo.login.sub.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    //loginViewModel是在构造器上加的Inject
    lateinit var loginComponent: LoginComponent
    @Inject
    lateinit var loginViewModel: LoginViewModel
    private var flag = true
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
        addFragment(LoginFragment1.newInstance())
        findViewById<Button>(R.id.btn_switch_fragment).setOnClickListener {
            if (flag) switchFragment(LoginFragment2.newInstance())
            else switchFragment(LoginFragment1.newInstance())
            flag = !flag
        }
    }

    //切换fragment,并添加到backStack
    private fun switchFragment(fragment: Fragment, loss: Boolean = true) {
        supportFragmentManager.beginTransaction().apply {
            addToBackStack("")
            replace(R.id.container,fragment,"")
//            commit()
            if (loss) commitAllowingStateLoss() else commit()
        }
    }

    //切换fragment,不添加到backStack
    private fun switchFragmentWithoutBack(fragment: Fragment, loss: Boolean = true) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment,"")
//            commit()
            if (loss) commitAllowingStateLoss() else commit()
        }
    }

    //添加fragment
    private fun addFragment(fragment: Fragment, loss: Boolean = true) {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.container,fragment,"")
//            add(R.id.container,fragment)
//            commit()
            if (loss) commitAllowingStateLoss() else commit()
        }
    }

}