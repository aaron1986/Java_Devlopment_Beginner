public class Car {

    //Fields
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;


    //Constructor
    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    //Create getters
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    //Create Methods
    public String startEngine() {
        return "Engine Started";
    }

    public String accelerate() {
        return "Accelerate";
    }

    public String brake() {
        return "Car Braking";
    }
}
    //Create 3 new sub classes. Note extra classes are outside of the original class
    class RangeRover extends Car {

        public RangeRover(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Engine has not started!!";
        }
    }

    class Lamborghini extends Car {

    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
        public String accelerate() {
        return "Don't Accelerate!!";
    }
}

class Porsche extends Car {

    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Brakes Don't Work!!";
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {

    public static void main(String[] args){
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        RangeRover range = new RangeRover(4, "Land Rover");
        System.out.println(range.startEngine());

        Lamborghini lamb = new Lamborghini(12, "Diablo");
        System.out.println(lamb.accelerate());

        Porsche por = new Porsche(6, "911");
        System.out.println(por.brake());
    }

}
