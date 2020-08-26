package com.ace.deni.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newsViewClick(View view){
        Intent intentDetail = new Intent(this, News_Detail_Activity.class);
        LinearLayout linearLayout = (LinearLayout)view;
        intentDetail.putExtra("News_ID", linearLayout.getId());
        startActivity(intentDetail);
    }
}
