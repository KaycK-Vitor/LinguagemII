package BancoDeDados_01_Conexao;

public class ProgramaTestarGerenciarBD {

    public static void main(String[] args) {
        
        GerenciadorBD bd = new GerenciadorBD();
        
        bd.Conectar();
        
        bd.Desconectar();
    }
    
}
