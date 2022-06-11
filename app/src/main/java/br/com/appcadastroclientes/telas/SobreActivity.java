package br.com.appcadastroclientes.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import br.com.appcadastroclientes.R;

public class SobreActivity extends AppCompatActivity {
    private TextView descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // descricao = (TextView)findViewById(R.id.idDescricaoApp);

    }
}