import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    // Método de execução principal do programa
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicles> vehicles = new ArrayList<>();

        // Loop para execução da interface e menu do usuário
        boolean generateInterface = true;

        while (generateInterface) {
            System.out.println("=".repeat(10) + " GESTÃO DE FROTAS SIMPLES " + "=".repeat(10));

            System.out.println("\n" + """
            1- Cadastrar Novos Veículos
            2- Listar Todos Veículos
            3- Excluir Veículo
            4- Sair do Sistema""");;

            int selectedOption;

            try {
                System.out.print("Opção Selecionada: ");
                selectedOption = scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("\nOpção informada não está disponível entre as opções do menu.");
                scanner.nextLine(); // Limpar buffer
                continue;
            }

            switch (selectedOption) {
                case 1: { // Redirecionar para o método de cadastro de novos veículos
                    Vehicles vehicle = VehicleService.vehicleRegistration(scanner); 
                    vehicles.add(vehicle);
                    break;
                }      

                case 2: { // Redirecionar para o método de listagem de todos veículos
                    VehicleService.listVehicles(vehicles);
                    break;
                }
            }
        }
    }
}
