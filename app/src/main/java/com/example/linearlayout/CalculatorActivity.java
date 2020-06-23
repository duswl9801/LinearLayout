package com.example.linearlayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    //savedInstanceState는 액티비티의 이전 저장 상태가 포함된 번들 객체. 처음 생성된 액티비티인 경우 Bundle 객체의 값은 null이다.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 레이아웃 xml파일을 불러오는 함수
        setContentView(R.layout.activity_calculator);
    }



}
