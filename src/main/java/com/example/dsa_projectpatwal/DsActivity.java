package com.example.dsa_projectpatwal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

@SuppressLint("Registered")
public class DsActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        final ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new Topic("Array","https://www.youtube.com/watch?v=37E9ckMDdTk&list=PLgUwDviBIf0rENwdL0nEH0uGom9no0nyB"));
        topics.add(new Topic("Linked List","https://www.youtube.com/watch?v=cg6JGiXhQ9c&list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU"));
        topics.add(new Topic("Stack","https://www.geeksforgeeks.org/stack-data-structure/"));
        topics.add(new Topic("Queue","https://www.geeksforgeeks.org/queue-data-structure/"));
        topics.add(new Topic("Binary Tree","https://www.geeksforgeeks.org/binary-tree-data-structure/"));
        topics.add(new Topic("Binary Search Tree","https://www.geeksforgeeks.org/binary-search-tree-data-structure/"));
        topics.add(new Topic("Heap","https://www.geeksforgeeks.org/heap-data-structure/"));
        topics.add(new Topic("Hashing","https://www.geeksforgeeks.org/hashing-data-structure/"));
        topics.add(new Topic("Graph","https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/"));
        topics.add(new Topic("Advanced Data Structure","https://www.geeksforgeeks.org/advanced-data-structures/"));
        topics.add(new Topic("Matrix","https://www.geeksforgeeks.org/matrix/"));
        topics.add(new Topic("Strings","https://www.geeksforgeeks.org/string-data-structure/"));

        TopicAdapter topicsAdapter = new TopicAdapter(this, topics);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(topicsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"thiss is toast",Toast.LENGTH_SHORT).show();
                Topic topic = topics.get(position);
                Uri uri = Uri.parse(topic.getLink());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
