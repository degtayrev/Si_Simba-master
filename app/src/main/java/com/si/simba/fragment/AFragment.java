package com.si.simba.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.si.simba.R;
import com.si.simba.activity.AboutActivity;
import com.si.simba.features.maps.MapsActivity;


public class AFragment extends Fragment {
    GridLayout mainGrid;


    public AFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);

        mainGrid = view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        layoutCreated();

    }

    private void layoutCreated() {

    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), AboutActivity.class);
                        startActivity(intent);
                    } else if (finalI == 1 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), AboutActivity.class);
                        startActivity(intent);
                    } else if (finalI == 2 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), AboutActivity.class);
                        startActivity(intent);
                    } else if (finalI == 3 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), AboutActivity.class);
                        startActivity(intent);
                    } else if (finalI == 4 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), AboutActivity.class);
                        startActivity(intent);
                    } else if (finalI == 5 && cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        Intent intent = new Intent(getActivity(), MapsActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getActivity(), "Please set activity for this card item", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }

}
