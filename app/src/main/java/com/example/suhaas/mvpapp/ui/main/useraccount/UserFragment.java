package com.example.suhaas.mvpapp.ui.main.useraccount;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.suhaas.mvpapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {

    private Button btn_addMedicine;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        btn_addMedicine = (Button) view.findViewById(R.id.add_medicine_button);
        btn_addMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), NewMedicineActivity.class);
                startActivity(i);
            }
        });
        return view;
    }

}
