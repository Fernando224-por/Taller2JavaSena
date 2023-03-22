package POLIMORFISMO;

public class Cuadrado extends Figura {
    private float lado;
    public float getlado(){
        return lado;
    }
    public void setlado(float lado){
        this.lado=lado;
    }
    @Override  //sobreescribir
    public void calcularArea() {
        float area= lado*lado;
        System.out.println("el area del cuadrado de lado "+this.lado+" da como resultado "+area);
    }


    
}
