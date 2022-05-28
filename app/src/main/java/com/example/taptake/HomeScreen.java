package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.taptake.databinding.ActivityHomeScreenBinding;
import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends AppCompatActivity {
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHomeScreenBinding binding;

    public static NavController navController;

    public static boolean GoToCarrinho = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHomeScreen.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

//         Passing each menu ID as a set of Ids because each
//         menu should be considered as top level destinations.

        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home,
                R.id.nav_profile, R.id.nav_university, R.id.nav_requests, R.id.nav_cart, R.id.nav_delivery)
                .setOpenableLayout(drawer)
                .build();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home_screen);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        // Witchcraft!
        if (GoToCarrinho) {
            GoToCarrinho = false;

            navController.navigate(R.id.nav_cart);
        } else {
            onRestauranteClick(null);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home_screen);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void onRestauranteClick(MenuItem item) {
        navController.popBackStack();
        DrawerLayout layout = findViewById(R.id.drawer_layout);
        layout.closeDrawers();
    }
}