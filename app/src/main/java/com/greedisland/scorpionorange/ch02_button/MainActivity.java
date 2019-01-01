package com.greedisland.scorpionorange.ch02_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 30;

    public void bigger(View v){
        TextView txv = findViewById(R.id.txv);
        txv.setTextSize(++size);
    }

    public void smaller(View v){
        if(size > 10){
            TextView txv = findViewById(R.id.txv);
            txv.setTextSize(--size);
        }
    }

}
