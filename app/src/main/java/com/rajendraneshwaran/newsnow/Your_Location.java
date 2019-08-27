package com.rajendraneshwaran.newsnow;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.rajendraneshwaran.newsnow.model.countryinfo;
import com.rajendraneshwaran.newsnow.viewmodel.CountryAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import static android.content.ContentValues.TAG;

public class Your_Location extends Activity {


    private CountryAdapter adapter;
    private ListView listView;
    private ProgressDialog dialog;
    private ArrayList<String> countries;
    private TextView currLocTxt;

    private int pageCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your__location);


        listView = (ListView) findViewById(R.id.countryList);
        currLocTxt = (TextView)findViewById(R.id.currentLocTxt);

        setListViewAdapter();
        listView.setOnScrollListener(onScrollListener());


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                currLocTxt.setText("");

                String text = parent.getItemAtPosition(position).toString();
                currLocTxt.setText(text);
            }
        });
    }


    private void setListViewAdapter() {

        Locale[] locales = Locale.getAvailableLocales();
         countries = new ArrayList<String>();
        for (Locale locale : locales) {
            String country = locale.getDisplayCountry();
            if (country.trim().length()>0 && !countries.contains(country)) {
                countries.add(country);
            }
        }
        Collections.sort(countries);
        for (String country : countries) {
            //System.out.println(country);
            // sorting countries name
        }


        adapter = new CountryAdapter(this, R.layout.country_item_listview, R.id.country_name, countries);
        listView.setAdapter(adapter);
    }

    private AbsListView.OnScrollListener onScrollListener() {
        return new AbsListView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                int threshold = 1;
                int count = listView.getCount();

                if (scrollState == SCROLL_STATE_IDLE) {
                    if (listView.getLastVisiblePosition() >= count - threshold && pageCount < 2) {
                       // Log.i(TAG, "loading more data");
                        // Execute LoadMoreDataTask AsyncTask
                        //getDataFromUrl(url_page2);
                    }
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                                 int totalItemCount) {
            }

        };
    }
}
