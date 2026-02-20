public class Persona {
    private String nombre ;  // private ( encapsulamiento) 
    private String nacionalidad;

    void saluda(){ // metodo -lo que realiza (lowerCamelCase)
        System.out.println("hola"); 
    }

    public Persona(){ // constructor vacio

    }

    Persona (String nacionalidad, String nombre){ // constructor, nombr igual q la clase, para iniciar propiedades
        this.nacionalidad=nacionalidad;  // this q hace referencia al objeto instanciado .
        this.nombre=nombre ; 
    }

    void anda(String manera){ // metodo puede tener parametro. (X) -> parametro , puede ser cualquier tipo de dato
        System.out.println("ando"+manera); 
    }

    public String getNombre(){ // traer
        return nombre; 
    }
    public void setNombre(String nombre){ // colocar  
        this.nombre = nombre;   
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
