package com.example.serborll.procesado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    static long FECHA[]={1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L,
            1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L };
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño",
            "comedor", "cocina","baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19,
            17, 19, 22, 22};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos ArrayList de datos y lo llenamos con un for()
        ArrayList<PojoClass> datos = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            PojoClass dato = new PojoClass(FECHA[i], HABITACION[i], TEMPERATURA[i]);
            datos.add(dato);
        }

        //Creamos un HashSet de habitaciones y le metemos todas las habitaciones;
        HashSet<String> habitaciones = new HashSet<>();
        for (int i = 0; i < 8; i++) {
            habitaciones.add(HABITACION[i]);
        }
        Log.d("Habitaciones", habitaciones.toString()); //Imprimimos por el LogCat todas las habitaciones

        //Calcular la media de las habitaciones
        for (int i = 0; i < 3; i++ ){
            double d = calcularMedia(datos, datos.get(i).Habitacion);
            Log.d("Media", "La media de " + datos.get(i).Habitacion + " es --> " + d);
        }

    }

    private double calcularMedia (ArrayList<PojoClass> objecte, String habitacion ){
        double suma = 0;
        double media;
        int cont = 0;

        for (int i = 0; i < 8; i++){
            if (objecte.get(i).Habitacion == habitacion){
                suma = suma + objecte.get(i).getTemperatura();
                cont++;
            }
        }
        media = suma/cont;
        return media;
    }

}
