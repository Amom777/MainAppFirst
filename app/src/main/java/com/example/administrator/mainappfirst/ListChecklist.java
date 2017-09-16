package com.example.administrator.mainappfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListChecklist extends AppCompatActivity {
    ListView quest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_checklist);

        quest = (ListView)findViewById(R.id.quest_list);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.activity_list_item);
        quest.setAdapter(adapter);
        registerForContextMenu(quest);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
    }

}
