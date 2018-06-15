package com.example.sne.olcademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListPage extends AppCompatActivity {

    int[] IMAGES = {R.drawable.electronics,R.drawable.tvappliances,R.drawable.fashion,R.drawable.homefurniture,R.drawable.sports
    } ;

    String[] NAMES = { "Electronics","TV & Appliances","Fashion","Home & Furniture" , "Sports"} ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);


        ListView listView =(ListView)findViewById(R.id.name_list) ;

        CustomAdapter customAdapter = new CustomAdapter() ;

        listView.setAdapter(customAdapter);
    }

    public class CustomAdapter extends BaseAdapter
    {

        public CustomAdapter()
        {
            super();
        }
        /**
         * How many items are in the data set represented by this Adapter.
         *
         * @return Count of items.
         */
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        /**
         * Get the data item associated with the specified position in the data set.
         *
         * @param position Position of the item whose data we want within the adapter's
         *                 data set.
         * @return The data at the specified position.
         */
        @Override
        public Object getItem(int position) {
            return null;
        }

        /**
         * Get the row id associated with the specified position in the list.
         *
         * @param position The position of the item within the adapter's data set whose row id we want.
         * @return The id of the item at the specified position.
         */
        @Override
        public long getItemId(int position) {
            return 0;
        }

        /**
         * Get a View that displays the data at the specified position in the data set. You can either
         * create a View manually or inflate it from an XML layout file. When the View is inflated, the
         * parent View (GridView, ListView...) will apply default layout parameters unless you use
         *
         * to specify a root view and to prevent attachment to the root.
         *
         * @param position    The position of the item within the adapter's data set of the item whose view
         *                    we want.
         * @param convertView The old view to reuse, if possible. Note: You should check that this view
         *                    is non-null and of an appropriate type before using. If it is not possible to convert
         *                    this view to display the correct data, this method can create a new view.
         *                    Heterogeneous lists can specify their number of view types, so that this View is
         *                    always of the right type (see  and
         *                    ).
         * @param parent      The parent that this view will eventually be attached to
         * @return A View corresponding to the data at the specified position.
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View examp=convertView ;
            if(examp==null) {
                examp = LayoutInflater.from(getApplicationContext()).inflate(R.layout.list1,parent,false)  ;           }
            ImageView imageView=(ImageView)findViewById(R.id.icons) ;
            TextView textView=(TextView)findViewById(R.id.names1) ;

            imageView.setImageResource(IMAGES[position]);
            textView.setText(NAMES[position]);

            return examp;
        }

    }
}
