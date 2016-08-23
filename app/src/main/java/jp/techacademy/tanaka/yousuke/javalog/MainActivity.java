package jp.techacademy.tanaka.yousuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("田中", 31, "散歩");
        human.say();
        human.think();

    }

}





//[7.3 クラスとインスタンス]
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say();  // ポチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say();  // ハチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");





//        [7.4 メンバ変数とクラス変数、メンバ関数とクラス関数：　static]
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say();  // ポチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        Dog.introduce();
//        Log.d("javatest", Dog.to_jp + "のクラス変数です。");




//        [7.5 クラスの継承: extends]
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say();
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say();
//        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");




//        [8. 抽象クラス: abstract修飾子]
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say();
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say();
//        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");




        // [9. インタフェース]
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.move();



