package com.davidmendano.ejemplofragments;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by David.Mendano on 05/05/2017.
 */

public class Ejemplos {

    public static ArrayList<String> revisionesPendientes = new ArrayList<>();

    public Ejemplos() {
    }

    public static ArrayList<String> getLista (String string){
        for (int i=0; i<20; i++) {
            revisionesPendientes.add(string + i);
        }
        return revisionesPendientes;
    }

}
