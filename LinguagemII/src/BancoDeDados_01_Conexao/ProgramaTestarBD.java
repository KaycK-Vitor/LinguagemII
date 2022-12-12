package BancoDeDados_01_Conexao;

public class ProgramaTestarBD {

    public static void main(String[] args) {
        
        GerenciadorBD bd = new GerenciadorBD();
        
        bd.Conectar();
        
        bd.Desconectar();
    }
    
}
