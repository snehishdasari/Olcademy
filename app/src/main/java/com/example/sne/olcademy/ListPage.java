package com.example.sne.olcademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {

    int[] IMAGES = {R.drawable.electronics,R.drawable.tvappliances,R.drawable.fashion,R.drawable.homefurniture,R.drawable.sports
    } ;

    String[] NAMES = { "Electronics","TV & Appliances","Fashion","Home & Furniture" , "Sports"} ;
    ListView listView =(ListView)findViewById(R.id.name_list) ;
    private List<Category> mCategoryList ;
    private com.example.sne.olcademy.CategoryListAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        mCategoryList= new ArrayList<Category>() ;

        mCategoryList.add(new Category(1,R.drawable.electronics,"Electronics")) ;
        mCategoryList.add(new Category(2,R.drawable.tvappliances,"TV & Appliances")) ;
        mCategoryList.add(new Category(3,R.drawable.fashion,"Fashion")) ;
        mCategoryList.add(new Category(4,R.drawable.homefurniture,"Home & Furniture")) ;
        mCategoryList.add(new Category(5,R.drawable.sports,"Sports")) ;


        adapter= new com.example.sne.olcademy.CategoryListAdapter(getApplicationContext(),mCategoryList) ;
        listView.setAdapter(adapter);


    }


    }

