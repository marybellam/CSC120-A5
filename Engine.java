/**
 * Stores information about the amount of fuel in the engine, and the type of fuel
 */
public class Engine {
    /**
     * the fuel type, current fuel level, and max fuel level of the engine
     */
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Retuns the fuel type of the engine
     * @return f - fuel type
     */
    public FuelType getFuelType(){
        return f;
    }
    /**
     * Returns the amount of fuel currently left in the engine
     * @return currentFuelLevel - the amount of fuel currently in the engine
     */
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }
    /**
     * returns the maximum amount of fuel the engine can hold
     * @return maxFuelLevel - the maximum amount of fuel the engine can hold
     */
    public double getmaxFuelLevel(){
        return maxFuelLevel;
    }
    /**
     * Has variables for the type of fuel, maximum fuel level, and current fuel level.
     * @param f The train's fuel type.
     * @param maxFuelLevel The train's maximum amount of fuel.
     * @param currentFuelLevel The train's current fuel level.
     */
    public Engine(FuelType f,double maxFuelLevel){
        this.f = f;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }
    /**
     * Sets the current fuel level to the maximum fuel level
     */
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }
    /**
     * Removes 10 fuel from the currentfuel and prints out the amount of fuel remaining, if out of fuel it will print an exception, 
     */
    public void go(){
        this.currentFuelLevel = this.currentFuelLevel -10;
        if (this.currentFuelLevel <= 0 ) { 
            throw new RuntimeException("Out of fuel!");
        }else{
            System.out.println("Amount of Fuel Remaining:" + this.currentFuelLevel);
        }
    }
}