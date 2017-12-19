package com.example.anonymus.sthuchi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    Button chitien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setWidget();




    }


    public void setWidget(){
        toolbar = findViewById(R.id.toolbar);
        chitien = findViewById(R.id.chitien);
        chitien.setOnClickListener(this);
    }

    public void setTab(){
        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Tab 1");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.chitien:
                break;
        }
    }
}
