package BancoDeDadosSimplificado_01_Cadastro;

public class TelaDeListagemDeCliente {

    public static void main(String[] args) {
        
        System.out.println(" <<< Tela de Listagem de Cliente >>> \n");
        
        Cliente cliente = new Cliente();

        // Lista os clientes cadastrados no banco de dados
        cliente.listar();
        
        System.out.println("\nClientes listados com sucesso!");
    }

}

