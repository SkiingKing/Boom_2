package com.example.user.boom_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
