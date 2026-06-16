import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    // Método Princípal do sistema 
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Vehicle> vehicle = new ArrayList<>();

        boolean codeRunning = true;
        while (codeRunning) {
            System.out.println("=".repeat(10) + " Gestão de Veículos " + "=".repeat(10));

            System.out.println("\nOpções Disponíveis");
			System.out.println("1- Cadastrar Veículo");
			System.out.println("2- Listar Todos Veículos");
			System.out.println("3- Excluir Veículo");
            System.out.println("4- Sair do Sistema");

            // Verificação da entrada de dados por parte do usuário
            int userOption;

            try {
                System.out.println("Opção informada: ");
                userOption = scanner.nextInt();

                return;
                
            } catch(InputMismatchException e) {
                System.out.println("\nOpção inválida, tente novamente!");
                scanner.next();9
                continue;
            }
        }
        
        scanner.close(); // Finalizar a classe Scanner
    }
}
