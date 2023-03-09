import java.util.ArrayList;
/**
 * Creates the train, adds cars, and keeps track of passengers
 * @param engine - creating the engine
 * @param cars - the amount of cars
 * @param remaining seats - how many seats are left
 * @return the engine, the list of passengers, max capacity, and capacity remaining
 */

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;
    int remainingSeats = 0;


    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return (this.cars.get(i));
    }

    public int getMaxCapacity(){
        int total=0;
        for(int i=0;i <cars.size();i++){
            total = total + cars.get(i).getCapacity();
        }
        return total;
    }
    
    public int seatsRemaining(){
        int seatsNotTaken=0;
        for(int i=0;i <cars.size();i++){
            seatsNotTaken = seatsNotTaken + cars.get(i).getCapacity();
        }
        return seatsNotTaken - passengerCapacity;
    }

    public void printManifest(){
        if(this.cars.size() ==0){
            System.out.println("This car is EMPTY.");
        }else{
            System.out.println("PASSENGERS:");
        }
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println(i);
        }
    }

}
