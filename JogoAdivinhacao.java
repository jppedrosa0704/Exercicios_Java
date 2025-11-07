import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 0;

        int numero = random.nextInt(99) + 1; // número aleatório entre 1 e 100
        int palpite = 0;

        System.out.println("Tente adivinhar o número (entre 1 e 100)!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas += 1;
            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou! "
                + tentativas + " Tentativas");
                
                break;
            } else if (numero > palpite) {
                System.out.println("O número é MAIOR.");
            } else {
                System.out.println("O número é MENOR.");
            }
        }

        scanner.close(); // boa prática
    }
}
    

        
        

        
    

