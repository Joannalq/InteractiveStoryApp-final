package com.example.joanna.interactivestoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StoryActivity extends AppCompatActivity {
    private static final String TAG=StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        //get data
        Intent intent=getIntent();
        String name=intent.getStringExtra(getString(R.string.Key_name));
        if(name==null||name.isEmpty()){
            name="name is empty";
        }
        Log.d(TAG,name);
    }
}
