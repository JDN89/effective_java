package org.jdn.creatinganddestoyingobjects;

// This approach is more flexible and readable,
// especially for objects with a large number of parameters.
// It also allows some parameters to be optional,as you can just not call the setter method for optional parameters.
// This is why the Builder Pattern is commonly used in Java for constructing complex objects.

public class BuilderPattern {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("testla", "Model 3")
                .setColor("red")
                .setDoors(4)
                .build();
        System.out.println(car);
    }
}

class Car {
    private String make;
    private String model;
    private String color;
    private int doors;

    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.doors = builder.doors;
    }


    // Static inner class - the builder
    public static class CarBuilder {
        private String make;
        private String model;
        private String color;
        private int doors;

        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }
// Optional parameters
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}