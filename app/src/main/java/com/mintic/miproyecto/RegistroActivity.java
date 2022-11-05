package com.mintic.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {

    private Button btn_next;
    private EditText edt_password;
    private Activity myactivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        myactivity = this;


        btn_next = findViewById(R.id.btn_next);
        edt_password = findViewById(R.id.edt_password);



        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String password = edt_password.getText().toString();
                if (password.length() < 8 && !isValidPassword(password)) {
                    Toast.makeText(RegistroActivity.this, " Invalid password ", Toast.LENGTH_SHORT).show();/*Hace visible el texto */
                } else {
                    startActivity(new Intent(myactivity, TerminosActivity.class));

                }
            }
        });

    }

    public static boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=1!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }

}