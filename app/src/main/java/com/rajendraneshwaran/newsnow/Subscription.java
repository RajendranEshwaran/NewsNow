package com.rajendraneshwaran.newsnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rajendraneshwaran.newsnow.view.Home;

public class Subscription extends Home {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        initToolbar(R.id.toolbar_head);
    }
}
