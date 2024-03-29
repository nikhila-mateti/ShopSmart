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
    private ProductAdapter productAdapter; // Added adapter attribute

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_search);

        editTextSearchProduct = findViewById(R.id.editTextSearchProduct);
        recyclerViewProductList = findViewById(R.id.recyclerViewProductList);
        
        // Initialize RecyclerView adapter
        productAdapter = new ProductAdapter(this);
        recyclerViewProductList.setAdapter(productAdapter);

        // Set up RecyclerView layout manager and other configurations

        // Implement search functionality
        editTextSearchProduct.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Filter product list based on user input
                productAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
