package com.kitesoft.ex25activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //본인(SecondActivity)를 실행하기 위해 MainActivity에서 생성되어 온 Intent객체 소환
        Intent intent= getIntent();

        //MainActivity에서 Intent(택배기사)객체에게 추가(Extra)로 전달된 데이터를 식별자(key)를 통해 얻어오기
        String name= intent.getStringExtra("Name"); //MainActivity에서 intent.putExtra("Name", s);로 전달된 문자열 값 얻어오기
        int age= intent.getIntExtra("Age", 0); //'Age'식별자로 전달된 int형값 얻어오기, 2번째 파라미터[defalutValue] : 혹시 'Age'식별자로 전달된 값이 없을때의 기본값 지정

        //전달받은 값 TextView에 출력해서 확인하기
        tv= findViewById(R.id.tv);
        tv.setText(name +" , "+ age);


    }
}
