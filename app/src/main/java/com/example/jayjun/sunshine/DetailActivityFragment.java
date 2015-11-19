package com.example.jayjun.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView weatherText = (TextView) fragmentView.findViewById(R.id.weather_text);

        Intent intent = getActivity().getIntent();
        String txt = intent.getStringExtra(Intent.EXTRA_TEXT);

        weatherText.setText(txt);

        return fragmentView;
    }
}
