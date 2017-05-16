package com.example.joanna.interactivestoryapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText nameEdit;
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdit=(EditText)findViewById(R.id.nameEditText);
        startButton=(Button)findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameEdit.getText().toString();
                // Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
                storyActivity(name);
            }
        });
    }

    private void storyActivity(String name) {
        Intent intent=new Intent(this,StoryActivity.class);
        Resources resources=getResources();
        String key=resources.getString(R.string.Key_name);
        intent.putExtra(key,name);
        startActivity(intent);
    }
}

