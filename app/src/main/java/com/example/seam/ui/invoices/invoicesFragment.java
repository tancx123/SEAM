package com.example.seam.ui.invoices;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.seam.R;

public class invoicesFragment extends Fragment{

    private invoicesViewModel invoicesViewModel;

    View myInvoice;
    private Button BtnAddInvoice;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
         myInvoice = inflater.inflate(R.layout.fragment_invoices, container, false);

        BtnAddInvoice= myInvoice.findViewById(R.id.btn_AddInvoice);

        BtnAddInvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myInvoice.getContext(), add_new_invoice.class);
                startActivity(intent);
            }
        });

        return myInvoice;
    }


}