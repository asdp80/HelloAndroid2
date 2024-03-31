package com.example.helloandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //버튼 클릭 시 작동하길 원하는 이벤트를 onClick() 안에 입력한다.
    @SuppressLint("MissingInflatedId")

            //버튼 변수 선언
    Button btnnaver, btngoogle, btndaum, btnyoutube, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//변수에 버튼 박스 대입
        btnnaver = (Button) findViewById(R.id.btnnaver);
        btngoogle = (Button) findViewById(R.id.btngoogle);
        btndaum = (Button) findViewById(R.id.btndaum);
        btnyoutube = (Button) findViewById(R.id.btnyoutube);
        btnexit = (Button) findViewById(R.id.btnexit);
//버튼 색깔
        btnnaver.setBackgroundColor(Color.GREEN);
        btngoogle.setBackgroundColor(Color.BLUE);
        btndaum.setBackgroundColor(Color.YELLOW);
        btnyoutube.setBackgroundColor(Color.LTGRAY);
        btnexit.setBackgroundColor(Color.WHITE);

        //글씨 색깔
        btnnaver.setTextColor(Color.BLACK);
        btngoogle.setTextColor(Color.BLACK);
        btndaum.setTextColor(Color.BLACK);
        btnyoutube.setTextColor(Color.BLACK);
        btnexit.setTextColor(Color.BLACK);

        btnnaver.setOnClickListener(new View.OnClickListener() {
            @Override
            //클릭 시 연결되는 사이트
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"));
                startActivity(mIntent);
            }
        });
        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(mIntent);

            }
        });
        btndaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daum.com"));
                startActivity(mIntent);

            }
        });
        btnyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
                startActivity(mIntent);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    /*
    //전역변수 버튼 생성
            Button button1 = (Button) findViewById(R.id.button1);
    Button button2 = (Button) findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //상단바에 이미지 삽입
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.jieun);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼을 눌렀다", Toast.LENGTH_SHORT).show();
            }
        });

    }

     */
    }
}