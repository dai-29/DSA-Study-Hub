package com.example.dsa_projectpatwal;

import androidx.annotation.NonNull;

public class Topic {

    private String mTopic;
    private String mLink;

    public Topic(String topic, String link){
        mTopic = topic;
        mLink = link;
    }

    public String getTopic() { return mTopic; }

    public String getLink() { return mLink; }

    @NonNull
    @Override
    public String toString() {
        return "Topic{" +
                "mTopic='" + mTopic + '\'' +
                "mLink='" + mLink + '\'' +
                '}';
    }
}
