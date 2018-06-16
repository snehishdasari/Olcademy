package com.example.sne.olcademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Electronics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        ListView eleclist=(ListView)findViewById(R.id.listofelectronics);

        setTitle("Electronics");

        List<com.example.sne.olcademy.Elecdemo>  list = new ArrayList<>() ;

        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;
        list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;list.add(new Elecdemo(0,R.drawable.lap,"HP 15 Core i5 8th Gen - (8 GB/1 TB HDD/DOS) 15-BS145TU Laptop","35,000/-")) ;


        Elecdemoadapter adapter= new Elecdemoadapter(getApplicationContext(),list) ;

        eleclist.setAdapter(adapter);

        eleclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    Intent i = new Intent(Electronics.this, Description.class);
                    startActivity(i);
                }
                else
                {
                    Intent i= new Intent(Electronics.this,Shirt.class) ;
                }
            }
        });

    }
}
