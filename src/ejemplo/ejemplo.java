package ejemplo;
import PDO.movie;
import java.util.Scanner;
public class ejemplo {
    public static void main(String[] args) {
        int opc;
        /*int dPelicula;*/
        String c;
        Scanner dates=new Scanner(System.in);
        movie datos=new movie();
        datos.addMovie();
        System.out.println("requiere cambiar la categoria de la pelicula?");
        opc=dates.nextInt();
        dates.nextLine();
        switch(opc){
            case 1:
            System.out.println("digita la nueva categoria de la pelicula");
            c=dates.nextLine();
            datos.changeCategory(c);
            break;
            default:
            System.out.println("no se realizaron cambios en la categoria de la pelicula");
            break;
        }
        datos.addcredits();
        int resultado=datos.addcredits();
        System.out.println("el nuevo tiempo de la pelicula es"+resultado);
        dates.close();
        datos.printMovie();
    }
}


