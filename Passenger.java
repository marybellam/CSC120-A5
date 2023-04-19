/**
* Stores information about passenger's names, and boards or leaves cars
* @param arguments - the arguments in the program
*/
public class Passenger {

     /**
     * The name of the passenger
     */
    private String name;
    /**
     * Has the name of each pasenger on the train
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }
    /**
     * Gets the name of the passenger
     * @return this.name - the name of the passenger
     */
    public String passengerName(){
        return this.name;
    }

    /**
     * Add passengers' name to the train once they board the train
     * @param c the train car that the passenger enters
     */
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }           
    }
    
    /**
     * Removes passengers' name from the train once they leave the train
     * @param c the train car that the passenger leaves
     */
    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }    
    }
}
