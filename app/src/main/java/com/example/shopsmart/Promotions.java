package com.example.shopsmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Promotions extends AppCompatActivity {

    private ImageView imagePromotion;
    private TextView textPromotionDetails;
    private Button btnViewPromotions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        imagePromotion = findViewById(R.id.imagePromotion);
        textPromotionDetails = findViewById(R.id.textPromotionDetails);
        btnViewPromotions = findViewById(R.id.btnViewPromotions);

        // Display promotions details based on data

        btnViewPromotions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to a page with all promotions
            }
        });
    }
}
