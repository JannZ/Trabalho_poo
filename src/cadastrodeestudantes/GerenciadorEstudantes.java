/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodeestudantes;
import java.util.ArrayList;


/**
 *
 * @author Felipe
 */
public class GerenciadorEstudantes {
    private ArrayList<Estudantes> estudantes;

    public GerenciadorEstudantes() {
        estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudantes estudante) {
        estudantes.add(estudante);
    }

    public Estudantes localizarEstudante(int matricula) {
        for (Estudantes estudante : estudantes) {
            if (estudante.obterMatricula() == matricula) {
                return estudante;
            }
        }
        return null;
    }

    public void excluirEstudante(int matricula) {
        Estudantes estudante = localizarEstudante(matricula);
        if (estudante != null) {       
            estudantes.remove(estudante);
        }
    }

    public void listarEstudantes() {
        for (Estudantes estudante : estudantes) {
            System.out.println("<><><><><><><><><>");
            System.out.println("Matrícula: " + estudante.obterMatricula());
            System.out.println("Nome: " + estudante.obterNome());
            System.out.println("Email: " + estudante.obterEmail());
            System.out.println("Telefone: " + estudante.obterTelefone());
            System.out.println("Endereço: " + estudante.obterEndereco());
        }
    }
}

