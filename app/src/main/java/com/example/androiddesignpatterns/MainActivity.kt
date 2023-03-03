package com.example.androiddesignpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddesignpatterns.creationalDesignPatterns.AlterDialogBuilderDP

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //This is a simple Builder Design patter
        AlterDialogBuilderDP.Builder().setTitle("This is a sample title").setContent("This is a sample content").create()


    }
}