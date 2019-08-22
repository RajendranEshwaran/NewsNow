package com.rajendraneshwaran.newsnow.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rajendraneshwaran.newsnow.R;

public class Subscription extends Home {


    private Button sub1;
    private Button sub2;
    private Button sub3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        initToolbar(R.id.toolbar_head);

        initUI();

    }

    private void initUI()
    {
        sub1 = (Button)findViewById(R.id.sub1Btn);
        sub1 = (Button)findViewById(R.id.sub1Btn);
        sub1 = (Button)findViewById(R.id.sub1Btn);

    }
    public void getSub1(View view)
    {
        startActivity(new Intent(this,YourAlert.class));
        this.overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_left);
    }
    public void getSub2(View view)
    {

    }
    public void getSub3(View view)
    {

    }

}
