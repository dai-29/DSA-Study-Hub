package com.example.dsa_projectpatwal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TopicAdapter extends ArrayAdapter<Topic> {

    public TopicAdapter(Activity context, ArrayList<Topic> topic) {
        super(context, 0, topic);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_topic, parent, false);
        }

        Topic currentTopic  = getItem(position);

        TextView topicTextView = (TextView) listItemView.findViewById(R.id.topic);

        topicTextView.setText(currentTopic.getTopic());

        return listItemView;
    }
}
