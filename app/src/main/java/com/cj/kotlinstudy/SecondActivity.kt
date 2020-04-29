package com.cj.kotlinstudy

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    companion object{
        fun actionStart(context:Context,data1:String,data2:String){
//            val intent = Intent(context,SecondActivity::class.java)
//            intent.putExtra("p1",data1)
//            intent.putExtra("p2",data2)
            val intent = Intent(context,SecondActivity::class.java).apply {
                putExtra("p1",data1)
                putExtra("p2",data2)
            }
            context.startActivity(intent)
        }
    }
}
