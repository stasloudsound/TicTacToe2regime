package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void activityPC(View view){
        //Intent intent = new Intent(this,Activity2.class);
        //startActivity(intent);


        Intent intent = new Intent(this,ActivityPlayerCompucter.class);
        //intent.putExtra();
        startActivityForResult(intent,1);
    }

    public void activityPP(View view){
        //Intent intent = new Intent(this,Activity2.class);
        //startActivity(intent);


        Intent intent = new Intent(this,ActivityPlayerPlayer.class);
        //intent.putExtra();
        startActivityForResult(intent,1);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}