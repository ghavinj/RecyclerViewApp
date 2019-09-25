package com.ghavinj.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

//        ListItem item1 = new ListItem("Movie 1", "Its about someone crazy", "Wow!, Great movie");
//        ListItem item2 = new ListItem("Movie 2", "Another Bad Creation", "Very Upsetting!");
//        ListItem item3 = new ListItem("Movie 3", "This is a great sleeper", "Boooo!");

        for (int i = 0; i < 10; i++){
            ListItem item = new ListItem(
                    "Item " + (i+1),
                    "Description",
                    "Rating"
            );
            listItems.add(item);
//            listItems.add(item2);
//            listItems.add(item3);
        }

        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}
