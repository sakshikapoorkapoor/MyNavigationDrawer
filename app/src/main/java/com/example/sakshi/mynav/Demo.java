package com.example.sakshi.mynav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        for(int i=0;i<10;i++)
        {
            Log.e("print","0"+i)
        }
    }
}
