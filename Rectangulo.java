package rectangulo;

public class Rectangulo {
    double ancho = 1 ;
    double altura  = 1 ;
    public void Rectangulo () {}
    
    public void Rectangulo (double ancho, double altura) {
    this.ancho = ancho ;
    this.altura = altura; 
    }
    public double getPerimetro(){
    double respuesta = 2*(this.ancho * this.altura);
    return respuesta ;
    }
   
    public double getArea () {
    double respuesta_2 = this.ancho * this.altura;
    return respuesta_2 ;
    }    
    public void mostrar () {
    System.out.println ("LA ALTURA ES:"	+this.ancho);
    System.out.println ("EL ANCHO ES:" 	+this.altura);
    System.out.println("EL PERIMETRO ES:" +this.getPerimetro());
    System.out.println("EL AREA ES:" +this.getArea()); 
    }
    public static void main (String [] args ){
    Rectangulo prueba1 = new Rectangulo () ;
    prueba1.altura = 4 ;
    prueba1.ancho = 40 ;
    prueba1.getArea() ;
    prueba1.getPerimetro() ;
    prueba1.mostrar();
    
    Rectangulo prueba2=new Rectangulo ();
    System.out.println("CALCULO DE AREA Y PERIMETRO DEL TRIANGULO");
    Rectangulo rec2= new Rectangulo ();
    prueba2.altura = 3.5;
    prueba2.ancho = 35.9;
    prueba2.mostrar ();
    
    }   
}
