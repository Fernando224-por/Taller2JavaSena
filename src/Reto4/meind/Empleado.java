package Reto4.meind;
import Reto4.Salud2.persona;
public class Empleado extends persona {
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    private double parcialPay;
    private double discount;
    private Double totalPago;
    public Empleado(){
    }
    public Empleado(String cargo,int valorHora, int horasTrabajadas,double discount,String departamento,Double parcialPay,Double totalPago, String tipoDoc,int documento, String name,String apellido,double peso,double estatura,int edad,String sexo){
        super(tipoDoc, documento, name, apellido, peso, estatura, edad, sexo);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.departamento=departamento;
        this.horasTrabajadas=horasTrabajadas;
        this.discount=discount;
        this.parcialPay=parcialPay;
        this.totalPago=totalPago;
    }
        //inicio metodo set
    public void setcargo(String cargo){
        this.cargo=cargo;
    }
    public void setvalorHora(int valorHora){
        this.valorHora=valorHora;
    }
    public void sethorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }
    public void setdepartamento(String departamento){
        this.departamento=departamento;
    }
        //Fin metodo set
        //inicio metodo get
    public double calcularHonorarios(){
        parcialPay=valorHora*horasTrabajadas;
        discount=(parcialPay*0.966)/100;
        totalPago=parcialPay-discount;
        return totalPago;
    }
    public String getcargo(){
        return cargo;
    }
    public int gethorasTrabajadas(){
        return horasTrabajadas;
    }
    public int getvalorHora(){
        return valorHora;
    }
    public String getdepartamento(){
        return departamento;
    }
    //Fin metodo get
}
