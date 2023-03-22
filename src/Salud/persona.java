package Salud;
import java.util.Scanner;
public class persona {
    private Scanner dates=new Scanner(System.in);
    private String tipoDoc;
    private int documento;
    private String name;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;
    public persona(){
    }
    public persona (String tipoDoc,int documento, String name,String apellido,double peso,double estatura,int edad,String sexo){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.name=name;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;

    }
   // int [] vector1=new int[8];
    public void pedirDatos(){
        System.out.println("ingrese su tipo de documento");
        tipoDoc=dates.nextLine();
        dates.nextLine();
        System.out.println("ingrese su numero de documento");
        documento=dates.nextInt();
        dates.nextLine();
        System.out.println("Ingrese su nombre");
        name=dates.nextLine();
        dates.nextLine();
        System.out.println("ingrese su apellido");
        apellido=dates.nextLine();
        dates.nextLine();
        System.out.println("ingrese su peso");
        peso=dates.nextDouble();
        System.out.println("ingrese su estatura");
        estatura=dates.nextDouble();
        System.out.println("ingrese su edad");
        edad=dates.nextInt();
        System.out.println("ingrese el genero al que pertenese");
        sexo=dates.nextLine();
        dates.nextLine();
    }
    

    public void mostrarPersona(){
        System.out.println("sus datos son:");
        System.out.println(tipoDoc);
        System.out.println(documento);
        System.out.println(name);
        System.out.println(apellido);
        System.out.println(peso);
        System.out.println(estatura);
        System.out.println(edad);
        System.out.println(sexo);

    }
    
    public double calcularImc (){
        pesoActual=peso/(estatura*estatura);
            return pesoActual;
        
    }

    public void Imc (){
        pesoActual=peso/(estatura*estatura);
        if (pesoActual<20) {
            System.out.println("su peso esta por debajo de lo ideal");
            System.out.println(pesoActual);

        }
        else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("su peso esta dentro del ideal");
            System.out.println(pesoActual);
        }
        else if(pesoActual>20){
            System.out.println("usted esta en sobrepeso");
            System.out.println(pesoActual);
        }
        else{
            System.out.println("error 405");
    }
    }

    public void validaEdad(){
        if(edad>=18){System.out.println("usted es mayor de edad");}
        else{
            System.out.println("usted es menor de edad");
        }

    }

}
