package tema4.ejercicio;

public class t3_ej2_java {

     public static void main(String[] args) {
        
     
        float nota ;
        System.out.println("nota?");
        nota = Float.parseFloat(System.console().readLine());
       
        //primero
        if (nota>=0 ) {
            if (nota<=10){
                if (nota>=5){
                    System.out.println("aprobao");
                } 
                else {
                    System.out.println("suspendio");
                }
            } else {
                System.out.println("no puede se mayor q die");
            }
        }else {
           
            System.out.println("no puede se MENOS q 0");
        }
        

    }
}  
