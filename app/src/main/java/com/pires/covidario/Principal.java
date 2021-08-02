package com.pires.covidario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.ArrayList;


public class Principal extends Activity {   //extends = herança


    public Principal() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_principal);

        List<String> pacientes = new ArrayList<>();
        pacientes.add("Diogo Pires");
        pacientes.add("User 2");
        pacientes.add("User 3");
        pacientes.add("User 4");
        pacientes.add("User 5");


        ListView listaPacientes = findViewById(R.id.acitivity_principal_lista_pacientes);

        listaPacientes.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pacientes));

        listaPacientes.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
        });

        FloatingActionButton fab = findViewById(R.id.floatingActionButton2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( Principal.this, Formulario.class));
            }
        });


    }
}
