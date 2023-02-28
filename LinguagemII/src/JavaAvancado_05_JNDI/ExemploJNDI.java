
package JavaAvancado_05_JNDI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploJNDI {

    public static void main(String[] args) {
        try {
            // Cria o contexto inicial
            Context ctx = new InitialContext();
            
            // Procura o recurso desejado pelo nome JNDI
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/livraria");

            // Obtém uma conexão do pool de conexões do banco de dados
            Connection conn = ds.getConnection();

            // Executa uma consulta SQL
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");

            // Processa o resultado da consulta
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }

            // Fecha a conexão com o banco de dados
            rs.close();
            stmt.close();
            conn.close();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
    }
}
