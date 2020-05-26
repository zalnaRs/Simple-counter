package com.zalnars.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "settings" ;

    public static int number;
    public static int steps;
    TextView textView;
    Button remove, add;
    Intent intent;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        steps = Integer.parseInt(sharedpreferences.getString("Steps", "1")) ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        steps = Integer.parseInt(sharedpreferences.getString("Steps", "1")) ;

        add = findViewById(R.id.btn_add);
        remove = findViewById(R.id.btn_remove);

        textView = findViewById(R.id.text);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number += steps;
               textView.setText(Integer.toString(number));
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number -= steps;
                textView.setText(Integer.toString(number));
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                break;
            case R.id.menu_license:
                intent = new Intent(MainActivity.this, License.class);
                startActivity(intent);
                break;
            case R.id.menu_exit:
                onBackPressed();
                break;
        }
      return true;
    }
}
