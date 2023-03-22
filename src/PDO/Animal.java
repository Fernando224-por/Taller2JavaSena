package PDO;
import java.util.Scanner;
public class Animal{
    //atributos
    String nombre;
    int edad;
    //metodos
    private Scanner dates=new Scanner(System.in);
    //METODO CONSTRUCTOR
    public Animal(){
    }
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //metodos accesores "get" o "set"
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void registarAnimal(String n, int D){
        //cuerpo del metodo

        /*System.out.println("ingrese el nombre del animal");
        nombre=dates.nextLine();

        System.out.println("ingrese la edad del animal");
        edad=dates.nextInt();*/
            nombre=n;
            edad=D;
    }
    public int duplEdad(int e){
        int duplicar=e*2;
        return duplicar;
    }
    public void mostrarAnimal(){
        System.out.println("el animal ingresado se llama "+nombre+" y su edad en años es "+edad);
        dates.close();
    }
}
