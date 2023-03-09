import java.util.ArrayList;
/**
 * Creates Cars and adds or removes passengers
 * @param maxCapacity - maximum amount of people than can be on a car
 * @param passengersOnBoard - the passengers on the car
 * @return the maximum amount of space on a car, how many seats are left
 */

public class Car {
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    public Car(int maxCapacity){
        this.passengersOnBoard = new ArrayList<Passenger>();
        this.maxCapacity = maxCapacity;
    }

    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        return this.maxCapacity - passengersOnBoard.size();
    }

    public void addPassenger(Passenger p){
        if (this.maxCapacity <= passengersOnBoard.size()) {
            throw new RuntimeException("not enough room");
        }else{
            passengersOnBoard.add(p); 
        }
    }

    public void removePassenger(Passenger p){
        if (passengersOnBoard.contains(p)) { 
            throw new RuntimeException("passenger is not on board");
        }
        passengersOnBoard.remove(p);
    }

    public void printManifest(){
        if(passengersOnBoard.size() ==0){
            System.out.println("This car is EMPTY.");
        }else{
            System.out.println("PASSENGERS:");
            for (int i = 0; i < passengersOnBoard.size(); i++) {
                System.out.println(passengersOnBoard.get(i) + " ");
            }
        }
    }
}