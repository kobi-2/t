package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wid: TextView = findViewById(R.id.textView3)
        var hei: TextView = findViewById(R.id.textView)
        var inc: TextView = findViewById(R.id.textView2)

        var dm = DisplayMetrics ()
        windowManager.defaultDisplay.getMetrics(dm)

        var screenWidth: Int = dm.widthPixels
        var screenHeight: Int = dm.heightPixels
        var x = Math.pow(screenWidth.toDouble()/dm.xdpi, 2.0)
        var y = Math.pow(screenHeight.toDouble()/dm.xdpi, 2.0)
        var screenInch = Math.sqrt(x+y)
        screenInch = (Math.round(screenInch*10)/10).toDouble()

//        wid.text = screenWidth.toString()
        var temp = dm.widthPixels.toDouble()/dm.xdpi
        if(true){
            wid.text = temp.toInt().toString()
        }else{

        wid.text = (dm.widthPixels.toDouble()/dm.xdpi).toString()
        }
//        hei.text = screenHeight.toString()
        hei.text = (screenHeight.toDouble()/dm.xdpi).toString()
        inc.text = screenInch.toString()

    }
}