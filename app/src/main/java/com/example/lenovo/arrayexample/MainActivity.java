package com.example.lenovo.arrayexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txt_even_list;
    int[] array={1,2,3,4,5,6,7,8,9,10};
    List<Integer> evenarray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        evenarray = new ArrayList<>();
        txt_even_list = findViewById(R.id.showlist);
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenarray.add(array[i]);
                }
            }
            if(evenarray.size()!=0)
            {
            for (int j = 0; j < evenarray.size(); j++) {
                txt_even_list.append(evenarray.get(j).toString() + "  ");
            }
            }
        }
    }
}