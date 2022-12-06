package BancoDeDados_01_Conexao;

public class ProgramaTestaBD {

    public static void main(String[] args) {
        
        BD bd = new BD();
        
        bd.Conectar();
        
        bd.Desconectar();
    }
    
}
