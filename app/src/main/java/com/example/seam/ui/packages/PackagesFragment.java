package com.example.seam.ui.packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.seam.Adapter.SectionsPagerAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.seam.MainActivity;
import com.example.seam.R;
import com.google.android.material.tabs.TabLayout;

public class PackagesFragment extends Fragment {

    private PackagesViewModel packagesViewModel;

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  packagesViewModel =
                ViewModelProviders.of(this).get(PackagesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_packages, container, false);*/
      myFragment = inflater.inflate(R.layout.fragment_packages, container,false);

      viewPager = myFragment.findViewById(R.id.viewpager_all);
      tabLayout = myFragment.findViewById(R.id.tabLayout);

      return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
       SectionsPagerAdapter adapter = new SectionsPagerAdapter(getChildFragmentManager());

       adapter.addFragment(new packages_all(), "ALL");
       adapter.addFragment(new packages_packed(), "PACKED");
       adapter.addFragment(new packages_shipped(), "SHIPPED");
       adapter.addFragment(new packages_delivered(), "DELIVERED");

       viewPager.setAdapter(adapter);
    }
}