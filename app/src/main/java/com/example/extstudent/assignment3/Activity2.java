package com.example.extstudent.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button buttonHome = null;
    private Button buttonActivityHome3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        this.buttonHome = (Button)findViewById(R.id.buttonHome);
        this.buttonHome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, com.example.extstudent.assignment3.MainActivity.class);
                startActivity(intent);
            }
        }  );
        this.buttonActivityHome3 = (Button)findViewById(R.id.button3);
        this.buttonActivityHome3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, com.example.extstudent.assignment3.Activity3.class);
                startActivity(intent);
            }
        }  );
    }
}
