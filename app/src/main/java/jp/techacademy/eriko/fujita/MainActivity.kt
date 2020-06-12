package jp.techacademy.eriko.fujita

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        val dog = Dog("ポチ", 3)

        dog.move()

*/


        val taro = Human("田中太郎", 30, "映画")
        val jiro = Human("田中次郎", 25, "写真")

        taro.say()
        taro.think()
        jiro.say()
        jiro.think()



    }


}
