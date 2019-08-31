package com.si.simba.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.si.simba.R;
import com.si.simba.features.games.MainGameActivity;

import info.hoang8f.widget.FButton;


public class BFragment extends Fragment {
    FButton playGame;

    public BFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);

        playGame = (FButton) view.findViewById(R.id.playGame);

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainGameActivity.class);
                startActivity(intent);
            }
        });


    }

}
