/**
 * Adds or removes passengors from Cars
 * @param name - name of passenger
 * @return null
 */

public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        try {
            while (true) {
                c.addPassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }           
    }

    public void getOffCar(Car c){
        try {
            while (true) {
                c.removePassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }    
    }
}
