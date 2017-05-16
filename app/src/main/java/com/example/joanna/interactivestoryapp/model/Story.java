package com.example.joanna.interactivestoryapp.model;


import com.example.joanna.interactivestoryapp.R;

public class Story {
    private Page[] pages;

    public Story(){
        pages=new Page[7];
        pages[0]=new Page(R.drawable.page0,R.string.page0,
                new Choice(R.string.page0_choice1,1),
                new Choice(R.string.page0_choice2,2));
    }
}
