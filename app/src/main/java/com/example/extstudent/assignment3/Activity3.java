package com.example.extstudent.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity3 extends AppCompatActivity {

    private Button buttonHome = null;
    private Button Activity2Button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        this.buttonHome = (Button)findViewById(R.id.buttonHome);
        this.buttonHome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, com.example.extstudent.assignment3.MainActivity.class);
                startActivity(intent);
            }
        }  );
        this.Activity2Button = (Button)findViewById(R.id.Activity2Button);
        this.Activity2Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, com.example.extstudent.assignment3.Activity2.class);
                startActivity(intent);
            }
        }  );
    }
}
