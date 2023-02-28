package BancoDeDadosSimplificado_01_Cadastro;

import java.util.Scanner;

public class TelaDeCadastroDeCliente {
    public static void main(String[] args) {
        
        System.out.println(" <<< Tela de Cadastro de Cliente >>> \n");
        
        Scanner scanner = new Scanner(System.in);
        
        // Lê os dados do cliente a ser cadastrado
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        
        // Fecha o scanner
        scanner.close();

        // Cria um objeto da classe Cliente
        Cliente cliente = new Cliente();

        // Chama o método cadastrar, passando os dados lidos do teclado como parâmetro
        cliente.cadastrar(nome, email, telefone);
        
        //Mensagem de confirmação
        System.out.println("\nCadastro realizado com sucesso!");

    }
}

