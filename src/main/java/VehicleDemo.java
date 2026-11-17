public class VehicleDemo {
    public static void main(String[] args) {

// Create a Moped
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);
        slowRide.setFuelCapacity(5);

// Create a Car
        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(20);
        familyCar.setFuelCapacity(15);

// Create a SemiTruck
        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("White");
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(50000);
        bigRig.setFuelCapacity(200);

// Create a Hovercraft
        Hovercraft hoverOne = new Hovercraft();
        hoverOne.setColor("Silver");
        hoverOne.setNumberOfPassengers(8);
        hoverOne.setCargoCapacity(1000);
        hoverOne.setFuelCapacity(75);

// Display vehicle information
        System.out.println("Moped:");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());

        System.out.println("\nCar:");
        System.out.println("Color: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + familyCar.getCargoCapacity());
        System.out.println("Fuel Capacity: " + familyCar.getFuelCapacity());

        System.out.println("\nSemiTruck:");
        System.out.println("Color: " + bigRig.getColor());
        System.out.println("Passengers: " + bigRig.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + bigRig.getCargoCapacity());
        System.out.println("Fuel Capacity: " + bigRig.getFuelCapacity());

        System.out.println("\nHovercraft:");
        System.out.println("Color: " + hoverOne.getColor());
        System.out.println("Passengers: " + hoverOne.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + hoverOne.getCargoCapacity());
        System.out.println("Fuel Capacity: " + hoverOne.getFuelCapacity());
    }
}