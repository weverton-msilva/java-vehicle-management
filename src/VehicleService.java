import java.util.Scanner;
import java.util.ArrayList;

public class VehicleService {
    // Método para cadastro de informações do veículo
    public static Vehicles vehicleRegistration(Scanner scanner) {
        System.out.println("\n" + "=".repeat(10) + " Cadastrar Veículo " + "=".repeat(10));

        // Exibição das informações necessárias para cadastro de veículos
        System.out.print("Marca: ");
        String vehicleBrand = scanner.nextLine();

        System.out.print("Modelo: ");
        String vehicleModel = scanner.nextLine();

        System.out.print("Ano: ");
        int vehicleYear = scanner.nextInt();

        System.out.print("Renavam: ");
        int vehicleRenavam = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        System.out.print("Placa: ");
        String vehiclePlate = scanner.nextLine();

        // Objeto com os dados informados pelo usuário
        Vehicles vehicle = new Vehicles(
            vehicleBrand,
            vehicleModel,
            vehicleYear,
            vehicleRenavam,
            vehiclePlate
        );

        System.out.println(vehicleBrand + " " + vehicleModel + " Cadastrado!\n");
        return vehicle;
    }


    // Método para listar todos os veículos cadastrados
    public static void listVehicles(ArrayList<Vehicles> vehicles) {
        System.out.println("=".repeat(10) + " Lista de Veículos " + "=".repeat(10));

        if (vehicles.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.\n");
            return;
        }

        for (Vehicles vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println();
    }
    

    // Método para excluir todos os veículos cadastrados
    public static void excludeVehicles() {
        System.out.println("=".repeat(10) + " Excluir Veículos " + "=".repeat(10));
    }
}
