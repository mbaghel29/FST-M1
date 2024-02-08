package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("Color of the car: "+color);
        System.out.println("Transmission of the car: "+transmission);
        System.out.println("Car was made in year: "+make);
        System.out.println("Car has: "+tyres + "tyres");
        System.out.println("Car has: "+doors + "doors");
    }

    public void accelerate(){
        System.out.println("Car is moving");
    }

    public void brake(){
        System.out.println("Car has Stopped");
    }
}
