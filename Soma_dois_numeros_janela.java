import java.util.Scanner;
import javax.swing.*;

public class Soma_dois_numeros_janela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World");
        JOptionPane.showMessageDialog(null, "Hello World");

        String n1 = JOptionPane.showInputDialog("Digite um número:");
        int numero1 = Integer.parseInt(n1);
        

        String n2 = JOptionPane.showInputDialog("Digite outro número:");
        int numero2 = Integer.parseInt(n2);

        int soma_total = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "A soma total é: " + soma_total);

    }

}
