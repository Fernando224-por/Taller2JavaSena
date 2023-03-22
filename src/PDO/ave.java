package PDO;
public class ave extends Animal {
    private int envergadura;
    public ave(int envergadura){
        this.envergadura=envergadura;
    }

    public ave (String nombre, int edad, int envergadura){
        super(nombre,edad);
        this.envergadura=envergadura;
    }
    public void mostrarAve(){
        System.out.println("el nombre del animal es "+getNombre()+" y tiene una envergadura de "+envergadura);
    }
}
