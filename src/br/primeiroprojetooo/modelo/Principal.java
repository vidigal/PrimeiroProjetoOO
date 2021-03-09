package br.primeiroprojetooo.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

    public static void main(String[] args) {

        // Instanciar objeto aluno utilizando construtor sobrescrito
        Aluno aluno01 = new Aluno("Karina", "123456");

        // Instanciar objeto endereço
        Endereco endereco01 = new Endereco();
        endereco01.setCep("21940-140");
        endereco01.setLogradouro("Rua professor veríssimo da costa");
        endereco01.setNumero("241");
        endereco01.setComplemento("Casa 01");

        // Instanciar objeto endereço
        Endereco endereco02 = new Endereco();
        endereco02.setCep("36030-130");
        endereco02.setLogradouro("Rua Aurora Torres");
        endereco02.setNumero("460");
        endereco02.setComplemento("101");

        // Criando collection para armazenar endereços instanciados
        Collection<Endereco> enderecosAluno01 = new ArrayList<Endereco>();
        enderecosAluno01.add(endereco01);
        enderecosAluno01.add(endereco02);

        // Atribuir valor ao atributo Enderecos da classe Aluno
        aluno01.setEnderecos(enderecosAluno01);


        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matrícula: " + aluno01.getMatricula());
        aluno01.listarEnderecos();

    }

}
