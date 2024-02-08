package activities;

public class Activity1 {
    public static void main(String[] args){
        Car carCode=new Car();
        carCode.make=2021;
        carCode.transmission="Automatic";
        carCode.color= "Maroon";

        carCode.displayCharacteristics();
        carCode.accelerate();
        carCode.brake();
    }
}
