package com.example.sne.olcademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Login");
        Button button =(Button)findViewById(R.id.loginbutton) ;


    }

    public void gohome(View view)
    {
        startActivity(new Intent(this,HomePage.class));
    }
}
