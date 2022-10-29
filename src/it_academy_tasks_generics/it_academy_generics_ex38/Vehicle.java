package it_academy_tasks_generics.it_academy_generics_ex38;

public class Vehicle {
    protected String name;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public Vehicle(String name) {
        this.name = name;
    }

}
