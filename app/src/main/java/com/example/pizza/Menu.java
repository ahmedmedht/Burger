package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    private View backgroundimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        backgroundimage =findViewById(R.id.background3);
        Drawable drawable=backgroundimage.getBackground();
        drawable.setAlpha(80);
    }

    public void back(View view) {
        Intent i=new Intent(Menu.this,open.class);
        startActivity(i);
    }
}