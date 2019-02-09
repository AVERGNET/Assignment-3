package com.example.extstudent.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivityHome2 = null;
    private Button buttonActivityHome3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonActivityHome2 = (Button)findViewById(R.id.buttonActivity2);
        this.buttonActivityHome2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.extstudent.assignment3.Activity2.class);
                startActivity(intent);
                Log.d("Testing Button 2", "Button 2 Fired");
            }
        }  );

        this.buttonActivityHome3 = (Button)findViewById(R.id.buttonActivity3);
        this.buttonActivityHome3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button 3", "Button 3 Fired");
                Intent intent = new Intent(MainActivity.this, com.example.extstudent.assignment3.Activity3.class);
                startActivity(intent);
            }
        }  );

    }
}
