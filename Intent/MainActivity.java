package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
    }
    public void Click(View view){
    Intent i = new Intent(this, MainActivity2.class);
    i.putExtra("name","Shirin");
    i.putExtra("name1","Shamla");
    startActivity(i);
    }
}
