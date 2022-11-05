package com.mintic.miproyecto;

import static com.google.firebase.database.DatabaseReference.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TerminosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.id.txt_titulo);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference myref = database.getReference("informacion").child("tiutlo");
        DatabaseReference myref1 = database.getReference("informacion").child("parrafo");
        DatabaseReference myref2 = database.getReference("informacion").child("tiutlo_uno");
        DatabaseReference myref3 = database.getReference("informacion").child("parrafo_uno");
        DatabaseReference myref4 = database.getReference("informacion").child("tiutlo_dos");
        DatabaseReference myref5 = database.getReference("informacion").child("parrafo_dos");


        final TextView textView  = findViewById(R.id.txt_titulo);
        final TextView textView1 = findViewById(R.id.txt_parrafo);
        final TextView textView2 = findViewById(R.id.txt_titulo_uno);
        final TextView textView3 = findViewById(R.id.txt_parrafo_uno);
        final TextView textView4 = findViewById(R.id.txt_titulo_dos);
        final TextView textView5 = findViewById(R.id.txt_parrafo_dos);



        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        myref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView1.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView2.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView3.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView4.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myref5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView5.setText(snapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}