package com.example.seucinemaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LaterMovies extends AppCompatActivity {

    ListView cinemas;
    List<String> CinemasMo = new ArrayList<String>();

    String [] startingList = {"VOX Cinemas","Muvi Cinema","amc Cinema", "Empire Cinemas"};
    ArrayAdapter ad;

    Button alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_later_movies);

        cinemas = findViewById(R.id.listViewDar);
        CinemasMo = new ArrayList<String>(Arrays.asList(startingList));
        ad = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, CinemasMo);
        cinemas.setAdapter(ad);

        alert = (Button)findViewById(R.id.btnalert);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(LaterMovies.this).create();
                alertDialog.setTitle("Payment methods");
                alertDialog.setMessage("Please pay the ticket at the cinema");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                             dialogInterface.dismiss();
                            }
                        });
                alertDialog.show();

            }
        });

    }
}