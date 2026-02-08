public class Persona {
    private String nombre ;  // private ( encapsulamiento) 
    private String nacionalidad;

    void saluda(){ // instancia
        System.out.println("hola"); 
    }

    Persona (String nacionalidad){ // constructor, nombr igual q la clase, para iniciar propiedades
        this.nacionalidad=nacionalidad;  // this q hace referencia al objeto instanciado .
    }

    void anda(String manera){ // parametro , puede ser cualquier tipo de dato
        System.out.println("ando"+manera); 
    }
}
