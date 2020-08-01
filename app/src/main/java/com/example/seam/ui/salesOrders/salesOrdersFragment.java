package com.example.seam.ui.salesOrders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.seam.R;

public class salesOrdersFragment extends Fragment {

    private salesOrdersViewModel salesOrdersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        salesOrdersViewModel =
                ViewModelProviders.of(this).get(salesOrdersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sales_orders, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        salesOrdersViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}