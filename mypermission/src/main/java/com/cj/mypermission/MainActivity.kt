package com.cj.mypermission

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.cj.mypermissionx.PermissionX
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        if(ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) !=
//                PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE),1)
//        }else{
//            call()
//        }
        btn.setOnClickListener {
            PermissionX.request(this,Manifest.permission.CALL_PHONE
              ,Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_CONTACTS){
                allGranted,deniedList->
                if (allGranted){
                    call()
                }else{
                    Toast.makeText(this,"you denied $deniedList ",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        when(requestCode){
//            1->{
//                if(grantResults.isNotEmpty() &&
//                        grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    call()
//                }else{
//                    Toast.makeText(this,"denied ",Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
    private fun call(){
        try {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:10086")
            startActivity(intent)
        }catch (e:SecurityException){
            e.printStackTrace()
        }
    }
}
