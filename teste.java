import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();

        Object[] mensagem = {
            "Digite o primeiro número:", campo1,
            "Digite o segundo número:", campo2
        };

        int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Calculadora", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == JOptionPane.OK_OPTION) {
            int numero1 = Integer.parseInt(campo1.getText());
            int numero2 = Integer.parseInt(campo2.getText());

            int soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }
}