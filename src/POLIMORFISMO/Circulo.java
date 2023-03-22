package POLIMORFISMO;

public class Circulo extends Figura {
    private float radio;
    public float getradio(){
        return radio;
    }
    public void setradio(float radio){
        this.radio=radio;
    }
    @Override
    public void calcularArea() {
        double area= 3.1416*(radio*radio);
        System.out.println("el area del circulo con radio "+this.radio+" es " +area);
    }
    
}
