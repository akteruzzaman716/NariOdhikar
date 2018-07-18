package com.example.akteruzzaman.NariOdhikar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ContactActivity extends AppCompatActivity {

    ImageView call1, call2, call3;
    Intent callIntent;
    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        call1 = (ImageView) findViewById(R.id.callOne);
        call2 = (ImageView) findViewById(R.id.callTwo);
        call3 = (ImageView) findViewById(R.id.callThree);


        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01863690129";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
                startActivity(intent);



            }
        });


        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String number = "01770329929";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
                startActivity(intent);




            }
        });


        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "01515262127";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
                startActivity(intent);



            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
        {
            ContactActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}


