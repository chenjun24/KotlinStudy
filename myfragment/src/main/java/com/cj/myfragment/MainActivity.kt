package com.cj.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.cj.myfragment.fragment.Fragment1
import com.cj.myfragment.fragment.Fragment2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
        val fragment1 = Fragment1()
        val fragment2 = Fragment2()
        btn.setOnClickListener{
            Log.d(TAG,"onclick")
            replaceFragment(fragment2)
        }
      //  "heheh".len() 扩展函数
        replaceFragment(fragment1)
    }
    private fun replaceFragment(fragment: Fragment){
        Log.d(TAG,"replaceFragment")
        val action = supportFragmentManager.beginTransaction()
        action.addToBackStack(null)
        action.replace(R.id.fl_content,fragment)
        action.commit()
    }
}
