package com.example.temadam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button button;
    private final int MainActivityRequest = 100;
    private EditText etEmail;
    private EditText etPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("Lifecycle", "onCreate");

        btnLogin = (findViewById(R.id.button2));
        button = (findViewById(R.id.button));
        etEmail = (findViewById(R.id.editTextTextPersonName4));
        etPass = (findViewById(R.id.editTextTextPersonName5));
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Succesful login", Toast.LENGTH_LONG).show();
                Intent newWindow = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(newWindow);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainSignUp.class);
                // startActivity(intent);
                startActivityForResult(intent, MainActivityRequest);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MainActivityRequest) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    Bundle newBundle = data.getBundleExtra("raspunsBundle");
                    Persoana persoana = (Persoana) newBundle.getSerializable("persoana");
                    etEmail.setText(persoana.getEmail().toString());
                    etPass.setText(persoana.getPassword().toString());
                }
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.v("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("Lifecycle", "onDestroy");
    }

}