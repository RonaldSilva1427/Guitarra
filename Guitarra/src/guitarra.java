import java.util.Scanner;

public class guitarra {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Saúda o usuário com o nome fornecido
        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo Java!");
        
        // Fecha o scanner para liberar recursos
        scanner.close();

	}

}
