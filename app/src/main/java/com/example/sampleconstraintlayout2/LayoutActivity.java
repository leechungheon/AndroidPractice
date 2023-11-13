package com.example.sampleconstraintlayout2;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout=new LinearLayout(this);//new 연산자로 linear레이아웃 만들고
        mainLayout.setOrientation(LinearLayout.VERTICAL);//방향 설정

        LinearLayout.LayoutParams params=
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );//new 연산자로 레이아웃 안에 추가될 뷰들에 설정한 파라미터(매개변수) 생성

        Button button1=new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);
        setContentView(R.layout.activity_main);//xml 파일을 파라미터로 전달하면 레이아웃 파일이 액티비티 파일과 연결됨.
    }


}