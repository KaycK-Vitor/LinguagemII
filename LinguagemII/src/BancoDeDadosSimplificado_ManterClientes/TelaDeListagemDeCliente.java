package BancoDeDadosSimplificado_ManterClientes;

public class TelaDeListagemDeCliente {

    public static void main(String[] args) {
        
        System.out.println(" <<< Tela de Listagem de Cliente >>> \n");
        
        Cliente cliente = new Cliente();

        try{
        
        // Lista os clientes cadastrados no banco de dados
        cliente.listar();
        
        //Mensagem de confirmação
        System.out.println("\nClientes listados com sucesso!");
        
        }
        catch(Exception e)
        {
            //Mensagem de Erro
            System.out.println("\nErro ao tentar listar clientes!");
        }
    }

}

