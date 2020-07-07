package com.example.testgdrive;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView lampu1;
    Button on1,off1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lampu1 = findViewById(R.id.lampu);
        on1 = findViewById(R.id.lampuBtnOn);
        off1 = findViewById(R.id.lampuBtnOff);

        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off1.setVisibility(View.INVISIBLE);
                on1.setVisibility(View.VISIBLE);
                on1.setText("ON");
                lampu1.setImageDrawable(getDrawable(R.drawable.lampumati));
            }
        });

        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on1.setVisibility(View.INVISIBLE);
                off1.setVisibility(View.VISIBLE);
                lampu1.setImageDrawable(getDrawable(R.drawable.lampuhidup));
            }
        });


    }
}


