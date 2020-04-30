package com.cj.mynotification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            var channelId = "chat"
            var channelName = "聊天消息"
            var importance = NotificationManager.IMPORTANCE_HIGH
            createNotificationChannel(channelId,channelName,importance)
            channelId = "subscribe"
            channelName = "订阅消息"
            importance = NotificationManager.IMPORTANCE_DEFAULT
            createNotificationChannel(channelId,channelName,importance)

        }

        btn1.setOnClickListener {
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(this,"chat").apply {
                setContentTitle("收到一条聊天消息")
                setContentText("今天中午吃什么？")
                setWhen(System.currentTimeMillis())
                setSmallIcon(R.mipmap.ic_launcher)
                setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
                setAutoCancel(true)
            }.build()
            notificationManager.notify(1,notification)
        }
       btn2.setOnClickListener {
           val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
           val notification = NotificationCompat.Builder(this,"subscribe").apply {
               setContentTitle("收到一条订阅消息")
               setContentText("地铁沿线30万商铺抢购中！")
               setWhen(System.currentTimeMillis())
               setSmallIcon(R.mipmap.ic_launcher)
               setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
               setAutoCancel(true)
           }.build()
           notificationManager.notify(1,notification)
       }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createNotificationChannel(channelId:String, channelName:String, importance:Int){
        val channel = NotificationChannel(channelId,channelName,importance)
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}
