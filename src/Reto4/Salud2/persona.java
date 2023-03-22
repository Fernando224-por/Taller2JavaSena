package Reto4.Salud2;
public class persona {
    private String tipoDoc;
    private int documento;
    private String name;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;
    public persona(){
    }
    public persona (String tipoDoc,int documento, String name,String apellido,double peso,double estatura,int edad,String sexo){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.name=name;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;

    }
    //inicio metodo set
   public void settipoDoc (String tipoDoc){
    this.tipoDoc=tipoDoc;
}
    public void setdocumento (int documento){
        this.documento=documento;
    }
    public void setname (String name){
        this.name=name;
    }
    public void setapellido (String apellido){
        this.apellido=apellido;
    }
    public void setpeso (Double peso){
        this.peso=peso;
    }
    public void setestatura (Double estatura){
        this.estatura=estatura;
    }
    public void setedad (int edad){
        this.edad=edad;    }
    public void setsexo (String sexo){
        this.sexo=sexo;
    }

    // inicio metodo get
    public String getname(){
        return name;
    }
    public int getdocumento(){
        return documento;
    }
    public double getpeso(){
        return peso;
    }
    public double getestatura(){
        return estatura;
    }
    public int getedad(){
        return edad;
    }
    public String getapellido(){
        return apellido;

    }
    public String getsexo(){
        return sexo;
    }
    public String gettipoDoc(){
        return tipoDoc;
    }

    public double calcularImc (){
        pesoActual=peso/(estatura*estatura);
            return pesoActual;
    }

    public int validEdad(){
        if(edad>=18){
            return 1;
        }
        else{
            return 2;
        }
    }
}
