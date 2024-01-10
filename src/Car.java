public class Car extends Vehicle{
    int vehicle_number;
    Car(int vehicle_number){
        this.vehicle_number=vehicle_number;
    }
    public int getVehicleNumber(){
        return vehicle_number;
    }
}