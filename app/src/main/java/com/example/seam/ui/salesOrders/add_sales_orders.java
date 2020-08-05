package com.example.seam.ui.salesOrders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seam.R;
import com.example.seam.ui.invoices.add_line_item;

public class add_sales_orders extends AppCompatActivity {

    private Button BtnAddLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sales_orders);

        BtnAddLine = findViewById(R.id.add_sales_line_item_btn);

        BtnAddLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddSalesLineItem();
            }
        });
    }

    public void openAddSalesLineItem(){
        Intent intent = new Intent(this, add_sales_line_item.class);
        startActivity(intent);
    }

}
