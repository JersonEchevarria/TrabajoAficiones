package com.mcas2.misaficiones.fr.aficiones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mcas2.misaficiones.Aficiones;
import com.mcas2.misaficiones.R;
import com.mcas2.misaficiones.TiposDormir;

public class Dormir extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dormir, container, false);

        Button button = view.findViewById(R.id.buttonDormir);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TiposDormir.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
