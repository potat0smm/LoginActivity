package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(),FragmentNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportFragmentManager.beginTransaction()
            .add(R.id.container,LoginFragment())
            .commit()

    }

    override fun navigateFrag(fragment: Fragment, addToStack: Boolean) {
        var transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,fragment)

        if(addToStack){
            transaction.addToBackStack(null)
        }
        transaction.commit()
        }
}