public class ShoppingList extends AppCompatActivity {

    private RecyclerView recyclerViewShoppingList;
    private Button btnAddItem, btnSaveList, btnCheckout;
    private TextView txtItemCount, txtTotalCost;
    private ShoppingListAdapter adapter;
    private List<ShoppingItem> shoppingItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        recyclerViewShoppingList = findViewById(R.id.recyclerViewShoppingList);
        txtItemCount = findViewById(R.id.txtItemCount);
        txtTotalCost = findViewById(R.id.txtTotalCost);
        btnCheckout = findViewById(R.id.btnCheckout);

        btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(view -> navigateToProductSearchActivity());

        btnSaveList = findViewById(R.id.btnSaveList);
        btnSaveList.setOnClickListener(view -> navigateToPromotionsActivity());

        // Initialize shoppingItems and adapter
        shoppingItems = new ArrayList<>();
        adapter = new ShoppingListAdapter(shoppingItems);
        recyclerViewShoppingList.setAdapter(adapter);

        // Set up RecyclerView layout manager and item decorator
        recyclerViewShoppingList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewShoppingList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    // Other methods for navigation and RecyclerView setup

}
