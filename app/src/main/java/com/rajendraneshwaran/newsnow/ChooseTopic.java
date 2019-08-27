package com.rajendraneshwaran.newsnow;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.rajendraneshwaran.newsnow.model.TopicInfo;
import com.rajendraneshwaran.newsnow.viewmodel.TopicAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChooseTopic extends Activity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topic);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.topic_recycler_view);
        recyclerView.setHasFixedSize(false);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<TopicInfo> gaggeredList = getListItemData();

        TopicAdapter rcAdapter = new TopicAdapter(ChooseTopic.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    private List<TopicInfo> getListItemData(){
        List<TopicInfo> listViewItems = new ArrayList<TopicInfo>();
        listViewItems.add(new TopicInfo("Politics", R.drawable.politics));
        listViewItems.add(new TopicInfo("Stocks", R.drawable.stocks));
        listViewItems.add(new TopicInfo("E-Market", R.drawable.emarket));
        listViewItems.add(new TopicInfo("Entertainment", R.drawable.movies));
        listViewItems.add(new TopicInfo("Sports", R.drawable.actress));
        listViewItems.add(new TopicInfo("Organization", R.drawable.organization));
        listViewItems.add(new TopicInfo("Science", R.drawable.science));
        listViewItems.add(new TopicInfo("Games", R.drawable.game));
        listViewItems.add(new TopicInfo("Fitness", R.drawable.fitness));
        listViewItems.add(new TopicInfo("Actor", R.drawable.game));
        listViewItems.add(new TopicInfo("Actress", R.drawable.actress));
        listViewItems.add(new TopicInfo("Astrology", R.drawable.astro));
        listViewItems.add(new TopicInfo("Sci-Fi", R.drawable.science2));

        return listViewItems;
    }
}
