package com.kitesoft.ex25activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit= findViewById(R.id.edit);
    }

    public void clickBtn(View v){
        //SecondActivity에 전달할 데이터를 EditText 로 부터 얻어오기
        String s= edit.getText().toString();

        //SecondActivity를 실행할 Intent(택배기사)객체 생성
        Intent intent= new Intent(this, SecondActivity.class);

        //SecondActivity에 전달할 데이터를 택배기사(Intent) 에게 추가하기
        intent.putExtra("Name", s); // 식별자(key)와 값(value) 전달 : "Name"이라는 식별자로 String변수 s에 저장된 문자열 데이터 추가
        intent.putExtra("Age", 20); //value로 int형을 보낼수도 있음.

        startActivity(intent);

        //이 MainAtivity 종료
        finish();
    }
}
