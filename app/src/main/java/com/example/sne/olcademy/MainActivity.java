package com.example.sne.olcademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.background) ;
        imageView.setImageResource(R.drawable.first) ;

        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(2000) ;
                    startActivity(new Intent(getApplicationContext(),LoginActivity.class)) ;
                }
                catch (Exception e)
                {
                    ;
                }
            }
        };

        t.start();
    }
}
