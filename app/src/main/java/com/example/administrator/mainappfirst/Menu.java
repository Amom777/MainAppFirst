package com.example.administrator.mainappfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
//    ImageButton imgBtnMenuPopup;
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        imgBtnMenuPopup = (ImageButton) findViewById(R.id.imgBtnMenu);
//        imgBtnMenuPopup.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                PopupMenu popupMenu = new PopupMenu(Menu.this, imgBtnMenuPopup);
//                popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item){
//                        Toast.makeText(getApplicationContext(), "sudah di klik", Toast.LENGTH_SHORT).show();
//                        return false;
//                    }
//                });
//                popupMenu.show();
//            }
//
//        });
        myToolbar = (Toolbar)findViewById(R.id.my_toolbar);
//        myToolbar.setTitle("Options Menu Toolbar");
        myToolbar.inflateMenu(R.menu.menu_popup);
        myToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menu) {
                return onOptionsItemSelected(menu);
            }
        });

    }
}
