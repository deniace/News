package com.ace.deni.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class News_Detail_Activity extends AppCompatActivity {

    ImageView NewsImage;
    TextView textNewsDetail;
    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int NewsId = intent.getIntExtra("News_ID",0);

        NewsImage = findViewById(R.id.news_Image);
        textTitle= findViewById(R.id.textNewsTitle);
        textNewsDetail = findViewById(R.id.newsDetail);

        populateNews(NewsId);
     }

     private void populateNews(int NewsID){
        switch (NewsID){
            case R.id.newsMain:
                NewsImage.setImageResource(R.drawable.news_main);
                textTitle.setText(R.string.title_main);
                textNewsDetail.setText(getResources().getString(R.string.news_main));
                break;
            case R.id.news_One:
                NewsImage.setImageResource(R.drawable.image_one);
                textTitle.setText(R.string.title_one);
                textNewsDetail.setText(getResources().getString(R.string.news_one));
                break;
            case R.id.news_Two:
                NewsImage.setImageResource(R.drawable.image_two);
                textTitle.setText(R.string.title_two);
                textNewsDetail.setText(getResources().getString(R.string.news_two));
                break;
            case R.id.news_three:
                NewsImage.setImageResource(R.drawable.image_three);
                textTitle.setText(R.string.title_three);
                textNewsDetail.setText(getResources().getString(R.string.news_three));
                break;
            case R.id.news_four:
                NewsImage.setImageResource(R.drawable.image_four);
                textTitle.setText(R.string.title_four);
                textNewsDetail.setText(getResources().getString(R.string.news_four));
                break;
            case R.id.news_five:
                NewsImage.setImageResource(R.drawable.image_five);
                textTitle.setText(R.string.title_five);
                textNewsDetail.setText(getResources().getString(R.string.news_five));
                break;
        }
     }
}
