package com.example.h.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String  TAG = MainActivity.class.getSimpleName();
    private Button bntTest1,bntTest2,bntTest3,bntTest4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bntTest1 = (Button) findViewById(R.id.bnt_test1);
        bntTest2 = (Button) findViewById(R.id.bnt_test2);
        bntTest3 = (Button) findViewById(R.id.bnt_test3);
        bntTest4 = (Button) findViewById(R.id.bnt_test4);

        bntTest1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG,"--bntTest1--onOnLongClick()触发----");
                return false;
            }
        });
        bntTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"--bntTest1---onClick()触发----");
            }
        });
        bntTest1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               // Log.e(TAG,"--bntTest1---MotionEvent触发----"+event.getAction());
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--bntTest1---MotionEvent.ACTION_DOWN:触发----");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--bntTest1---MotionEvent.ACTION_UP:触发----");
                        break;
                }
                return false;
            }
        });


        bntTest2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG,"--bntTest2--onOnLongClick()触发----");
                return false;
            }
        });
        bntTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"--bntTest2---onClick()触发----");
            }
        });
        bntTest2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--bntTest2---MotionEvent.ACTION_DOWN:触发----");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--bntTest2---MotionEvent.ACTION_UP:触发----");
                        break;
                }
                return true;
            }
        });

        bntTest3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG,"--bntTest3--onOnLongClick()触发----");
                return false;
            }
        });
        bntTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"--bntTest3---onClick()触发----");
            }
        });
        bntTest3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--bntTest3---MotionEvent.ACTION_DOWN:触发----");
                        return true;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--bntTest3---MotionEvent.ACTION_UP:触发----");
                       return false;
                }
                return false;
            }

        });

        bntTest4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG,"--bntTest4--onOnLongClick()触发----");
                return false;
            }
        });
        bntTest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"--bntTest4---onClick()触发----");
            }
        });
        bntTest4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--bntTest4---MotionEvent.ACTION_DOWN:触发----");
                      return false;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--bntTest4---MotionEvent.ACTION_UP:触发----");
                       return true;
                }
                return false;
            }
        });
    }
}
