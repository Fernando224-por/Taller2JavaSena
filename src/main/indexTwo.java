package main;
import java.util.Scanner;
import Salud.persona;
public class indexTwo {
    public static void main(String[] args) {
        Scanner dates=new Scanner(System.in);
        persona datos=new persona();
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.validaEdad();  
        datos.Imc();
        dates.close();
    }
}
