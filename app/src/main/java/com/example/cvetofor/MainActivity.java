package com.example.cvetofor;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonPurple(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.purple_200));
    }
    public void onButtonBlack(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.black));
    }
    public void onButtonWhite(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.white));
    }
}