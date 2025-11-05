import java.util.Scanner;

public class nome_idade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       // Lendo uma linha de texto
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Qual sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! tu tens " + idade + " anos.");
    }
    
}
