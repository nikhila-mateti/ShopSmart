package com.example.shopsmart.Domain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.shopsmart.ProductSearch;
import com.example.shopsmart.Promotions;
import com.example.shopsmart.R;
public class SliderItems {
    private String url;

    public SliderItems() {
    }

    public SliderItems(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class ShoppingList extends AppCompatActivity {

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
}