import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBCPostgres {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/viviane_md";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "132219");

            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("Conexao realizada com sucesso");

            String instrucaoSQL = "INSERT INTO public.tab_cadastro (nome, idade) VALUES (?, ?)";
            String nome = "Viviane";
            int idade = 41;

            PreparedStatement pst = conn.prepareStatement(instrucaoSQL);
            pst.setString(1, nome);
            pst.setInt(2, idade);

            int linhasAfetadas = pst.executeUpdate();
            System.out.println("Inserção realizada com sucesso. Linhas afetadas: " + linhasAfetadas);

            pst.close();
            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
