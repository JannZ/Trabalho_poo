/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodeestudantes;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class InterfaceUsuario {
    private GerenciadorEstudantes gerenciadorEstudantes;
    private Scanner scanner;
    
    
    public InterfaceUsuario() {
        gerenciadorEstudantes = new GerenciadorEstudantes();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("<><><><> Menu <><><><>");
            System.out.println("1 - Adicionar Estudante");
            System.out.println("2 - Localizar Estudante");
            System.out.println("3 - Excluir Estudante");
            System.out.println("4 - Listar Estudantes");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    Estudantes estudante = new Estudantes(matricula, nome, email, telefone, endereco);
                    gerenciadorEstudantes.adicionarEstudante(estudante);
                    System.out.println("Estudante adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite a matrícula do estudante: ");
                    int matriculaBusca = scanner.nextInt();
                    Estudantes estudanteEncontrado = gerenciadorEstudantes.localizarEstudante(matriculaBusca);
                    if (estudanteEncontrado != null) {
                        System.out.println("Estudante encontrado:");
                        System.out.println("Matrícula: " + estudanteEncontrado.obterMatricula());
                        System.out.println("Nome: " + estudanteEncontrado.obterNome());
                        System.out.println("Email: " + estudanteEncontrado.obterEmail());
                        System.out.println("Telefone: " + estudanteEncontrado.obterTelefone());
                        System.out.println("Endereço: " + estudanteEncontrado.obterEndereco());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite a matrícula do estudante a ser excluído: ");
                    int matriculaExclusao = scanner.nextInt();
                    gerenciadorEstudantes.excluirEstudante(matriculaExclusao);
                    System.out.println("Estudante excluído com sucesso.");
                    break;
                case 4:
                    gerenciadorEstudantes.listarEstudantes();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

