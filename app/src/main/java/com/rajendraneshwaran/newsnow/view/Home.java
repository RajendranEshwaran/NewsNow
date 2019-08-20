package com.rajendraneshwaran.newsnow.view;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rajendraneshwaran.newsnow.R;
import com.rajendraneshwaran.newsnow.Subscription;

public class Home extends AppCompatActivity {

    private TextView backTxt;
    private Button susBtn;
    private TextView loginTxt;
    private TextView notnowTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // initToolbar(R.id.toolbar_head);

        susBtn = (Button)findViewById(R.id.subBtn);
        loginTxt = (TextView)findViewById(R.id.loginTxt);
        notnowTxt = (TextView)findViewById(R.id.notnowTxt);

    }

    public void subscribeMethod(View view)
    {
        startActivity(new Intent(this, Subscription.class));
        overridePendingTransition(R.anim.slide_left,  R.anim.slide_right);
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
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        backTxt = (TextView)findViewById(R.id.txt_back);
        backTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,Subscription.class);
                startActivity(intent);
            }
        });
    }
}
