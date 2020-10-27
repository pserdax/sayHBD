package com.example.sayhbd;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.sayhbd.databinding.MenuNavigationBinding;
import com.google.android.material.bottomappbar.BottomAppBar;


public class menuNavigation extends Fragment {

    private MenuNavigationBinding binding;
    private Fragment fragment = null;


    public menuNavigation() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        binding = MenuNavigationBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        setSupportActionBar(binding.bottomAppBar);
        binding.bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_birthday:
                        fragment = new birthday();
                        break;
                    case R.id.menu_settings:
                        fragment = new settings();
                        break;
                    case R.id.saved:
                        fragment = new liked();
                        break;
                }
                return false;
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

    private void setSupportActionBar(BottomAppBar bottomAppBar) {
    }
}