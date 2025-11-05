import java.util.Scanner;

public class notas_media_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria o objeto Scanner

        float soma = 0;
        for (int i = 1; i <= 3; i++ ){
            System.out.println("Digite a " + i +"ª nota: ");
            float notas = scanner.nextFloat();
            soma += notas;

        float media = soma / 3;

        System.out.println("Sua média foi: " + media);
        }
    }
}
