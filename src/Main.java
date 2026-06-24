import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // Método principal para execução do programa
    public static void main (String[] args) {
        // Objeto da instância Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // ArrayList para guarda os veículos cadastrados
        ArrayList<Vehicles> vehicles = new ArrayList<>();

        // Chamar método do menu e receber valor do mesmo
        int menuOption = viewMenu(scanner);
    }


    // Método para exibição da interface do menu de opções
    public static int viewMenu(Scanner scanner) {
        while (true) {
            System.out.println("=".repeat(10) + " VEHICLE MANAGEMENT " + "=".repeat(10));

            System.out.println("""
            Available Options:
            1- Register New Vehicle
            2- List All Vehicles
            3- Edit Registered Vehicle
            4- Delete Records
            5- Exit the System""");
            System.out.print("Option: ");
            
            // Receber a opção selecionada pelo usuário
            String userOption = scanner.nextLine();
            int menuOption;

            // Validar a opção escolhida para prosseguir
            try {
                menuOption = Integer.parseInt(userOption);
                return menuOption;
                
            } catch (NumberFormatException e) {
                System.out.print("Only the use of numbers is permitted.\n");
                continue;
            }
        }
    }
}
