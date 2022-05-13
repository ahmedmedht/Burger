package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View backgroundimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundimage =findViewById(R.id.background);
        Drawable drawable=backgroundimage.getBackground();
        drawable.setAlpha(80);

    }

    public void donebtn1(View view) {
        Intent i=new Intent(MainActivity.this,open.class);
        String namee="ali mohamed said",phone="01000948603";
        i.putExtra("name",namee);
        i.putExtra("phone",phone);
        startActivity(i);


    }

    public void donebtn2(View view) {
        Intent i=new Intent(MainActivity.this,open.class);
        String namee="ahmed mohamed ahmed",phone="01022543244";
        i.putExtra("name",namee);
        i.putExtra("phone",phone);
        startActivity(i);
    }

    public void donebtn3(View view) {
        Intent i=new Intent(MainActivity.this,open.class);
        String namee="mohamed mohamed magdy",phone="01110658543";
        i.putExtra("name",namee);
        i.putExtra("phone",phone);
        startActivity(i);
    }

    public void donebtn4(View view) {
        Intent i=new Intent(MainActivity.this,open.class);
        String namee="omar mohamed elsaid",phone="01202948603";
        i.putExtra("name",namee);
        i.putExtra("phone",phone);
        startActivity(i);
    }
}