import java.util.Scanner;
public class eje8 {
    public static void main(String[] args) {
        int[] temperaturaMedia = new int[12];
        Scanner sc = new Scanner(System.in);
        int respuesta ; 
        
        String [] meses = { "     enero" , "   febrero" , "     marzo" , "     abril" , "      mayo" , "     junio" , "     julio" , "    agosto" , "septiembre" , "   octubre" , " nobiembre" , " diciembre"};
        for(int j=0 ; j<12 ; j++){
            System.out.print("tempeatura media en "+ meses[j] + "? : ");    
            respuesta = sc.nextInt();
            temperaturaMedia[j]= respuesta ; 
        }
        // Se hace array string meses 

        for(int i = 0 ; i < 12 ; i++ ){
            System.out.print(meses[i]+"  |");
            
            for(int x = 0 ; x<temperaturaMedia[i] ; x++){
                System.out.print("O");
            } 
            System.out.println(" "+temperaturaMedia[i]+" Cº");
        }
    }
}
