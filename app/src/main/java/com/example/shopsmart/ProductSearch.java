package com.example.shopsmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ProductSearch extends AppCompatActivity {

    private EditText editTextSearchProduct;
    private RecyclerView recyclerViewProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_search);

        editTextSearchProduct = findViewById(R.id.editTextSearchProduct);
        recyclerViewProductList = findViewById(R.id.recyclerViewProductList);

        // Set up RecyclerView and Adapter for product search results

        // Implement search functionality
        editTextSearchProduct.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Update product search results based on user input
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
