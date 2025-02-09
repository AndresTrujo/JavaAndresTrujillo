public class SUV extends Carro {
    boolean cuatroRuedas;
    
    public SUV(boolean cuatroRuedas, String color){
        super(color);
        this.cuatroRuedas = cuatroRuedas;     
    }
    
    public String toString(){
        return "Color: " + color + 
                "\nCuatro Ruedas: " + cuatroRuedas;
    }
}
