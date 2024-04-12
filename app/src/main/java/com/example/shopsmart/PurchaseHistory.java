package com.example.shopsmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PurchaseHistory extends AppCompatActivity {

    private TextView textPurchaseHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        textPurchaseHistory = findViewById(R.id.textPurchaseHistory); // Initialize TextView

        // Load purchase history data and display it
        displayPurchaseHistory();
    }

    private void displayPurchaseHistory() {
        // Dummy purchase history data for demonstration
        String purchaseHistoryData = "1. Item 1 - $10\n" +
                                     "2. Item 2 - $15\n" +
                                     "3. Item 3 - $20";

        // Set purchase history data to TextView
        textPurchaseHistory.setText(purchaseHistoryData);
    }
}
