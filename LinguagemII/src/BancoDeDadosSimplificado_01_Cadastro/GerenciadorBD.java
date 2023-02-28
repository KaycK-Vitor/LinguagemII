package BancoDeDadosSimplificado_01_Cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {

    private Connection conexao = null;

    private final String servidor = "127.0.0.1:3306";
    private final String banco = "livraria";
    private final String login = "root";
    private final String senha = "1234";

    public Connection conectar() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String textoDeConexao = "jdbc:mysql://" + this.servidor + "/" + this.banco;

            conexao = DriverManager.getConnection(textoDeConexao, this.login, this.senha);
        }
        catch (SQLException ex) 
        {
            System.out.println("Erro: Nao conseguiu conectar no BD.");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Erro: Nao encontrou o driver do BD.");
        }

        return conexao;
    }

    public void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException ex) {
            System.out.println("Não conseguiu desconectar do BD.");
        }
    }
}
