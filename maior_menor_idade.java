import java.util.Scanner;

public class maior_menor_idade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        
        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.err.println("É menor idade.");
        }


    }        
}

