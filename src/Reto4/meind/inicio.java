package Reto4.meind;
import java.util.Scanner;
import Reto4.Salud2.persona;
public class inicio {
    public static void main(String[] args) {
        Scanner dates=new Scanner(System.in);
        persona datos= new persona(); //clase o archivo persona
        Empleado data=new Empleado(); //subclase o archivo empleado
        String tipoDoc;
        int documento;
        String name;
        String apellido;
        double peso;
        double estatura;
        int edad;
        String sexo;
        String cargo;
        int horasTrabajadas;
        int valorHora;

    System.out.println("ingrese su tipo de documento");
    tipoDoc=dates.nextLine();
    datos.settipoDoc(tipoDoc);
    dates.nextLine();
    System.out.println("ingrese su numero de documento");
    documento=dates.nextInt();
    datos.setdocumento(documento);
    dates.nextLine();
    System.out.println("Ingrese su nombre");
    name=dates.nextLine();
    datos.setname(name);
    dates.nextLine();
    System.out.println("ingrese su apellido");
    apellido=dates.nextLine();
    datos.setapellido(apellido);
    dates.nextLine();
    System.out.println("ingrese su peso");
    peso=dates.nextDouble();
    datos.setpeso(peso);
    System.out.println("ingrese su estatura");
    estatura=dates.nextDouble();
    datos.setestatura(estatura);
    System.out.println("ingrese su edad");
    edad=dates.nextInt();
    datos.setedad(edad);
    System.out.println("ingrese el genero al que pertenese");
    sexo=dates.nextLine();
    datos.setsexo(sexo);
    dates.nextLine();
    System.out.println("sus datos son:");
    System.out.println(datos.getdocumento());
    System.out.println(datos.gettipoDoc());
    System.out.println(datos.getname());
    System.out.println(datos.getapellido());
    System.out.println(datos.getedad());
    System.out.println(datos.getestatura());
    System.out.println(datos.getpeso());
    System.out.println(datos.getsexo());
    //metodo para validad la edad de la clase persona
    if(datos.validEdad()==1)
    {
        System.out.println("usted es mayor de edad");
    }
    else if(datos.validEdad()==2){
            System.out.println("usted es menor de edad");
    }
    else{
        System.out.println("el rango de edad es ilegible");
    }
    //Calcular imc proveniente de la clase persona
    if (datos.calcularImc()<20) {
        System.out.println("su peso esta por debajo de lo ideal");
        System.out.println("su Indice de Masa Corporal es: "+datos.calcularImc());

    }
    else if(datos.calcularImc()>=20 && datos.calcularImc()<=25){
        System.out.println("su peso esta dentro del ideal");
        System.out.println("su Indice de Masa Corporal es: "+datos.calcularImc());
    }
    else if(datos.calcularImc()>20){
        System.out.println("usted esta en sobrepeso");
        System.out.println("su Indice de Masa Corporal es: "+datos.calcularImc());
    }
    else{
        System.out.println("error 405");
    dates.close();
        }
    //escritura de datos para la subclase Empleado
    System.out.println("ingrese su cargo dentro de la empresa");
    cargo=dates.nextLine();
    data.setcargo(cargo);
    dates.nextLine();
    System.out.println("ingrese la cantidad de horas trabajadas");
    horasTrabajadas=dates.nextInt();
    data.sethorasTrabajadas(horasTrabajadas);
    System.out.println("ingrese el valor actual de la hora de trabajo");
    valorHora=dates.nextInt();
    data.setvalorHora(valorHora);
    //impresion de datos con el GET de la subclase Empleado
    System.out.println("el documento es "+datos.gettipoDoc()+" en donde el numero es "+datos.getdocumento()+" pertenecientes a "+datos.getname()+" con apellidos "+datos.getapellido()+" en el cargo "+data.getcargo()+" en el departamento"+data.getdepartamento());
    System.out.println("donde trabajo "+data.gethorasTrabajadas()+" horas, el valor de horas actual es de "+data.getvalorHora()+" y el valor total a paga es "+data.calcularHonorarios());
}
}
