import java.util.ArrayList;
/**
 * Removes and Adds passengers onto the train, prints the names of the passengers, stores information about the train and cars
 */
public class Car {
    /**
     * the arraylist of passengersOnBoard, and maximum capacity of the train
     */
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    /**
    * Creates Cars and adds or removes passengers
    * @param maxCapacity - maximum amount of people than can be on a car
    * @param passengersOnBoard - the passengers on the car
    * @return the maximum amount of space on a car, how many seats are left
    */
    public Car(int maxCapacity){
        this.passengersOnBoard = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;
    }
    /**
     * Returns the maximum capacity of the people on the train
     * @return maxCapacity
     */
    public int getCapacity(){
        return this.maxCapacity;
    }
    /**
     * Retusn the the maximum capacity minus the amount of passengers on boaord
     * @return maximum capacity minus the amount of passengers on board
     */
    public int seatsRemaining(){
        return this.maxCapacity - passengersOnBoard.size();
    }
    /**
     * Adds the passenger from the train, if there is not enough room then prints an exception
     * @param p - the passenger
     */
    public void addPassenger(Passenger p){
        if (this.maxCapacity <= passengersOnBoard.size()) {
            throw new RuntimeException("Not enough room");
        }else if(this.passengersOnBoard.contains(p)){
            throw new RuntimeException("Already on board");
        }else{
            passengersOnBoard.add(p); 
        }
    }
    /**
     * Removes the passenger from the train, if passenger is not in the list then prints a exception
     * @param p - the passenger
     */
    public void removePassenger(Passenger p){
        if (passengersOnBoard.contains(p) == false) { 
            throw new RuntimeException("Passenger is not on board");
        }else{
        passengersOnBoard.remove(p);
        }
    }
    /**
     * Prints out the name of the passengers in the car, if there are no passengers are in the car then it prints out that the car is empty
     */
    public void printManifest(){
        if (passengersOnBoard.size() != 0) {
            System.out.println("PASSENGERS:");
        }else{
            System.out.println("This car is EMPTY.");
        }

        for (int i=0; i<this.passengersOnBoard.size(); i++){
            System.out.println(passengersOnBoard.get(i).passengerName());
        }
    }
}