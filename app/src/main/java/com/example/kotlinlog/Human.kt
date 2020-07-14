package com.example.kotlinlog

class Human: Animal, Thinkable {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
        this.name = name
        this.age = age
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
    }

        val hobby: String = "プログラミング"

        // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える")
    }
}