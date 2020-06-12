package jp.techacademy.eriko.fujita


import android.util.Log


open class Dog: Animal, Movable {



    // 引数付きコントラクタ
    constructor(name: String, age: Int): super(name, age){
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableのインターフェースのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}

