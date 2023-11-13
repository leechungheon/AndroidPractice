package com.example.sampleconstraintlayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//xml 파일을 파라미터로 전달하면 레이아웃 파일이 액티비티 파일과 연결됨.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}