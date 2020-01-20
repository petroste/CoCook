package com.example.mik.hackathon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Search extends AppCompatActivity {
    private Spinner spinner1;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //Start your second activity
                String s = String.valueOf(spinner1.getSelectedItem());
                if(s == "Europe") {
                    Intent intent = new Intent(Search.this, Europe.class);
                    startActivity(intent);
                }
                else {
                }
            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(Search.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.navigation_search:

                        break;

                    case R.id.navigation_upload:
                        Intent intent2 = new Intent(Search.this, Upload.class);
                        startActivity(intent2);
                        break;

        }
return false;
    }
});}}
