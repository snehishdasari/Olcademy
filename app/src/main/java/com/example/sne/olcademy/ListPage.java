package com.example.sne.olcademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {

    int[] IMAGES = {R.drawable.electronics,R.drawable.tvappliances,R.drawable.fashion,R.drawable.homefurniture,R.drawable.sports
    } ;

    String[] NAMES = { "Electronics","TV & Appliances","Fashion","Home & Furniture" , "Sports"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        ListView listView =(ListView)findViewById(R.id.name_list) ;
         List<Category> mCategoryList ;
        com.example.sne.olcademy.CategoryListAdapter adapter ;

        mCategoryList= new ArrayList<Category>() ;

        setTitle("Categories");

        mCategoryList.add(new Category(0,R.drawable.electronics,"Electronics")) ;
        mCategoryList.add(new Category(1,R.drawable.tvappliances,"TV & Appliances")) ;
        mCategoryList.add(new Category(2,R.drawable.fashion,"Fashion")) ;
        mCategoryList.add(new Category(3,R.drawable.homefurniture,"Home & Furniture")) ;
        mCategoryList.add(new Category(4,R.drawable.sports,"Sports")) ;
        adapter= new com.example.sne.olcademy.CategoryListAdapter(getApplicationContext(),mCategoryList) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(ListPage.this, Electronics.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(ListPage.this, Electronics.class);
                    startActivity(i);

                } else if (position == 2)
                {
                    Intent i = new Intent(ListPage.this, Shirt.class);
                    startActivity(i);

                }

                else if(position==3)
                {
                    Intent i = new Intent(ListPage.this, Electronics.class);
                    startActivity(i);

                }
                else if(position==4)
                {
                    Intent i = new Intent(ListPage.this, Electronics.class);
                    startActivity(i);

                }
            }
        });

    }




    }

