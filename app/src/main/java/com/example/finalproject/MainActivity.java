package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void onClickWuxia(View view) {
        Intent categoryListActivity = new Intent(this, SecondActivity.class);
        categoryListActivity.putExtra("Genre", "Wuxia (Martial Heroes)");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}