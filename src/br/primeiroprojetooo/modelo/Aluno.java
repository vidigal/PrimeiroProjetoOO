package br.primeiroprojetooo.modelo;

import java.util.Collection;

public class Aluno extends Pessoa {

    private String matricula;
    private Collection<Endereco> enderecos;

    public Aluno(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void listarEnderecos() {
        for (Endereco endereco: this.enderecos) {
            System.out.println("=============================");
            System.out.println(endereco.getCep());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getNumero());
            System.out.println(endereco.getComplemento());
            System.out.println("=============================");
        }
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
