package com.mutwakilmoapp.android.myamazingviewpager.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mutwakilmoapp.android.myamazingviewpager.Controllers.Fragments.NewsPageFragment;
import com.mutwakilmoapp.android.myamazingviewpager.Controllers.Fragments.ParamPageFragment;
import com.mutwakilmoapp.android.myamazingviewpager.Controllers.Fragments.ProfilePageFragment;




public class PageAdapter extends FragmentPagerAdapter {


    //Default Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return(3);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return NewsPageFragment.newInstance();
            case 1:
                return ProfilePageFragment.newInstance();
            case 2:
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Fil d'actualité";
            case 1:
                return "Profil";
            case 2:
                return "Paramètre";
            default:
                return null;
        }
    }
}
