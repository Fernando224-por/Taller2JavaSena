package POLIMORFISMO;
import java.util.Scanner;
public class Reto5 { 
    public static void main(String[] args) throws Exception {
        PPT tray=new PPT();
        Scanner dates =new Scanner (System.in);
        int opc;
        System.out.println("hola, ¿que juego quieres utilizar?");
        System.out.println("1 para piedra, o tijera; 2 para carisello");
        opc=dates.nextInt();
        tray.setopc(opc);
        tray.iniciar();
        tray.juagr();
        tray.finalizar();
        dates.close();
    }
    
}
