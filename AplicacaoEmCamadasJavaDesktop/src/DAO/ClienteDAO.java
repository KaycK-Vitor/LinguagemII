package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private GerenciadorBD bd;

    public ClienteDAO() {
        bd = new GerenciadorBD();
    }

    public void cadastrar(Cliente cliente) throws SQLException {
        try (Connection conn = bd.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(
             "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)")) 
        {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setLong(3, cliente.getTelefone());
            
            stmt.executeUpdate();
        }
    }

    public List<Cliente> listar() throws SQLException {
        
        List<Cliente> listaDeClientes = new ArrayList<>();
        
        try (Connection conn = bd.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(
             "SELECT ID, Nome, Email, Telefone FROM cliente"); 
             ResultSet rs = stmt.executeQuery()) 
        {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getLong("telefone"));
                
                listaDeClientes.add(cliente);
            }
        }
        
        return listaDeClientes;
    }

    public void atualizar(Cliente cliente) throws SQLException {
        try (Connection conn = bd.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(
             "UPDATE cliente SET nome = ?, email = ?, telefone = ? WHERE id = ?")) 
        {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setLong(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getId());
            
            stmt.executeUpdate();
        }
    }

    public void excluir(Cliente cliente) throws SQLException {
        try (Connection conn = bd.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(
             "DELETE FROM cliente WHERE id = ?")) 
        {
            stmt.setInt(1, cliente.getId());
            
            stmt.executeUpdate();
        }
    }

}
