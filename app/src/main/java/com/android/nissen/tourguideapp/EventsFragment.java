package com.android.nissen.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by joshe on 3/31/2017.
 */

public class EventsFragment extends Fragment {



    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of content
        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.event_one, R.string.event_review_one));
        content.add(new Content(R.string.event_two, R.string.event_review_two));
        content.add(new Content(R.string.event_three, R.string.event_review_three));
        content.add(new Content(R.string.event_four, R.string.event_review_four));
        content.add(new Content(R.string.event_five, R.string.event_review_five));
        content.add(new Content(R.string.event_six, R.string.event_review_six));
        content.add(new Content(R.string.event_seven, R.string.event_review_seven));
        content.add(new Content(R.string.event_eight, R.string.event_review_eight));

        ContentAdapter adapter = new ContentAdapter(getActivity(), content, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}