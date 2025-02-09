public class AppFiguras {
    public static void main(String[] args) {
        
        Circulo circle = new Circulo(10);
        Triangulo triangle = new Triangulo(2,3);
        Rectangulo rectangle = new Rectangulo(2,3);
        Cuadrado square = new Cuadrado(5);
        
        
        System.out.println("El area del Circulo: " + circle.calcularArea());
        System.out.println("El area del Triangulo: " + triangle.calcularArea());
        System.out.println("El area del Rectangulo: " + rectangle.calcularArea());
        System.out.println("El area del Cuadrado: " + square.calcularArea());
    }
}
