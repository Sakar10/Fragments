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
public class Automorphic extends Fragment {


    public Automorphic() {
        // Required empty public constructor
    }

   private Button btnCheck;
   private EditText input;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic, container, false);
        btnCheck=view.findViewById(R.id.btnCheck);
        input=view.findViewById(R.id.input);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().length()==0){
                    Toast.makeText(getActivity(), "Please enter value", Toast.LENGTH_SHORT).show();
                    input.requestFocus();
                    return;
                }
                int num=Integer.parseInt(input.getText().toString());
                String result;
                int d=1;
                for(int i=num;i>0;i=i/10)
                {
                    d=d*10;
                }
                if((num*num)%d==num)
                {
                     result="automorphic";
                }
                else {result="not automorphic";}
                Toast.makeText(getActivity(), "Input is "+result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
