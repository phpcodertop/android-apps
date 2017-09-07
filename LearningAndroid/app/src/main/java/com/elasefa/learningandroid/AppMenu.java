package com.elasefa.learningandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by semicolon on 16/08/2017.
 */
public class AppMenu extends ListActivity {
    // declare list of activities
    public String classess[] = {"MainActivity","TextChecker","CameraActivity","Example3"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(AppMenu.this, android.R.layout.simple_list_item_1, classess));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        try{
            Class selection = Class.forName("com.elasefa.learningandroid." + classess[position]);
            Intent intent = new Intent(AppMenu.this,selection);
            startActivity(intent);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
