// Week 3 Question 2

abstract class Taxi {
    String vehicleName;
    String vehicleType;
    String vehicleNo;
    String driverName;
    int tripDistance;
    String source;
    String destination;

    public Taxi(String vehicleName, String vehicleType, String vehicleNo, String driverName) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.vehicleNo = vehicleNo;
        this.driverName = driverName;
    }

    void bookTrip(int dist, String source, String dest) {
        tripDistance = dist;
        this.source = source;
        this.destination = dest;
        System.out.println("Trip is booked");
    }

    void startTrip() {
        System.out.println("Trip is started");
    }

    abstract void endTrip();
}

class OLA extends Taxi {
    float costPerKilometer;
    float totalCost;

    public OLA(String vehicleName, String vehicleType, String vehicleNo, String driverName) {
        super(vehicleName, vehicleType, vehicleNo, driverName);
    }

    void setCostPerKm(float cost) {
        costPerKilometer = cost;
        totalCost = costPerKilometer * tripDistance;
    }

    @Override
    void endTrip() {
        System.out.println("Trip is ended");
        System.out.println("Total bill payment: Rs. " + totalCost);
    }
}

class UBER extends Taxi {
    float costPerKilometer;
    float totalCost;

    public UBER(String vehicleName, String vehicleType, String vehicleNo, String driverName) {
        super(vehicleName, vehicleType, vehicleNo, driverName);
    }

    void setCostPerKm(float cost) {
        costPerKilometer = cost;
        totalCost = costPerKilometer * tripDistance;
    }

    @Override
    void endTrip() {
        System.out.println("Trip is ended");
        System.out.println("Total bill payment: Rs. " + totalCost);
    }
}

class Fasttrack extends Taxi {
    float costPerKilometer;
    float totalCost;

    public Fasttrack(String vehicleName, String vehicleType, String vehicleNo, String driverName) {
        super(vehicleName, vehicleType, vehicleNo, driverName);
    }

    void setCostPerKm(float cost) {
        costPerKilometer = cost;
        totalCost = costPerKilometer * tripDistance;
    }

    @Override
    void endTrip() {
        System.out.println("Trip is ended");
        System.out.println("Total bill payment: Rs. " + totalCost);
    }
}

public class VehicleBooking {
    public static void main(String[] args) {
        OLA ola = new OLA("Sedan", "Car", "ABC123", "John");
        ola.bookTrip(10, "A", "B");
        ola.setCostPerKm(10);
        ola.startTrip();
        ola.endTrip();

        UBER uber = new UBER("SUV", "Car", "XYZ456", "Alice");
        uber.bookTrip(15, "C", "D");
        uber.setCostPerKm(12);
        uber.startTrip();
        uber.endTrip();

        Fasttrack fasttrack = new Fasttrack("Hatchback", "Car", "DEF789", "Bob");
        fasttrack.bookTrip(20, "E", "F");
        fasttrack.setCostPerKm(15);
        fasttrack.startTrip();
        fasttrack.endTrip();
    }
}
