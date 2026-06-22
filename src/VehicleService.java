import java.util.Scanner;
import java.util.ArrayList;

public class VehicleService {
    // Método dedicado a inclusão de novos veículos ao programa
    public static Vehicles vehicleRegistration(Scanner scanner) {
        System.out.println("\n" + "=".repeat(10) + " CADASTRO DE VEÍCULOS NOVOS " + "=".repeat(10));

        // Loop para validação das informações do veículo
        boolean registeredVehicle = false;

        while (!registeredVehicle) {
            System.out.print("Marca: ");
            String vehicleBrand = scanner.nextLine();

            System.out.print("Modelo: ");
            String vehicleModel = scanner.nextLine();

            System.out.print("Ano: ");
            int vehicleYear = scanner.nextInt();

            System.out.print("Placa: ");
            String vehiclePlate = scanner.nextLine();

            registeredVehicle = true; // Finalizar o loop para retorna e guarda informações
        }

        // Objeto destinado a guarda os dados informados pelo usuário
        Vehicles vehicle = new Vehicles(
            vehicleBrand,
            vehicleModel,
            vehicleYear,
            vehiclePlate
        );

        // Exibir a marca + nome do veículo cadastrado e retorna ao menu interativo
        System.out.println(vehicleBrand + " " + vehicleModel + " Cadastrado!\n");
        return vehicle;
    }


    // Método dedicado a listagem de todos veículos cadastrados no programa
    public static void listVehicles(ArrayList<Vehicles> vehicles) {
        System.out.println("=".repeat(10) + " LISTA DOS VEÍCULOS CADASTRADOS " + "=".repeat(10));

        if (vehicles.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado ainda.\n");
            return;
        }

        for (Vehicles vehicle : vehicles) {
            System.out.println(vehicles);
        }
    }
}
