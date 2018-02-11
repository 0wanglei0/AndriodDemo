package com.demo.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.redButton);
        //给btn1绑定监听事件
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent = new Intent(MainActivity.this, MainActivityB.class);
//                Intent intent = new Intent();
//                startActivity(intent);
                //启动
                startActivityForResult(intent, 1000);
            }
        });
    }

    @Override
    //重写了onAcitivityResult
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        Button btn1 = (Button) findViewById(R.id.redButton);
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000 && resultCode == 1001)
        {
            String result = data.getStringExtra("color");
            //btn1.setBackgroundColor(Color.parseColor(result));
        }
    }
}
