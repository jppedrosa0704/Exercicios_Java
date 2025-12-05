import javax.swing.JOptionPane;
public class Prova_do_curso {
    public static void main(String[] args) {
        int quantidade = 0;

        while (quantidade <= 0) {
            quantidade = Integer.parseInt(
                JOptionPane.showInputDialog("Quantas notas queres inserir: ")
            );
            if (quantidade <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido!" +
                "Digite um número maior que 0");
            }

        }
        
        int negativas = 0;
        int positivas = 0;
        double quantidade_notas = 0;
        double media;
        
        int i = 0;
        while (i < quantidade) {
            double nota = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota: 0 a 20"  )
            );
            
            if (nota < 0 || nota > 20) {
                JOptionPane.showMessageDialog(null,
                    "Nota inválida. Digite notas entre 0 e 20");
            
                continue;
            }
            
            
            
            if (nota < 10){
                negativas +=1;
            } else {
                positivas += 1;
            }
            quantidade_notas += nota;
            i += 1;
        }
        media = quantidade_notas / i;
        
        String MensagemResultado = String.format(
            ">>>> Resultados finais<<<<\n" +
            "Quantidade de notas inseridas: %d\n" +
            "Média final: %.2f\n" +
            "Número de notas negativas (<10): %d\n" +
            "Número de notas positivas (>=10): %d",
            i, media, negativas, positivas
        );
        JOptionPane.showMessageDialog(null, MensagemResultado,
            "Resumo de notas:", JOptionPane.INFORMATION_MESSAGE
        
        );
    }
}
