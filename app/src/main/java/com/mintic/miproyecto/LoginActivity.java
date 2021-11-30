package com.mintic.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_login;
    private Button btn_sing_up;


    private EditText edt_user;
    private EditText edt_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btn_login = findViewById(R.id.btn_login);
        btn_sing_up = findViewById(R.id.btn_registro_usuario);

        edt_user = findViewById(R.id.edt_user);
        edt_password = findViewById(R.id.edt_password);


        btn_login.setOnClickListener(this);
        btn_sing_up.setOnClickListener(this);

        edt_user.setOnClickListener(this);
        edt_password.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:

                    String user = edt_user.getText().toString();
                    String password = edt_password.getText().toString();
                    Log.e("User", user);
                    Log.e("Password" , password);

                    if (user.equals("admin@admin.com") && password.equals("admin")){
                        Toast.makeText(this, " Has iniciado sesion ", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent( this, MenuActivity.class);
                        intent.putExtra("user", user);
                        intent.putExtra("password", password);// putExtra es la forma de enviar variables adicionales
                        intent.putExtra("number", 1);//sobrecarga...metódos que reciben el mismo nombre pero contiene diferentes atributos

                        startActivity(intent);

                    } else {
                        Toast.makeText(this, " No puedes iniciar sesion ", Toast.LENGTH_SHORT).show();
                    }

                break;


            case R.id.btn_registro_usuario:
                Intent intent = new Intent(this, RegistroActivity.class);
                startActivity(intent);
                break;


        }
    }
}

