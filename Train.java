import java.util.ArrayList;
/**
 * Creates the train, adds cars, and keeps track of passengers, and is able to get the engine and cars
 */

public class Train {
    /**
     * the engine, and car arraylist
     */
    private final Engine engine;
    private ArrayList<Car> cars;
    /**
     * The train with its fuel details, number of cars, and amount of the people that can fit in the train.
     * @param fuelType - the type of fuel being used in the train
     * @param fuelCapacity -  the amount of fuel that can be held
     * @param nCars - the amount of cars attached o the train
     * @param passengerCapacity - the maximum amount of passengers that can go into the car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            this.cars.add(car);
        }
    }
    /**
     * The getter for the engine class
     * @return engine
     */
    public Engine getEngine(){
        return this.engine;
    }
    /**
     * The getter for the car class
     * @return the cars attached to the train
     */
    public Car getCar(int i){
        if (i>this.cars.size()) {
            throw new RuntimeException("The train doesn't have that many cars.");
        }
        return this.cars.get(i);
    }
    /**
     * Goes through each car, and adds the amount of seats
     * @return total - the maximum amount of seats in the train
     */
    public int getMaxCapacity(){
        int total=0;
        for(int i=0;i <cars.size();i++){
            total += cars.get(i).getCapacity();
        }
        return total;
    }
    /**
     * Goes through each car and finds how many seats are left
     * @return seatsNotTaken - the amount of seats available
     */
    public int seatsRemaining(){
        int seatsNotTaken=0;
        for(int i=0;i <cars.size();i++){
            seatsNotTaken += cars.get(i).seatsRemaining();
        }
        return seatsNotTaken;
    }
    /**
     * Prints out the names of all the passengers in each car
     */
    public void printManifest(){
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).printManifest();
        }
    }


public static void main(String[] args) {
    Train trainOne = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
    try{
        while(true){
            trainOne.engine.go();
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    trainOne.engine.refuel();
    System.out.println(trainOne.engine.getCurrentFuelLevel());

    Passenger sam = new Passenger("Sam");
    Passenger rachel = new Passenger("Rachel");
    Passenger james = new Passenger("James");
    Passenger ang = new Passenger("Ang");
    trainOne.cars.get(0).addPassenger(sam);
    trainOne.cars.get(1).addPassenger(rachel);
    trainOne.cars.get(0).addPassenger(james);
    trainOne.cars.get(1).addPassenger(ang);
    trainOne.cars.get(0).removePassenger(sam);
    System.out.println(trainOne.getMaxCapacity());
    System.out.println(trainOne.seatsRemaining());
    trainOne.printManifest();

    Car carOne = new Car(10);
    rachel.boardCar(carOne);
    rachel.boardCar(carOne);
    rachel.getOffCar(carOne);
    rachel.getOffCar(carOne); 
    carOne.addPassenger(rachel);
    carOne.printManifest();
    carOne.removePassenger(rachel);
    carOne.printManifest();
    }
}
