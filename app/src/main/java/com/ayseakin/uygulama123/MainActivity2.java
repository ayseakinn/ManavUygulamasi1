package com.ayseakin.uygulama123;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {


    BottomNavigationView bottomNavim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavim = findViewById(R.id.bnavim);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new HomeFrag()).commit();
      bottomNavim.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              switch(item.getItemId()){
                  case R.id.home:
                      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new HomeFrag()).commit();
                      break;
                  case R.id.search:
                      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new SearchFrag()).commit();
                      break;
                  case R.id.Person:
                      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new SearchFrag()).commit();
                          break;
                  case R.id.add:
                      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new AddFrag()).commit();
                      break;
              }
              return true;
          }
      });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.bootmnavi,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.drawable.addicon){
            Intent intentToUpload=new Intent(MainActivity2.this,GonderiActivity.class);
            startActivity(intentToUpload);
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed(){
        Intent geriIntent=new Intent(MainActivity2.this,MainActivity.class);
        finish();
        startActivity(geriIntent);
    }
}

