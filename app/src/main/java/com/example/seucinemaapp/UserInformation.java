package com.example.seucinemaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInformation extends AppCompatActivity {
    EditText name, contact, age;
    Button insert, update, delete, view;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        name = findViewById(R.id.name);
        contact = findViewById(R.id.contact);
        age = findViewById(R.id.age);

        insert = findViewById(R.id.insert);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        view = findViewById(R.id.view);
        DB = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String ageTXT = age.getText().toString();

                Boolean checkinsertdata = DB.insertUserData(nameTXT, contactTXT,ageTXT);
                if (checkinsertdata == true)
                    Toast.makeText(UserInformation.this, "Your data has been saved", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(UserInformation.this, "Your data has not been saved", Toast.LENGTH_SHORT).show();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String ageTXT = age.getText().toString();

                Boolean checkupadtetdata = DB.updateUserData(nameTXT, contactTXT,ageTXT);
                if (checkupadtetdata== true)
                    Toast.makeText(UserInformation.this, "Your data has been updated ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(UserInformation.this, "Your data has been updated", Toast.LENGTH_SHORT).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();


                Boolean checkdeletetdata = DB.deleteUserData(nameTXT);
                if (checkdeletetdata== true)
                    Toast.makeText(UserInformation.this, "Your data has been deleted ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(UserInformation.this, "Your data has not been deleted ", Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getData();
                if (res.getCount() == 0){
                    Toast.makeText(UserInformation.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Name : " + res.getString(0) + "\n");
                    buffer.append("Contact : " + res.getString(1) + "\n");
                    buffer.append("Age : " + res.getString(2) + "\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(UserInformation.this);
                builder.setCancelable(true);
                builder.setTitle("User Details");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });

    }
}