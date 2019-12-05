package com.biwash.fragments.fragments;


import android.content.Intent;
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
public class SumFragment extends Fragment {


    public SumFragment() {
        // Required empty public constructor
    }

    private Button btnSum;
    EditText first,second;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        btnSum=view.findViewById(R.id.btnSum);
        first=view.findViewById(R.id.first);
        second=view.findViewById(R.id.second);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int firstNum= Integer.parseInt(first.getText().toString());
               int secondNum= Integer.parseInt(second.getText().toString());
               int result=firstNum+secondNum;
                Toast.makeText(getActivity(), "Sum is "+ result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
