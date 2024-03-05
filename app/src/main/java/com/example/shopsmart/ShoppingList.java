package com.example.shopsmart;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingList extends AppCompatActivity {

    private RecyclerView recyclerViewShoppingList;
    private Button btnAddItem, btnSaveList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        recyclerViewShoppingList = findViewById(R.id.recyclerViewShoppingList);

        Button btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(view -> navigateToProductSearchActivity());

        Button btnSaveList = findViewById(R.id.btnSaveList);
        btnSaveList.setOnClickListener(view -> navigateToPromotionsActivity());
    }

    private void navigateToProductSearchActivity() {
        Intent intent = new Intent(this, ProductSearch.class);
        startActivity(intent);
    }

    private void navigateToPromotionsActivity() {
        Intent intent = new Intent(this, Promotions.class);
        startActivity(intent);
    }

    // Set up RecyclerView and Adapter for shopping list items


}

