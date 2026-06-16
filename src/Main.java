import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    // Método para cadastrar veículos no sistema
    public static String registerVehicle(Scanner scanner) {
        System.out.println("\n" + "=".repeat(10) + " Cadastrar Veículos " + "=".repeat(10));

        System.out.println("Marca do Veículo: ");
        String vehicleBrand = scanner.nextLine();

        return vehicleBrand;
    }

    // Método Princípal do sistema
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Vehicle> vehicle = new ArrayList<>();

		while (true) {
			System.out.println("-".repeat(10) + " Sistema de Gestão de Veículos " + "-".repeat(10));

			System.out.println("\nOpções Disponíveis");
			System.out.println("1- Cadastrar Veículo");
			System.out.println("2- Listar Todos Veículos");
			System.out.println("3- Excluir Veículo");
            System.out.println("4- Sair do Sistema");

			try {
			    System.out.print("Opção: ");
			    int optionMenu = scanner.nextInt();

                switch (optionMenu) { 
                    case 1:
                        String registrationFunction = registerVehicle(scanner);
                        break;

                    case 2:
                        System.out.println("=".repeat(10) + " Listar Veículos " + "=".repeat(10));
                        break;

                    case 3:
                        System.out.println("=".repeat(10) + " Excluir Veículos " + "=".repeat(10));
                        break;

                    case 4:
                        System.out.println("\nSaindo do sistema...");
                        break;

                    default:
                        System.out.println("\nOpção informada não é correspondente!\n");
                        continue;
            }
			    
			} catch (InputMismatchException e) {
			    System.out.println("Favor preencher apenas com as opções em tela.\n");
                scanner.next();
			    continue;
			}

			break;
		}
		
		scanner.close();
	}
}
