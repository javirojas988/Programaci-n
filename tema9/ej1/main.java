// import gato no lo uso porque estan en el mismo paquete 

public class main {
    public static void main(String[] args) {
        Persona alu1 = new Persona("Checoeslovaco","javi"); // con el  constructor con datos que van a tener ese objeto 
        Persona alu2 = new Persona(); // con el constructor vacio 
//        
        // int nombre = alu2.getNombre();
        System.out.println("Nacionalidad alu1 "+ alu1.getNacionalidad());
        System.out.println("Nombre alu1 "+ alu1.getNombre() );

        alu2.setNacionalidad("peruano");
        alu2.setNombre("isaac");
        
        System.out.println("Nombre alu2 "+ alu2.getNombre() );
        System.out.println("nacionalidad alu2 : "+ alu2.getNacionalidad());
        alu1.saluda();
    }
   
}     
