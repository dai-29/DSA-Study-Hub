package com.example.dsa_projectpatwal;

import android.annotation.SuppressLint;
import android.content.*;
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
public class practiceActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        final ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new Topic ("Striver A-Z DSA Sheet", "https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2"));
        topics.add(new Topic("Striver SDE sheet", "https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems"));
        topics.add(new Topic("450 DSA cracker", "https://450dsa.com/"));
        topics.add(new Topic("NeedCode 150", "https://neetcode.io/practice"));

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
