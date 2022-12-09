package BancoDeDados_01_Conexao;

public class ProgramaTestarBD {

    public static void main(String[] args) {
        
        BD bd = new BD();
        
        bd.Conectar();
        
        bd.Desconectar();
    }
    
}
