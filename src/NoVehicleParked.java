public class NoVehicleParked extends Exception{
    public NoVehicleParked(int vehicle_number){
        super("No Vehicle Parked With Number "+vehicle_number);
    }
}
