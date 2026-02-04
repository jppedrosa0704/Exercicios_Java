import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class App {

    static final String URL = "jdbc:mysql://localhost:3306/alunos";
    static final String USER = "root";
    static final String PASSWORD = "";

    private static JTextArea areaDados;

    public static void main(String[] args) {
        criarTelaPrincipal();
    }

    public static Connection conectar() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void criarTelaPrincipal() {
        JFrame frame = new JFrame("Cadastro de Pessoas");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        areaDados = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaDados);

        JButton botaoInserir = new JButton("Inserir Novo Nome");
        JButton botaoAtualizar = new JButton("Atualizar Dados");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoInserir);
        painelBotoes.add(botaoAtualizar);

        frame.add(scroll, BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);

        botaoAtualizar.addActionListener(e -> atualizarDados());

        botaoInserir.addActionListener(e -> abrirTelaInserir());

        frame.setVisible(true);

        atualizarDados();
    }

    public static void atualizarDados() {
        areaDados.setText(carregarDados());
    }

    public static String carregarDados() {
        StringBuilder resultado = new StringBuilder();

        try {
            Connection con = conectar();
            Statement st = con.createStatement();

            // AQUI ESTÁ USANDO SUA TABELA REAL: pessoas
            ResultSet rs = st.executeQuery("SELECT * FROM pessoas");

            while (rs.next()) {
                resultado.append(rs.getInt("id"))
                         .append(" - ")
                         .append(rs.getString("nome"))
                         .append("\n");
            }

            con.close();

        } catch (Exception e) {
            return "Erro ao carregar dados: " + e.getMessage();
        }

        return resultado.toString();
    }

    public static void abrirTelaInserir() {
        JFrame telaInserir = new JFrame("Inserir Pessoa");
        telaInserir.setSize(300, 150);
        telaInserir.setLayout(new FlowLayout());

        JLabel label = new JLabel("Nome:");
        JTextField campoNome = new JTextField(15);
        JButton botaoSalvar = new JButton("Salvar");

        telaInserir.add(label);
        telaInserir.add(campoNome);
        telaInserir.add(botaoSalvar);

        botaoSalvar.addActionListener(e -> {
            inserirNome(campoNome.getText());
            telaInserir.dispose();
            atualizarDados();
        });

        telaInserir.setVisible(true);
    }

    public static void inserirNome(String nome) {
        try {
            Connection con = conectar();

            // AQUI TAMBÉM USANDO SUA TABELA pessoas
            String sql = "INSERT INTO pessoas (nome) VALUES (?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);

            ps.executeUpdate();

            con.close();

            JOptionPane.showMessageDialog(null, "Nome inserido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());
        }
    }
}
