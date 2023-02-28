package BancoDeDadosSimplificado_01_Cadastro;

import java.util.Scanner;

public class TelaDeExclusaoDeCliente {

    public static void main(String[] args) {

        System.out.println(" <<< Tela de Exclusao de Cliente >>> \n");

        Scanner scanner = new Scanner(System.in);

        // Cria um objeto cliente
        Cliente cliente = new Cliente();

        // Solicita o ID do cliente a ser excluído
        System.out.print("Digite o ID do cliente que deseja excluir: ");
        int id = scanner.nextInt();

        // Executa a exclusão do cliente
        cliente.excluir(id);
        
        System.out.println("\nCliente excluido com sucesso!");
    }
}
