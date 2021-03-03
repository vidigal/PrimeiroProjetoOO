package br.primeiroprojetooo.modelo;

import java.util.Collection;

public class Aluno extends Pessoa {

    private String matricula;
    private Collection<Endereco> enderecos;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String listarEnderecos() {
        return "";
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
