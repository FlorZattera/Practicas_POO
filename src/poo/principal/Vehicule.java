package src.poo.principal;

public class Vehicule {
    public String brand;
    public int maxSpeed;
    public String color;

    public String moveOn(){
        return "Estoy avanzando";
    }

    public String brake() {
        return "Estoy frenando";
    }
}
