package com.example.temadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainSignUp extends AppCompatActivity {
    private Button buttonSignUp;
    private EditText editTextTextPersonName;
    private EditText editTextTextEmailAddress;
    private EditText editTextDate2;
    private EditText editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        buttonSignUp = findViewById(R.id.buttonSignUp);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextDate2 = findViewById(R.id.editTextDate2);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Persoana p1 = new Persoana();

                    p1.setFirstName(editTextTextPersonName.getText().toString());
                    p1.setEmail(editTextTextEmailAddress.getText().toString());
                    p1.setDob(editTextDate2.getText().toString());
                    p1.setPassword(editTextTextPassword.getText().toString());
                    //Toast.makeText(MainSignUp.this, p1.toString(), Toast.LENGTH_SHORT).show();

                    Bundle wrapperObject = new Bundle();
                    wrapperObject.putSerializable("persoana", p1);
                    Intent intent = new Intent();
                    intent.putExtra("raspunsBundle", wrapperObject);
                    setResult(RESULT_OK, intent);

                    finish();
                }
            }
        });
    }

    boolean EmailValid(CharSequence email){
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isValid(){
        if (editTextTextPersonName.getText().toString().isEmpty()){
            Toast.makeText(MainSignUp.this, "Completati numele", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (editTextTextEmailAddress.getText().toString().isEmpty()){
            Toast.makeText(MainSignUp.this, "Completati emailul", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (editTextDate2.getText().toString().isEmpty()){
            Toast.makeText(MainSignUp.this, "Completati data nasterii", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (editTextTextPassword.getText().toString().isEmpty()){
            Toast.makeText(MainSignUp.this, "Completati parola", Toast.LENGTH_SHORT).show();
            return false;
        }

       if(!(EmailValid(editTextTextEmailAddress.getText().toString()))){
           Toast.makeText(MainSignUp.this, "Email invalid!", Toast.LENGTH_SHORT).show();
        return false;
       }
       return true;
    }
}