package com.vadella.lampture;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener  {

    private CardView sejarah, rumah, pakaian, tari, musik, makanan;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        sejarah = (CardView) findViewById(R.id.btnsejarah);
        rumah = (CardView) findViewById(R.id.btnrumah);
        pakaian = (CardView) findViewById(R.id.btnpakaian);
        tari = (CardView) findViewById(R.id.btntari);
        musik = (CardView) findViewById(R.id.btnmusik);
        makanan = (CardView) findViewById(R.id.btnmakanan);

        sejarah.setOnClickListener(this);
        rumah.setOnClickListener(this);
        pakaian.setOnClickListener(this);
        tari.setOnClickListener(this);
        musik.setOnClickListener(this);
        makanan.setOnClickListener(this);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onClick(View view) {
            Intent i;

            switch(view.getId()){
                case R.id.btnsejarah:
                    i= new Intent(this,Sejarah.class);
                    startActivity(i);
                    break;
            }

            switch(view.getId()){
                case R.id.btnrumah:
                    i= new Intent(this,Rumah.class);
                    startActivity(i);
                    break;
            }

            switch(view.getId()){
                case R.id.btnpakaian:
                    i= new Intent(this,Pakaian.class);
                    startActivity(i);
                    break;
            }

            switch(view.getId()){
                case R.id.btntari:
                    i= new Intent(this,Tari.class);
                    startActivity(i);
                    break;
            }

            switch(view.getId()){
                case R.id.btnmusik:
                    i= new Intent(this,Musik.class);
                    startActivity(i);
                    break;
            }

            switch(view.getId()){
                case R.id.btnmakanan:
                    i= new Intent(this,Makanan.class);
                    startActivity(i);
                    break;
            }
        }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                        new Home()).commit();
                break;
            case R.id.lampung:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                        new Lampung()).commit();
                break;
            case R.id.adat:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                        new Adat()).commit();
                break;
            case R.id.dialek:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                        new Dialek()).commit();
                break;
            case R.id.pengembang:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                        new Pengembang()).commit();
                break;

        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }
    @Override
    public void onBackPressed() {

        int count = getSupportFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            //additional code
        } else {
            getSupportFragmentManager().popBackStack();
        }

    }
}
