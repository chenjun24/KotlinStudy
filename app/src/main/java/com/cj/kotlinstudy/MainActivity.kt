package com.cj.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.cj.kotlinstudy.test.main
import com.cj.kotlinstudy.test.test
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //test()
      //  val btn:Button = findViewById(R.id.btn1)
//        btn.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(v: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//                Toast.makeText(this@MainActivity,"hello",Toast.LENGTH_LONG).show()
//            }
//        })
        btn1.setOnClickListener{

            Toast.makeText(this,"jump to second activity",Toast.LENGTH_LONG).show()


//            val intent = Intent(this,SecondActivity::class.java)
//            intent.putExtra("p1","value1")
//            intent.putExtra("p2","value2")
//            startActivity(intent)
            SecondActivity.actionStart(this,"value1","value2")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.add_item -> Toast.makeText(this,"add",Toast.LENGTH_SHORT).show()
            R.id.remove_item->Toast.makeText(this,"remove",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
