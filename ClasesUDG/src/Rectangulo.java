public class Rectangulo {
   double base;
   double altura;
    
   public Rectangulo(double base, double altura){
       this.base = base;
       this.altura = altura;
   } 
   
   public double calcularArea(){
       return base * altura;
   }
}
