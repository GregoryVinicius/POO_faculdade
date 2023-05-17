package br.edu.com.classes.subclasse;

import br.edu.com.classes.superclasse.Pessoa;

public final class Bibliotecario extends Pessoa{
    protected String cargo;

    public Bibliotecario(String cargo, String nome, String cpf){
        super(nome, cpf);
        this.cargo = cargo;
    }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void imprimirBibliotecario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + this.cargo);
    }
}
