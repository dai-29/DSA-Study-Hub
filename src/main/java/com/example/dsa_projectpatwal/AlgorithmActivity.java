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

public class AlgorithmActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        final ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new  Topic("Analysis of Algorithms","https://www.geeksforgeeks.org/fundamentals-of-algorithms/#AnalysisofAlgorithms"));
        topics.add(new Topic("Searching Algorithm","https://www.geeksforgeeks.org/searching-algorithms/"));
        topics.add(new Topic("Sorting Algorithm", "https://www.geeksforgeeks.org/sorting-algorithms/"));
        topics.add(new Topic("Greedy Algorithms","https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/"));
        topics.add(new Topic("Dynamic Programming","https://www.geeksforgeeks.org/dynamic-programming/"));
        topics.add(new Topic("Pattern Searching","https://www.geeksforgeeks.org/fundamentals-of-algorithms/#PatternSearching"));
        topics.add(new Topic("Backtracking","https://www.geeksforgeeks.org/backtracking-algorithms/"));
        //topics.add("");
        topics.add(new Topic("Divide and Conquer","https://www.geeksforgeeks.org/divide-and-conquer/"));
        topics.add(new Topic("Geometric Algorithms","https://www.geeksforgeeks.org/geometric-algorithms/"));
        topics.add(new Topic("Mathematical Algorithms","https://www.geeksforgeeks.org/mathematical-algorithms/"));
        topics.add(new Topic("Bit Algorithms","https://www.geeksforgeeks.org/bitwise-algorithms/"));
        topics.add(new Topic("Graph Algorithms","https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/"));
        topics.add(new Topic("Randomized Algorithms","https://www.geeksforgeeks.org/randomized-algorithms/"));
        topics.add(new Topic("Branch and Bound","https://www.geeksforgeeks.org/fundamentals-of-algorithms/#BranchandBound"));

        TopicAdapter topicsAdapter = new TopicAdapter(this, topics);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(topicsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Topic topic = topics.get(position); // Retrieve the correct topic using position
                Uri uri = Uri.parse(topic.getLink()); // Get the URL associated with the topic
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent); // Start activity to open the URL
            }
        });


    }
}
