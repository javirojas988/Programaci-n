package tema9.ejX;
//  Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto.
//  Crea, al menos, tres métodos específicos de cada clase y redefine el/los método/s cuando sea necesario.
//  Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.

import tema9.ejX.clases.Lagarto;
import tema9.ejX.clases.Perro;
import tema9.ejX.clases.Pinguino;

public class app {
    public static void main(String[] args) {
        Pinguino Pingui1 = new Pinguino(); 
        Perro Perro1 = new Perro() ;
        Lagarto Lagar1 = new Lagarto() ; 
        Lagar1.Reptiliar();
        Perro1.Ladrar(); 
        Pingui1.Dormi();
        Perro1.Dormi();
        Lagar1.Dormi();
    }
}
