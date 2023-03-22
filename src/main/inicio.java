package main;
import Salud.persona;
public class inicio {
    public static void main(String[] args) {
        persona datos=new persona();//cuando se realiza una sobre carga y ya hay un objeto se debe comentar o eliminar para que se ejecute la sobrecarga

        /*persona antemp=new persona("TI", 1013260718, "Andres", "Malagon", 58.50, 1.75, 17, "Masculino");*/
        double Imc;
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.validaEdad();
        Imc=datos.calcularImc();

        if (Imc<20) {
            System.out.println("su peso esta por debajo de lo ideal");
            System.out.println("su Indice de Masa Corporal es: "+Imc);

        }
        else if(Imc>=20 && Imc<=25){
            System.out.println("su peso esta dentro del ideal");
            System.out.println("su Indice de Masa Corporal es: "+Imc);
        }
        else if(Imc>20){
            System.out.println("usted esta en sobrepeso");
            System.out.println("su Indice de Masa Corporal es: "+Imc);
        }
        else{
            System.out.println("error 405");
            
    }
}
}
