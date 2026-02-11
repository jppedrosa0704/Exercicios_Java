import java.util.Scanner;

public class bill_phone{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Os minutos usados foram:");
    
    int minutos = sc.nextInt();

    double conta = 50.0;
    if (minutos > 100){
        conta =+ (minutos - 100) * 2.0;
    }

    System.out.printf("Valor a pagar e = R$ %.2f%n", conta);

    sc.close();
}

}
