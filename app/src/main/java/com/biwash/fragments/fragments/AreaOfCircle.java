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
public class AreaOfCircle extends Fragment {


    public AreaOfCircle() {
        // Required empty public constructor
    }

   EditText radius;
    Button btnCircle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area_of_circle, container, false);
        btnCircle=view.findViewById(R.id.btnCircle);
        radius=view.findViewById(R.id.radius);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radius.getText().length()==0){
                    Toast.makeText(getActivity(), "Please enter value", Toast.LENGTH_SHORT).show();
                    radius.requestFocus();
                    return;
                }
                float getRadius=Float.parseFloat(radius.getText().toString());
                float result= (float) (3.14*(getRadius*getRadius));
                Toast.makeText(getActivity(), "Result is "+ result, Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }

}
