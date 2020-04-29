package com.cj.kotlinstudy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cj.kotlinstudy.utils.ActivityCollector

open class BaseActivity:AppCompatActivity() {
    private val tag = "BaseActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag,"onCreate ${javaClass.simpleName}")//javaClass表示当前实例的Class对象
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}