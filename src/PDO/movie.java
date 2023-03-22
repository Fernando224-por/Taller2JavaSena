package PDO;
import java.util.Scanner;
public class movie{
    private String name;
    public int duraion;
    String category;
    public String director;
    public movie(){

    }
    public movie (String name, int duraion, String category, String director){
        this.name=name;
        this.duraion=duraion;
        this.category=category;
        this.director=director;
    }
    movie avatar=new movie("avatar", 145, "fiction/action", "James Cameron");
    movie minions=new movie("Minions", 140, "animation/family", "Pierre Coffin");
    int aum=15;
    //metodos
    private Scanner dates=new Scanner(System.in);
    public void addMovie(){
        System.out.println("nombre de la pelicula");
        name=dates.nextLine();
        dates.nextLine();
        System.out.println("duracion de la pelicula (en minutos)");
        duraion=dates.nextInt();
        System.out.println("Categoria de la pelicula");
        category=dates.nextLine();
        dates.nextLine();
        System.out.println("ingrese el director de la pelicula");
        director=dates.nextLine();
    }
    public void changeCategory(String newCategory){
        category=newCategory;
    }
    public int addcredits(){
        duraion=duraion+aum;
        return duraion;
    }
    public void printMovie(){
        System.out.println("estos son los datos ingresados en el sistema");
        System.out.println(name);
        System.out.println(duraion);
        System.out.println(category);
        System.out.println(director);
    }
}

