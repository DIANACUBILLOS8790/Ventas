package com.mintic.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_play;
    private Button btn_profile;
    private Button btn_config;
    private Button btn_about;
    private Button btn_close;
    private Activity miActividad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miActividad = this;

        btn_play=findViewById(R.id.btn_play);
        btn_profile= findViewById(R.id.btn_profile);
        btn_config = findViewById(R.id.btn_config);
        btn_about= findViewById(R.id.btn_about);
        btn_close = findViewById(R.id.btn_close);


        btn_play.setOnClickListener(this);
        btn_profile.setOnClickListener(this);
        btn_config.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_close.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_play:
                Toast.makeText(this, getString(R.string.txt_jugar), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_profile:
                Toast.makeText(this, getString(R.string.txt_perfil), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_config:
                Toast.makeText(this, getString(R.string.txt_ajustes), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_about:
                Toast.makeText(this, getString(R.string.txt_acerda_de), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_close:
                Toast.makeText(this, getString(R.string.txt_cerrar), Toast.LENGTH_SHORT).show();
                break;

        }

    }
}