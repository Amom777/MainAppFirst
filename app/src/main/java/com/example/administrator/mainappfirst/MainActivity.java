package com.example.administrator.mainappfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView tView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button  = (Button) findViewById(R.id.btn_editText);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this, EditText.class);
                startActivity(intent);
            }
        });

        button  = (Button) findViewById(R.id.btn_picture);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this, PictureList.class);
                startActivity(intent);
            }
        });

        button  = (Button) findViewById(R.id.btn_menu);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });
        button  = (Button) findViewById(R.id.btn_setting);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this, Setting.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn_profil);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profil.class);
                startActivity(intent);
            }
        });
        tView =  (TextView) findViewById(R.id.tv_View);
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profil.class);
                startActivity(intent);
            }
        });
    }
}
