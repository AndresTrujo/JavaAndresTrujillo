public class Sedan extends Carro{
    int kilometraje;
    public Sedan(String color, int kilometraje){
        super(color);
        this.kilometraje = kilometraje;
    }
    
    public String toString(){
        return "Color: " + color + 
                "\nKilometraje: " + kilometraje;
    }
}
