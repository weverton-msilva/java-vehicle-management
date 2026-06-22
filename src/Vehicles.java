public class Vehicles {
    String vehicleBrand;
    String vehicleModel;
    int vehicleYear;
    String vehiclePlate;
    
    public Vehicles(String vehicleBrand, String vehicleModel, int vehicleYear, String vehiclePlate) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehiclePlate = vehiclePlate;
    }

    @Override
    public String toString() {
        return "Marca: " + vehicleBrand +
               "\nModelo: " + vehicleModel +
               "\nAno: " + vehicleYear +
               "\nPlaca: " + vehiclePlate +
               "\n" + "-".repeat(30);
    }
}
