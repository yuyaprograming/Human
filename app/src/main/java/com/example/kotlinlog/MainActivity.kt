package com.example.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val human = Human("勇也", 23)

        human. say()
        log.d("kotolintest", "私の名前は"+ human.name + "です")

        val human = Human("プログラミング")

        human. think()
        log.d("kotlintest", "私は"+ human.name + "について考える")
}

