package com.biwash.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.biwash.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumber extends Fragment {


    public ReverseNumber() {
        // Required empty public constructor
    }

    EditText num;
    Button btnReverse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_reverse_number, container, false);
        num=view.findViewById(R.id.num);
        btnReverse=view.findViewById(R.id.btnReverse);

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int getNum=Integer.parseInt(num.getText().toString());
                if(num.getText().length()==0){
                    Toast.makeText(getActivity(), "Please enter value", Toast.LENGTH_SHORT).show();
                    num.requestFocus();
                    return;
                }
                StringBuffer c = new StringBuffer(num.getText().toString());
                Toast.makeText(getActivity(), "Reversed number is "+ c.reverse(), Toast.LENGTH_SHORT).show();
            }
        });
        return  view;
    }

}
