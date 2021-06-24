package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity
{
    private String name;
    private int image;
    private String details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novel_detailed_view);

        TextView nameTextView = (TextView) findViewById(R.id.novelnamedescription);
        ImageView imageView = (ImageView) findViewById(R.id.novelimagedescription);
        TextView detailsTextView = (TextView) findViewById(R.id.descriptiontextview);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", 0);
        details = intent.getStringExtra("info" );

        nameTextView.setText(name);
        imageView.setImageResource(image);
        detailsTextView.setText(details);
    }
}
