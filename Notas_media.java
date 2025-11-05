import javax.swing.JOptionPane;

public class Notas_media {
    public static void main(String[] args) {
        // Lê as notas em janelas separadas
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        // Calcula a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Verifica situação
        String situacao;
        if (media >= 10) {
            situacao = "Aprovado ";
        } else {
            situacao = "Reprovado ";
        }

        // Mostra resultado
        JOptionPane.showMessageDialog(null,
            "Média: " + media + "\nSituação: " + situacao);
    }
}

