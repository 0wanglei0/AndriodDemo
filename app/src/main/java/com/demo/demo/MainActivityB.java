package com.demo.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        Intent intent =getIntent();
        TextView btn1 = (TextView) findViewById(R.id.backButton);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityB.this, MainActivity.class);
                //将text框中的值传入
                intent.putExtra("color", "blue");
                setResult(1001, intent);
                //    结束当前这个Activity对象的生命
                finish();

                //SecondActivity.this.finish();
            }
        });
    }
}
