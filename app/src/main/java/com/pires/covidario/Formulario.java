package com.pires.covidario;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;



public class Formulario extends AppCompatActivity {

    private Button button;

    public Formulario() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

    FloatingActionButton fab = findViewById(R.id.floatingActionButton);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
        startActivity(new Intent(Formulario.this, Principal.class));
    }
    });

    Button btn = findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            EditText ediTextNome = findViewById(R.id.textViewNome);
            String nome = ediTextNome.getText().toString();
            EditText editTextData = findViewById(R.id.DataHoje);
            String data = editTextData.getText().toString();
            EditText editTextLugares = findViewById(R.id.textViewLugares);
            String lugares = editTextLugares.getText().toString();
            EditText editTextNascimento = findViewById(R.id.DataNascimento);
            String nascimento = editTextNascimento.getText().toString();


            startActivity(new Intent(Formulario.this, CadastroPacienteActivity.class));

        }
    });


}
}
