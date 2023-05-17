package br.edu.com.classes.subclasse;

import br.edu.com.classes.superclasse.Pessoa;

public final class Estudante extends Pessoa{
    protected String curso;

    public Estudante(String curso, String nome, String cpf){
        super(nome, cpf);
        this.curso = curso;
    }


    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void imprimirEstudante(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Curso: " + this.curso);
    }
}
