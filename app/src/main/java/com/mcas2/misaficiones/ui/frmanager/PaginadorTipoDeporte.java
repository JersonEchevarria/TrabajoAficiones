package com.mcas2.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mcas2.misaficiones.R;
import com.mcas2.misaficiones.fr.tipodeporte.Futbol;
import com.mcas2.misaficiones.fr.tipodeporte.Gym;

public class PaginadorTipoDeporte extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadorTipoDeporte(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @StringRes
    private static final int[] TITULOS = new int[]{
            R.string.tipofutbol,
            R.string.tipogym,
    };

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Futbol();
            case 1:
                return new Gym();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TITULOS[position]);
    }
}
