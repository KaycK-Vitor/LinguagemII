package BancoDeDados_03_Listagem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListagemDeContas {

    public static void main(String[] args) {
       
        //Cria um gerenciador de conexao
        GerenciadorBD bd = new GerenciadorBD();
        
        //realiza conexão com o banco de dados
        Connection conexao = bd.Conectar();
    
        try 
        { 
            //sql a ser executado no banco de dados
            String sql = "SELECT id, numero, saldo, limite FROM conta;";

            //cria o comando a ser executado no banco de dados
            Statement comando = conexao.createStatement();
            
            //executa o comando no banco de dados e armazena a resposta na memória 
            ResultSet resultado = comando.executeQuery(sql);

            //percorre os dados armazenados na memória e apresentam na tela
            while(resultado.next()) {
                System.out.print("Id: " + resultado.getInt("id"));
                System.out.print(" - "); 
                System.out.print("Numero: " + resultado.getInt("numero"));
                System.out.print(" - ");
                System.out.print("Saldo: " + resultado.getDouble("saldo"));
                System.out.print(" - ");
                System.out.print("Limite: " + resultado.getDouble("limite"));
                System.out.println("");
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Nao conseguiu consultar os dados das contas.");
        } 
        finally 
        {
            //Desconecta o banco de dados
            bd.Desconectar();
        }
        
    }
    
}
