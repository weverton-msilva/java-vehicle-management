import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Vehicle> vehicle = new ArrayList<>();

		while (true) {
			System.out.println("-".repeat(10) + " Sistema de Gestão de Veículos " + "-".repeat(10));

			System.out.println("\nOpções Disponíveis");
			System.out.println("1- Cadastrar Veículo");
			System.out.println("2- Listar Todos Veículos");
			System.out.println("3- Excluir Veículo");

			try {
			    System.out.print("Opção: ");
			    int optionMenu = scanner.nextInt();
			    
			} catch (InputMismatchException e) {
			    System.out.println("Favor preencher apenas com as opções em tela.");
			    scanner.next();
			    continue;
			}

			break;
		}
		
		scanner.close();
	}
}
