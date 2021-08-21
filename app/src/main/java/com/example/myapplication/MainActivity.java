package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        LinearLayout layout = new LinearLayout(this);
//        super.setContentView(layout);
//        layout.setOrientation(LinearLayout.VERTICAL);
//        final TextView show =new TextView(this);
//        Button bn = new Button(this);
//        bn.setText(R.string.app_name);
//        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
//        layout.addView(show);
//        layout.addView(bn);
//        bn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)this.findViewById(R.id.textView);
        tv.setId(R.id.textView2);
        tv.setText("你好，世界");
        tv.setSaveEnabled(false);
    }
}