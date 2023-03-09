/**
 * Creates the Engine object and changes fuel amounts
 * @param FuelType the type of fuel in this engine
 * @param currentFuelLevel - mthe current amount of fuel
 * @param maxFuelLevel - the maximum amount of Fuel
 * @return the current amount of fuel left, the max amont of fuel, and fuel type
 */

public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public FuelType getFuelType(){
        return f;
    }
    
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    public double getmaxFuelLevel(){
        return maxFuelLevel;
    }

    public Engine(FuelType f,double maxFuelLevel){
        this.f = f;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    public void refuel(){
        currentFuelLevel = maxFuelLevel;
    }

    public void go(){
        currentFuelLevel = currentFuelLevel-20;
        System.out.println("Amount of Fuel Remaining:" + currentFuelLevel);
        if (this.currentFuelLevel <= 0 ) { 
            throw new RuntimeException("out of fuel");
        }
    }

}