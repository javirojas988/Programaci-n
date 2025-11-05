package tema4.ejercicio;

//programa que dada una hora determinada calcule los segundos que faltas para llegar a media noche
public class T4ejer10 {
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        int restante;
        int Sminutos;

        System.out.println("Buenas , este es un programa que calculamos los segundos que quedan hasta medianoche");
        System.out.print("Introduzca SOLO la hora:  ");
        hora = Integer.parseInt(System.console().readLine());
        if (hora > 24) {
            System.out.println("error , introduce una cantidad de horas valida");
        } else {
            System.out.print("Introduzca SOLO los minutos:  ");
            minutos = Integer.parseInt(System.console().readLine());
            if (minutos > 60) {
                System.out.println("error , introduce una cantidad de minutos valida");
            } else {
                Sminutos = minutos * 60;
                restante = 24 - hora;
                segundos = (restante * 3600) + Sminutos;
                System.out.println("Quedan  " + segundos + " para medianoche");
            }
        }
    }
}
