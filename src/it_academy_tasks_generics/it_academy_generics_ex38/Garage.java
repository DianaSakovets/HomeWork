package it_academy_tasks_generics.it_academy_generics_ex38;

public class Garage <T extends Vehicle> {
    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicle +
                '}';
    }

    public T getNameOfVehicle() {
        return vehicle;
    }

    T vehicle;
    public Garage(T vehicle){
        this.vehicle = vehicle;
    }



}
