import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        System.out.print("Digite um número: ");
        float numero1 = scanner.nextFloat();
        
        System.out.print("Digite outro número: ");
        float numero2 = scanner.nextFloat();
        
        float somatotal = numero1 + numero2;
        System.out.println("A soma dos números foi: " + somatotal);
        
        float subtracao = numero1 - numero2;
        System.out.println("A subtração dos números foi: " + subtracao);

        float divisao = numero1 / numero2;
        System.out.println("A Divisão dos números foi: " + divisao);
        
        float multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação dos números foi: " + multiplicacao);
        
        float media = (numero1 + numero2) / 2;
        System.out.println("A média é: " + media);
        

    }
    
}
