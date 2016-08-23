package jp.techacademy.tanaka.yousuke.javalog;

import android.util.Log;

//class Dog {
//    // 変数
//    String name;      // 名前
//    int age;    // 年齢
//
//    // コンストラクタ
//    public Dog() {
//        name = "";
//        age = 0;
//    }
//
//    // 引数付きコンストラクタ
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // メソッド
//    public void say() {
//        Log.d("javatest", "ワンワン");
//    }
//}






//class Dog {
//    // クラス変数
//    static String to_jp = "犬";
//
//    // メンバ変数
//    String name;  // 名前
//    int age;    // 年齢
//
//    // コンストラクタ
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // クラス関数
//    public static void introduce() {
//        Log.d("javatest", "これは犬クラスです。");
//    }
//
//    // メンバ関数
//    public void say() {
//        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
//    }
//}



// [8. 抽象クラス：継承]
//class Dog extends Animal {
//    // クラス変数
//    static String to_jp = "犬";
//
//    // コンストラクタ
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // クラス関数
//    public static void introduce() {
//        Log.d("javatest", "これは犬クラスです。");
//    }
//
//    // メンバ関数
//    public void say() {
//        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
//    }
//}



// [インターフェース]
class Dog extends Animal implements Movable {
    // クラス変数
    static String to_jp = "犬";

    // コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}