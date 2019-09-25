package com.ghavinj.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView dName;
    private TextView dDescription;
    private TextView dRating;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        dName = (TextView)findViewById(R.id.dNameID);
        dDescription = (TextView)findViewById(R.id.dDescriptionID);
        dRating = (TextView)findViewById(R.id.dRatingID);

        if (extras != null){
            dName.setText(extras.getString("dName"));
            dDescription.setText(extras.getString("dDescription"));
            dRating.setText(extras.getString("dRating"));
        }


    }
}
