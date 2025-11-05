import javax.swing.*;

public class Calculadora2 {
    public static void main(String[] args) {
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();

        String[] operacoes = {"+", "-", "×", "÷"};
        JComboBox<String> listaOperacoes = new JComboBox<>(operacoes);

        Object[] mensagem = {
            "Digite o primeiro número:", campo1,
            "Digite o segundo número:", campo2,
            "Escolha a operação:", listaOperacoes
        };

        int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Calculadora", JOptionPane.OK_CANCEL_OPTION);

        // Se o usuário clicar em OK
        if (opcao == JOptionPane.OK_OPTION) {
            try {
                double numero1 = Double.parseDouble(campo1.getText());
                double numero2 = Double.parseDouble(campo2.getText());
                String operacao = (String) listaOperacoes.getSelectedItem();
                double resultado = 0;

                // Faz o cálculo de acordo com o símbolo
                switch (operacao) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "×":
                        resultado = numero1 * numero2;
                        break;
                    case "÷":
                        if (numero2 == 0) {
                            JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                            return;
                        }
                        resultado = numero1 / numero2;
                        break;
                }

                JOptionPane.showMessageDialog(null, numero1 + " " + operacao + " " + numero2 + " = " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite números válidos!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }
}