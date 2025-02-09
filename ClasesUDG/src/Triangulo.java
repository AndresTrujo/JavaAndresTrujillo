public class Triangulo extends Figura {
   double base;
   double altura;
    
   public Triangulo(double base, double altura){
       this.base = base;
       this.altura = altura;
   } 
   //radio*radio
   //Math.pow(radio,2)
   @Override
   public double calcularArea(){
       return (base * altura) / 2;
   }
}
