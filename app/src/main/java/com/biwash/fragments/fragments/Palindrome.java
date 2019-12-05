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
public class Palindrome extends Fragment {


    public Palindrome() {
        // Required empty public constructor
    }

   private Button btnCheck;
   private EditText input;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
        input=view.findViewById(R.id.input);
        btnCheck=view.findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().length()==0){
                    Toast.makeText(getActivity(), "Please enter value", Toast.LENGTH_SHORT).show();
                    input.requestFocus();
                    return;
                }
                String result;
                String newStr=new StringBuilder(input.getText()).reverse().toString();
                if(input.getText().toString().equals(newStr)){
                     result="palidrome";
                }else
                { result="not palindrome";}

                Toast.makeText(getActivity(), "Input is "+ result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
