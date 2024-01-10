//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingSlots Parking = new ParkingSlots();
        for (int i=0;i<20;i++){
            Bike B=new Bike(i);
            Parking.park(B);
        }
        Parking.park(new Bike(15));
        Parking.unpark(ParkingSlots.VehicleType.Bike,15);
        Parking.park(new Bike(15));
    }
}