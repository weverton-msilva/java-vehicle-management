import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    // Método principal para execução do programa
    public static void main (String[] args) {
        // Objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Lista de veículos cadastrados no sistema
        ArrayList<Vehicle> vehicle = new ArrayList<>();

        // Interface de interação do usuário
        boolean codeRunning = true;

        while (codeRunning) {
            System.out.println("=".repeat(10) + " Gestão de Veículos " + "=".repeat(10));

            System.out.println("\n" + """
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

                // Direcionamento do método conforme a entrada de dados
                switch (menuOption) {
                    case 1:
                        System.out.println("Deu certo!");
                        scanner.nextLine();
                    
                    case 2:
                        System.out.println("Deu certo duas vezes!");
                        scanner.nextLine();
                }
                
            } catch(InputMismatchException e) {
                System.out.println("A opção precisa ser apenas números inteiros.\n");
                scanner.nextLine();
                continue;
            }
        }
    }
}
