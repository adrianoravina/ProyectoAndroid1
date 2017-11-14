package com.example.ravin.proyectoandroid1;

import java.util.Random;

/**
 * Created by ravin on 14/11/2017.
 */

public class Platos {

    Random r = new Random();

    private String[] nombrePlatos = {"Paella", "Perrito ", "Kebap", "Ratatouille", "Hamburgesa", "Macarrones", "Tacos"};
    private int[] imagePlatos = {R.drawable.paella, R.drawable.perrito, R.drawable.kebap, R.drawable.ratatouille,
            R.drawable.hamburgesa, R.drawable.macarrones, R.drawable.tacos};

    public String[] getNombrePlatos(){return nombrePlatos;}
    public String getNombrePlato(int i){ return nombrePlatos[i];}
    public void setNombrePlatos(String[] nombrePlatos){ this.nombrePlatos = nombrePlatos;}

    public String[] getNombrePlatosAle(){
        String[] platosAle = new String[3];

        for(int i = 0; i <= platosAle.length; i++){
            platosAle[i] = nombrePlatos[r.nextInt(platosAle.length)];
        }

        return platosAle;
    }

    public int[] getImagePlatos(){return imagePlatos;}
    public void setImagePlatos(int[] imagePlatos){ this.imagePlatos = imagePlatos;}

    public int getImagenDePlato(){

        return imagePlatos[imagePlatos[r.nextInt(imagePlatos.length)]];

    }
}
