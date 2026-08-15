interface Vehicle {
    int MAX_SPEED = 120;

    void start();
    void stop();

    default void fuelType() {
        System.out.println("Vehicle uses fuel");
    }

    static void info() {
        System.out.println("This is a Vehicle interface");
    }
}

interface Electric {
    void charge();

    default void batteryInfo() {
        System.out.println("Battery is available");
    }
}

class ElectricCar implements Vehicle, Electric {

    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging");
    }

    @Override
    public void fuelType() {
        System.out.println("Electric car does not use petrol");
    }
}

interface AdvancedVehicle extends Vehicle {
    void selfDrive();
}

class Tesla implements AdvancedVehicle {

    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stopped");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving");
    }
}

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();

        car.start();
        car.stop();
        car.charge();
        car.batteryInfo();
        car.fuelType();

        System.out.println(Vehicle.MAX_SPEED);
        Vehicle.info();

        Vehicle v = new ElectricCar();

        v.start();
        v.stop();
        v.fuelType();

        AdvancedVehicle av = new Tesla();

        av.start();
        av.stop();
        av.selfDrive();

        Calculator calculator = (a, b) -> a + b;

        int result = calculator.add(10, 20);

        System.out.println(result);
    }
}