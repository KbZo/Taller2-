package persona;

public class Empleado extends Persona  {

    public Empleado(double salario , String fecha) {
    }
     
     private double salario ;
     private String fecha ;   

 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public static void main(String[] args) {
    Empleado em = new Empleado (34.5 , "14 deJunio");    
    }
}
