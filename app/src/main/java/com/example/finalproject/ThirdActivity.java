package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity
{
    private String name;
    private int image;
    private String details;
    private int genre;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novel_detailed_view);

        TextView nameTextView = (TextView) findViewById(R.id.novelnamedescription);
        ImageView imageView = (ImageView) findViewById(R.id.novelimagedescription);
        TextView detailsTextView = (TextView) findViewById(R.id.descriptiontextview);
        TextView genreTextView = (TextView) findViewById(R.id.genretextview);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", 0);
        details = intent.getStringExtra("info" );
        genre = intent.getIntExtra("genre",0);

        nameTextView.setText(name);
        imageView.setImageResource(image);
        detailsTextView.setText(details);
        if(genre == R.string.xianxiaimmortalheroes)
        {
            genreTextView.setText(R.string.xianxiaimmortalheroes);
        }
        else if(genre == R.string.Wuxiamartialheroes)
        {
            genreTextView.setText(R.string.xianxiaimmortalheroes);
        }
        else
        {
            genreTextView.setText(R.string.xuanhuanmysteriousfantasy);
        }

    }
    public void Notmuch(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(),"Sorry! the app does not have the novel chapters yet.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
