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
    private TextView textPromotionTitle; // Added title attribute
    private TextView textPromotionValidity; // Added validity attribute
    private Button btnViewPromotions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        imagePromotion = findViewById(R.id.imagePromotion);
        textPromotionTitle = findViewById(R.id.textPromotionTitle); // Initialize title TextView
        textPromotionValidity = findViewById(R.id.textPromotionValidity); // Initialize validity TextView
        textPromotionDetails = findViewById(R.id.textPromotionDetails);
        btnViewPromotions = findViewById(R.id.btnViewPromotions);

        // Display promotions details based on data
        displayPromotionDetails();

        btnViewPromotions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to a page with all promotions
            }
        });
    }

    private void displayPromotionDetails() {
        // Dummy data for demonstration
        String promotionTitle = "50% Off on Selected Items";
        String promotionValidity = "Valid until April 30, 2024";
        String promotionDetails = "Get 50% off on selected grocery items. Hurry, limited time offer!";

        // Set promotion details to respective TextViews
        textPromotionTitle.setText(promotionTitle);
        textPromotionValidity.setText(promotionValidity);
        textPromotionDetails.setText(promotionDetails);
    }
}
