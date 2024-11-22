package com.mcas2.misaficiones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mcas2.misaficiones.databinding.ActivityTipodeporteBinding;
import com.mcas2.misaficiones.ui.frmanager.PaginadorTipoDeporte;

public class TipoDeporte extends AppCompatActivity {

    private ActivityTipodeporteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTipodeporteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorTipoDeporte paginador = new PaginadorTipoDeporte(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.tipoDeporteTabs;
        tabLayout.setupWithViewPager(viewPager);
    }
}