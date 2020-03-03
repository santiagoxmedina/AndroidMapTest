package com.sanmed.maptests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpenMap = findViewById(R.id.btn_open_map);
        btnOpenMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_open_map){
            OpenMap();
        }
    }

    private void OpenMap() {
        ActivityNavigator activityNavigator = new ActivityNavigator(this);
        activityNavigator.navigate(activityNavigator.createDestination().setIntent(new Intent(this, GoogleMapsActivity.class)), null, null, null);
    }
}
