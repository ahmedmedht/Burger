package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class open extends AppCompatActivity {
    private TextView phon,namee;
    private View backgroundimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        backgroundimage =findViewById(R.id.background2);
        Drawable drawable=backgroundimage.getBackground();
        drawable.setAlpha(80);


        phon=findViewById(R.id.phoneview);
        namee=findViewById(R.id.nameview);


        Intent i=getIntent();
        String nam=i.getStringExtra("name");
        String ph=i.getStringExtra("phone");

        namee.setText(nam);
        phon.setText(ph);


    }

    public void openmenu(View view) {
        Intent i=new Intent(open.this,Menu.class);
        startActivity(i);
    }

    public void back(View view) {
        Intent i=new Intent(open.this,MainActivity.class);
        startActivity(i);
    }
}