package com.rajendraneshwaran.newsnow.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rajendraneshwaran.newsnow.R;
import com.rajendraneshwaran.newsnow.Your_Location;
import com.rajendraneshwaran.newsnow.util.SlideTranslation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Home extends AppCompatActivity {

    private TextView backTxt;
    private Button susBtn;
    private TextView loginTxt;
    private TextView notnowTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initToolbar(R.id.toolbar_head);

        susBtn = (Button)findViewById(R.id.subBtn);
        loginTxt = (TextView)findViewById(R.id.loginTxt);
        notnowTxt = (TextView)findViewById(R.id.notnowTxt);



    }

    public void subscribeMethod(View view)
    {
//        startActivity(new Intent(this, Subscription.class));
//        this.overridePendingTransition(R.anim.anim_slide_in_left,
//                R.anim.anim_slide_out_left);

        startActivity(new Intent(this, Your_Location.class));
        this.overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_left);
    }

    public void loginMethod(View view)
    {

    }

    public void notnowMethod(View view)
    {

    }

    public void initToolbar(int toolbarId)
    {
        Toolbar myToolbar = (Toolbar) findViewById(toolbarId);
        setSupportActionBar(myToolbar);

        backTxt = (TextView)findViewById(R.id.txt_back);
        backTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.anim_slide_in_right,
                        R.anim.anim_slide_out_right);
            }
        });
    }
}
