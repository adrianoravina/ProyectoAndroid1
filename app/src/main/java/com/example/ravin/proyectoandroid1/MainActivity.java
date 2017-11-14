package com.example.ravin.proyectoandroid1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Platos platos;
    TextView tvHeader;
    ListView lvPlatos;
    ImageView ivPlato;
    EditText etPedido;
    EditText etResultado;
    Button btnComenzar;
    String pedidoStr;
    int coste = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        platos = new Platos();

        tvHeader = (TextView)findViewById(R.id.tvHeader);
        etPedido = (EditText)findViewById(R.id.etPedido);
        etResultado = (EditText)findViewById(R.id.etResultado);
        lvPlatos = (ListView)findViewById(R.id.lvPlatos);
        ivPlato = (ImageView)findViewById(R.id.ivPlato);
        btnComenzar = (Button)findViewById(R.id.btnComenzar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, platos.getNombrePlatos());
        lvPlatos.setAdapter(adapter);

        lvPlatos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                                         @Override
                                         public void onItemClick(AdapterView adapterView, View view, int i, long l){
                                             ivPlato.setImageResource(platos.getImagePlatos()[i]);
                                             pedidoStr += ""+platos.getNombrePlato(i)+ "+";
                                             coste += 5;
                                             etPedido.setText(pedidoStr);
                                         }
                                     });

    }

    public void onClick(View view){
        int id = view.getId();

        if(id == R.id.btnComenzar){
            etResultado.setText(""+coste+" euros");
        }
    }
}
