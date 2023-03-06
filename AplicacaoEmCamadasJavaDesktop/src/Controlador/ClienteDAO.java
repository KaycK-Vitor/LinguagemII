package Controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    //Cria um objeto gerenciador de conexao com o banco de dados
    private GerenciadorBD bd = null;

    public ClienteDAO() {
        this.bd = new GerenciadorBD();
    }

    public void cadastrar(Cliente cliente) throws SQLException{
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setLong(3, cliente.getTelefone());

            // Executa a instrução SQL
            stmt.executeUpdate();

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }
    }

    public List<Cliente> listar() throws SQLException{
        
        try {
            
            //Criando uma lista de clientes
             List<Cliente> listaDeClientes = new ArrayList<>();
            
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "SELECT ID, Nome, Email, Telefone FROM cliente";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Executa a instrução SQL
            ResultSet rs = stmt.executeQuery();

            // Percorre os registros e exibe os dados no console
            while (rs.next()) {
                Cliente c = new Cliente();
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getLong("telefone"));
                
                listaDeClientes.add(c);
            }
            
            return listaDeClientes;

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }

    }
    
    public void atualizar(Cliente cliente) throws SQLException{
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "UPDATE cliente SET nome = ?, email = ?, telefone = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setLong(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getId());

            // Executa a instrução SQL
            stmt.executeUpdate();

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }
    }

    public void excluir(Cliente cliente) throws SQLException{
        try {
            // Cria a conexão com o banco de dados
            Connection conn = bd.conectar();

            // Prepara a instrução SQL
            String sql = "DELETE FROM cliente WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Define os parâmetros da instrução SQL
            stmt.setInt(1, cliente.getId());

            // Executa a instrução SQL
            stmt.executeUpdate();

        } finally {
            // Fecha a conexão com o banco de dados
            bd.desconectar();
        }
    }

}

