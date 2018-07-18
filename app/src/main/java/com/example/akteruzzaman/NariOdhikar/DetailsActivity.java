package com.example.akteruzzaman.NariOdhikar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textView=findViewById(R.id.detailsText);
        Intent intent=getIntent();
        textView.setText(intent.getExtras().getString("detail"));
        String title= (String) getIntent().getExtras().get("title");

        getSupportActionBar().setTitle(title);


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
        {
            DetailsActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
