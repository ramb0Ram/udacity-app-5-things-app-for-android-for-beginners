package com.example.android.udacityprojectprepfinal;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Redirect to 1._Install CakePHP
     * @param view
     */
    public void redirectToInstall(View view) {
        //Intent intent = new Intent(this, Install.class);
        //startActivity(intent);
        // OR:
        Button btn = (Button) findViewById(R.id.btnInstall);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Install.class));
            }
        });
    }

    /**
     *
     * @param view
     */
    public void redirectToDataBase(View view) {
        Intent intent = new Intent(this, DataBase.class);
        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void redirectToCreateCrud(View view) {
        Intent intent = new Intent(this, CreateCrud.class);
        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void redirectToPlugin(View view) {
        Intent intent = new Intent(this, Plugin.class);
        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void redirectToTestApi(View view) {
        Intent intent = new Intent(this, TestApi.class);
        startActivity(intent);
    }

}
