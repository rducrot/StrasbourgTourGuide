package com.example.android.strasbourgtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailsActivity extends AppCompatActivity {

    public static final String PLACE_NAME = "PLACE_NAME";
    public static final String PLACE_ADDRESS = "PLACE_ADDRESS";
    public static final String PLACE_DESCRIPTION = "PLACE_DESCRIPTION";
    public static final String PLACE_IMAGE = "PLACE_IMAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        Intent intent = getIntent();

        final String placeName = intent.getStringExtra(PLACE_NAME);
        final String placeAddress = intent.getStringExtra(PLACE_ADDRESS);
        final String placeDescription = intent.getStringExtra(PLACE_DESCRIPTION);
        final int placeImage = intent.getIntExtra(PLACE_IMAGE, 0);

        TextView placeNameView = findViewById(R.id.place_details_name);
        TextView placeAddressView = findViewById(R.id.place_details_address);
        TextView placeDescriptionView = findViewById(R.id.place_details_description);
        ImageView placeImageView = findViewById(R.id.place_details_image);

        placeNameView.setText(placeName);
        placeAddressView.setText(placeAddress);
        placeDescriptionView.setText(placeDescription);
        placeImageView.setImageResource(placeImage);

    }

}
