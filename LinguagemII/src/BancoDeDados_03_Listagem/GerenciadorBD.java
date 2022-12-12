package BancoDeDados_03_Listagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {
    
    private Connection conexao = null;
    
    private String servidor = "127.0.0.1:3306";
    private String banco = "bancoabc";
    private String login = "root";
    private String senha = "1234";
    
    public Connection Conectar() {
        
        try 
        {    
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
    
    public void Desconectar() {
        try 
        {
            if(conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Nao conseguiu desconectar do BD.");
        }
    }
}
