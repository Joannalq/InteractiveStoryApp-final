package com.example.joanna.interactivestoryapp.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joanna.interactivestoryapp.R;
import com.example.joanna.interactivestoryapp.model.Page;
import com.example.joanna.interactivestoryapp.model.Story;

public class StoryActivity extends AppCompatActivity {
    private static final String TAG=StoryActivity.class.getSimpleName();
    private Story story;
    private ImageView storyImageView;
    private TextView storyTextView;
    private Button choice1Button;
    private Button choice2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        storyImageView=(ImageView)findViewById(R.id.storyImageView);
        storyTextView=(TextView) findViewById(R.id.storyTextView);
        choice1Button=(Button)findViewById(R.id.choice1Button);
        choice2Button=(Button)findViewById(R.id.choice2Button);

        //get data
        Intent intent=getIntent();
        String name=intent.getStringExtra(getString(R.string.Key_name));
        if(name==null||name.isEmpty()){
            name="name is empty";
        }
        Log.d(TAG,name);
        story=new Story();
        loadPage(0);
    }

    private void loadPage(int pageNo) {
        Page page=story.getPage(pageNo);
        Drawable image= ContextCompat.getDrawable(this,page.getImageId());
        storyImageView.setImageDrawable(image);
    }
}
