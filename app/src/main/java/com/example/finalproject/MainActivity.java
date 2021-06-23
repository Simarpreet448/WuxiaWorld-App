package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    Thread tread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        progress = new ProgressDialog(MainActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickText(View view)
    {
        final ProgressDialog dialog= ProgressDialog.show(this,"Loading", "Please wait....",true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
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
                    dialog.dismiss();
                }
                catch(Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Something went wrong. Please try again later", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }).start();
    }
}