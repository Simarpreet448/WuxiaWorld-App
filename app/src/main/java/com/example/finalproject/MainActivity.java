package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        progress = new ProgressDialog(MainActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickText(View view)
    {
                progress.setMessage("Please Wait Loading...");
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.setIndeterminate(true);
                progress.show();
        new Thread()
        {
            public void run()
            {
                Intent categoryListActivity = new Intent(MainActivity.this, SecondActivity.class);
                switch (view.getId())
                {
                    case R.id.wuxiatextview:
                        categoryListActivity.putExtra("Genre", "Wuxia (Martial Heroes)");
                        break;
                    case R.id.xianxiatextview:
                        categoryListActivity.putExtra("Genre", "Xianxia (Immortal Heroes)");
                        break;
                    case R.id.xuanhuantextview:
                        categoryListActivity.putExtra("Genre", "Xuanhuan (Mysterious Fantasy)");
                        break;
                }
                startActivity(categoryListActivity);
                progress.dismiss();
            }
        }.start();
    }
}