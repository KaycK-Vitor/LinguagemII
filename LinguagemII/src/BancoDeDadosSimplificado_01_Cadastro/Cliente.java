package BancoDeDadosSimplificado_01_Cadastro;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Cliente {

    //Cria um objeto gerenciador de conexao com o banco de dados
    private GerenciadorBD bd = null;

    public Cliente() {
        this.bd = new GerenciadorBD();
    }

    public void cadastrar(String nome, String email, String telefone) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);

            // Executa a instrução SQL
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }

    }

    public void listar() {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "SELECT ID, Nome, Email, Telefone FROM cliente";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Executa a instrução SQL
            ResultSet rs = stmt.executeQuery();

            // Percorre os registros e exibe os dados no console
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(" - Nome: " + rs.getString("nome"));
                System.out.print(" - Email: " + rs.getString("email"));
                System.out.print(" - Telefone: " + rs.getString("telefone"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }

    }
    
    public void listar(DefaultTableModel tabelaClientes) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "SELECT ID, Nome, Email, Telefone FROM cliente";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Executa a instrução SQL
            ResultSet rs = stmt.executeQuery();

            //percorre os dados armazenados na memória e apresentam na tela
            while(rs.next()) {
                
                //Criando vetor com os dados buscados na memória, no ResultSet
                Object[] Conta = new Object[]
                {
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("telefone")
                };
                
                //Adicionando do vetor (registro [conta]) na Jtable
                tabelaClientes.addRow(Conta);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }

    }
    
    public void atualizar(int id, String nome, String email, String telefone) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "UPDATE cliente SET nome = ?, email = ?, telefone = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);
            stmt.setInt(4, id);

            // Executa a instrução SQL
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }
    }

    public void excluir(int id) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "DELETE FROM cliente WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setInt(1, id);

            // Executa a instrução SQL
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir cliente: " + e.getMessage());
        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }
    }

}
