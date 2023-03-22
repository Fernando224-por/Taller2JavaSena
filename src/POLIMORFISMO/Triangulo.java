package POLIMORFISMO;

public class Triangulo extends Figura {
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
        double area= (base * altura)/2 ;
        System.out.println("el area del triangulo con base "+this.base+" y altura "+this.altura+" es "+area);
    }
    public void setlado(float base2, float altura2) {
    }
}
