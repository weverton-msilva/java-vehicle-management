import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class main {
    // Método principal do programa
    public static void main(String[] args) {
        // Objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Objeto ArrayList dos veículos cadastrados
        ArrayList<Vehicles> vehicles = new ArrayList<>();

        // Loop para imprimir a interface de opções
        boolean codeRunning = true;

        while (codeRunning) {
            System.out.println("=".repeat(10) + " Sistema de Gestão de veículos " + "=".repeat(10));

            System.out.print("""
            Opções Disponíveis
            1- Cadastrar Veículos
            2- Listar Todos Veículos
            3- Excluir Veículo
            4- Sair do Sistema
            """);

            // Entrada e validação dos dados passado pelo usuário
            int menuOption;

            try {
                System.out.print("Opção Selecionada: ");
                menuOption = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer
                
            } catch(InputMismatchException e) {
                System.out.println("A opção precisa ser apenas números inteiros.\n");
                continue;
            }

            // Redirecionamento do usuário ao método necessário
            switch (menuOption) {
                case 1: {
                    Vehicles vehicle = VehicleService.vehicleRegistration(scanner);
                    vehicles.add(vehicle);
                    break;
                }

                case 2: {
                    VehicleService.listVehicles(vehicles);
                    break;
                }

                case 3: {
                    VehicleService.excludeVehicles();
                    break;
                }
                    

                case 4:
                    System.out.println("\nSaíndo do Sistema...");
                    codeRunning = false;
                    
                default:
                    System.out.println("\nOpção fora das informadas no menu, tente novamente.");
                    continue;
            }
        }

        scanner.close(); // Finalizar o objeto Scanner
    }
}
