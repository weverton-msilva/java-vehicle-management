public class Vehicles {
    String vehicleBrand;
    String vehicleModel;
    int vehicleYear;
    int vehicleRenavam;
    String vehiclePlate;
    
    public Vehicles(String vehicleBrand, String vehicleModel, int vehicleYear, int vehicleRenavam, String vehiclePlate) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleRenavam = vehicleRenavam;
        this.vehiclePlate = vehiclePlate;
    }

    @Override
    public String toString() {
        return "Marca: " + vehicleBrand +
               "\nModelo: " + vehicleModel +
               "\nAno: " + vehicleYear +
               "\nRenavam: " + vehicleRenavam +
               "\nPlaca: " + vehiclePlate +
               "\n" + "-".repeat(30);
    }
}
