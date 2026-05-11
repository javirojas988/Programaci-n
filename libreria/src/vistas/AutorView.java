package vistas;

import java.util.ArrayList;

import modelos.Autor;

public class AutorView {
    

    /**
     * @param datos
     */
    public void mostrarAutores( ArrayList<Autor> datos) {

        System.out.println("\nLISTADO DE AUTORES\n=============================================================");
        for(Autor item: datos) {
            System.out.println(item) ;
        }
    }

}
