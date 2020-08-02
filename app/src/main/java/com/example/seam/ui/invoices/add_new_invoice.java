package com.example.seam.ui.invoices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seam.R;

public class add_new_invoice extends AppCompatActivity {

    private Button BtnAddLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_invoice);

        BtnAddLine = findViewById(R.id.add_line_item_btn);

        BtnAddLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddLineItem();
            }
        });

    }

    public void openAddLineItem(){
        Intent intent = new Intent(this, add_line_item.class);
        startActivity(intent);
    }

}
