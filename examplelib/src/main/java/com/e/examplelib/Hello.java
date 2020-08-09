package com.e.examplelib;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    Button btnNext;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        btnNext = findViewById(R.id.next);
        next(context, btnNext, MainActivity.class);

    }

    public void next(Context c, Button btn, final Class<? extends Activity> activity){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, activity));
            }
        });
    }
}
