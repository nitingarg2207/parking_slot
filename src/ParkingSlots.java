import java.util.ArrayList;
public class ParkingSlots{
    int levels;
    private  ArrayList<Spots> bikeSpot;
    private  ArrayList<Spots> carSpot;
    private  ArrayList<Spots> busSpot;

    ParkingSlots(){
        levels = 3;
        bikeSpot = new ArrayList<>();
        carSpot = new ArrayList<>();
        busSpot = new ArrayList<>();

        for(int i = 0; i< levels; i++){
            bikeSpot.add(new Spots((i+1) * 10));
            carSpot.add(new Spots((i+1) * 10));
            busSpot.add(new Spots((i+1) * 10));
        }
    }

    public void park(Vehicle vehicle) {
        try {
            boolean parked = false;
            ArrayList<Spots> spots = null;
            if (vehicle instanceof Bike) {
                spots = bikeSpot;
            } else if (vehicle instanceof Car) {
                spots = carSpot;
            } else if (vehicle instanceof Bus) {
                spots = busSpot;
            } else {
                System.out.println("unsupported vehicle type");
                return;
            }
            for (int i = 0; i < levels; i++) {
                if (spots.get(i).s.contains(vehicle.getVehicleNumber())) {
                    throw new AlreadyParkedException();
                } else if (spots.get(i).count >= 1) {
                    spots.get(i).s.add(vehicle.getVehicleNumber());
                    parked = true;
                    spots.get(i).count = spots.get(i).count - 1;
                    break;
                }
            }
            if (!parked) {
                System.out.println("unsupported vehicle type");
                return;
            }
        } catch (AlreadyParkedException | IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("vehicle"+vehicle.getVehicleNumber()+" parked successfully");
    }

    public enum VehicleType {
        Bike,
        Car,
        Bus
    }

    public void unpark(VehicleType vehicleType, int vehicleNumber) {
        try {
            boolean unparked = false;
            ArrayList<Spots> spots;

            switch (vehicleType) {
                case Bike:
                    spots = bikeSpot;
                    break;
                case Car:
                    spots = carSpot;
                    break;
                case Bus:
                    spots = busSpot;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported vehicle type");
            }

            for (int i = 0; i < levels; i++) {
                if (!spots.get(i).s.contains(vehicleNumber)) {
                    continue;
                } else {
                    spots.get(i).s.remove(vehicleNumber);
                    unparked = true;
                    spots.get(i).count++;
                    break;
                }
            }

            if (!unparked) {
                throw new NoVehicleParked(vehicleNumber);
            }
        } catch (NoVehicleParked | IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println(vehicleType + " with number " + vehicleNumber + " retrieved successfully");
    }


}