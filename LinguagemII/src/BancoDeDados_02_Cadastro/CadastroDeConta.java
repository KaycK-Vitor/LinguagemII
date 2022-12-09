package BancoDeDados_02_Cadastro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CadastroDeConta {

    public static void main(String[] args) {

        //Cria um título para a Tela
        System.out.println("<<<Cadastro de Conta>>>: ");
        System.out.println();

        //Cria um objeto leitor de dados do teclado
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite o numero da conta: ");
        int numero = leitor.nextInt();
        
        System.out.println("Digite o saldo da conta: ");
        double saldo = leitor.nextDouble();
        
        System.out.println("Digite o limite conta: ");
        double limite = leitor.nextDouble();

        //Cria um gerenciador de conexao
        BD bd = new BD();

        //realiza conexão com o banco de dados
        Connection conexao = bd.Conectar();
        
        try 
        {
            //sql a ser executado no banco de dados
            String sql = "INSERT INTO conta (numero, saldo, limite) VALUES (?, ?, ?)";
            //Cria array que guarda as colunas a serem retornadas após insert
            String colunasGeradas[] = { "id" };

            //cria o comando a ser executado no banco de dados
            PreparedStatement comando = conexao.prepareStatement(sql, colunasGeradas);

            //Combina os valores lidos do teclado com o sql acima
            comando.setInt(1, numero);
            comando.setDouble(2, saldo);
            comando.setDouble(3, limite);

            //executa o comando no banco de dados
            comando.execute();

            //resgata id gerado automaticamente, após a execução do insert
            ResultSet resultado = comando.getGeneratedKeys();
            
            int idGerado = 0;

            //lê id gerado automaticamente
            if (resultado.next()) {
                idGerado = resultado.getInt(1);
            }
            
            resultado.close();

            System.out.println("Conta adicionada com sucesso.Id gerado: " + idGerado);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Não conseguiu adicionar uma nova conta." + ex.getMessage());
        }
        finally
        {
            bd.Desconectar();
        }
    }
}