package POLIMORFISMO;

public class Rectangulo extends Figura {
    private float base;
    private float altura;
    public float getbase(){
        return base;
    }
    public float getaltura(){
        return altura;
    }
    public void setbase(float base){
        this.base=base;

    }
    public void setaltura (float altura){
        this.altura=altura;
    }
    @Override
    public void calcularArea() {
        double area= base * altura ;
        System.out.println("el area del rectangulo con base "+this.base+" y altura "+this.altura+" es "+area);
    }
    
}
