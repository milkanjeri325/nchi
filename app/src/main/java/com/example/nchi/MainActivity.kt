package com.example.nchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (checkBoxtz.isChecked)textresult.text="tz:english is a problem"
        if (checkboxug.isChecked)textresult.text="ug:they try"
        if (kenyacheckbox.isChecked)textresult.text="kenya:we are the best"
    }
    fun onSelect(view:View){
        
    }
}