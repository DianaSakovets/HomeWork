package it_academy_tasks_generics.it_academy_generics_ex38;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson");

        Garage<Car> garage1 = new Garage<>(car);
        Garage<Motorcycle> garage2 = new Garage<>(motorcycle);

        System.out.println(garage1.getNameOfVehicle());
        System.out.println(garage2.getNameOfVehicle());
    }
}
