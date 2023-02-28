package BancoDeDadosSimplificado_01_Cadastro;

import java.util.Scanner;

public class TelaDeAlteracaoDeCliente {
    public static void main(String[] args) {
        
        System.out.println(" <<< Tela de Alteracao de Cliente >>> \n");
        
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o ID do cliente que deseja alterar
        System.out.print("Informe o ID do cliente que deseja alterar: ");
        int id = scanner.nextInt();

        // Solicita ao usuário as novas informações do cliente
        System.out.print("Informe o novo nome do cliente: ");
        String nome = scanner.next();

        System.out.print("Informe o novo email do cliente: ");
        String email = scanner.next();

        System.out.print("Informe o novo telefone do cliente: ");
        String telefone = scanner.next();

        // Cria um objeto Cliente e chama o método atualizar, passando as informações informadas pelo usuário
        Cliente cliente = new Cliente();
        cliente.atualizar(id, nome, email, telefone);

        System.out.println("\nCliente alterado com sucesso!");
    }
}

