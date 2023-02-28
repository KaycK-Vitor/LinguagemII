package BancoDeDadosSimplificado_ManterClientes;

import java.util.Scanner;

public class TelaDeExclusaoDeCliente {

    public static void main(String[] args) {

        System.out.println(" <<< Tela de Exclusao de Cliente >>> \n");

        Scanner scanner = new Scanner(System.in);

        // Solicita o ID do cliente a ser excluído
        System.out.print("Digite o ID do cliente que deseja excluir: ");
        int id = scanner.nextInt();
        
        // Cria um objeto cliente
        Cliente cliente = new Cliente();

        try{
        
        // Executa a exclusão do cliente
        cliente.excluir(id);
        
        //Mensagem de confirmação
        System.out.println("\nCliente excluido com sucesso!");
        
        }
        catch(Exception e)
        {
            //Mensagem de Erro
            System.out.println("\nErro ao tentar excluir um cliente!");
        }
    }
}
