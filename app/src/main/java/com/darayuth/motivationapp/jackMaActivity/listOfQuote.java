package com.darayuth.motivationapp.jackMaActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.darayuth.motivationapp.R;
import com.darayuth.motivationapp.adapter.CustomAdapter;
import com.darayuth.motivationapp.model.JackMaQuote;

import java.util.ArrayList;
import java.util.List;

/*******
 * list of quote is JackMa activity .
 */
public class listOfQuote extends AppCompatActivity {
    //initialize the field
    private ListView listView;
    private CustomAdapter customAdapter;
    private List<JackMaQuote> jackMaQuoteList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_quote);
        //collection of JackMaQuote class
        jackMaQuoteList = new ArrayList<>();

        intiaApp();
        onClick();
    }

    /****
     * intiaApp intiaApp is method add the jackMaquote list into the adapter.
     */
    private void intiaApp(){
        String []jackMaQuote = {"If there are nine rabbits on the ground, if you want to catch one just" +
                "focus on one"};

        jackMaQuoteList.add(new JackMaQuote(R.drawable.jackma, jackMaQuote[0]));

        customAdapter = new CustomAdapter(this, R.layout.listview_row, jackMaQuoteList);
        //get reference of list view in activity main
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customAdapter);
    }

    /***
     * onClick onClick is the event listener of list view
     */
    private void onClick(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    /*** first position on ListVIew ****/
                    case 0:
                        //switch to another imageview layout
                        setContentView(R.layout.imageview);
                        break;
                }
            }
        });
    }

}
