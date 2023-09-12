/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodeestudantes;

/**
 *
 * @author Felipe
 */
public class Estudantes {
    private int matricula;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Estudantes(int matricula, String nome, String email, String telefone, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int obterMatricula() {
        return matricula;
    }

    public String obterNome() {
        return nome;
    }

    public String obterEmail() {
        return email;
    }

    public String obterTelefone() {
        return telefone;
    }

    public String obterEndereco() {
        return endereco;
    }
}

