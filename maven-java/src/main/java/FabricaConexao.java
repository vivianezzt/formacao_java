import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {
    private static Connection conexao;
    public static void conectar(){
        try {
            if (conexao == null){
                String url = "jdbc:postgresql://localhost:5432/viviane_md";
                Properties props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", "132219");
                conexao = DriverManager.getConnection(url, props);
                System.out.println("Conexao realizada com sucesso");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConexao() {
        return conexao;
    }
}
