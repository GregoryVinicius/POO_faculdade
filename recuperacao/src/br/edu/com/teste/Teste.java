package br.edu.com.teste;

import java.util.Scanner;

import br.edu.com.classes.subclasse.Bibliotecario;
import br.edu.com.classes.subclasse.Estudante;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudante estudante[] = new Estudante[200];
        Bibliotecario bibliotecario[] = new Bibliotecario[200];

        int respUsu = 1;
        int estudId = 0;
        int bibliId = 0;

        while(respUsu != 0){
            System.out.println("----------------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Visualizar");
            System.out.println("0 - Sair");
            System.out.println("----------------------");
            System.out.println("Opção: ");
            respUsu = teclado.nextInt();

            if(respUsu == 1){
                int respUsuCadastro = 1;
                System.out.println("----------------------");
                System.out.println("1 - Cadastrar Estudante");
                System.out.println("2 - Cadastrar Bibliotecario");
                System.out.println("0 - Sair");
                System.out.println("----------------------");
                System.out.println("Opção: ");
                respUsu = teclado.nextInt();
                if(respUsuCadastro == 1){
                    estudId ++;
                    System.out.println("Nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Cpf: ");
                    String cpf = teclado.nextLine();
                    System.out.println("Curso: ");
                    String curso = teclado.nextLine();
                    estudante[estudId].setNome(nome);
                    estudante[estudId].setCpf(cpf);
                    estudante[estudId].setCurso(curso);
                }else if(respUsuCadastro == 2){
                    bibliId ++;
                    System.out.println("Nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Cpf: ");
                    String cpf = teclado.nextLine();
                    System.out.println("Curso: ");
                    String cargo = teclado.nextLine();
                    bibliotecario[bibliId].setNome(nome);
                    bibliotecario[bibliId].setCpf(cpf);
                    bibliotecario[bibliId].setCargo(cargo);
                }else if(respUsuCadastro == 0){
                    break;
                }else{
                    System.out.println("Valor incorreto, digite novamente.");
                }
            }else if(respUsu == 2){
                for(int i = 0; i < 200; i++){
                    String nome = "";
                    String cpf = "";
                    String curso = "";
                    nome = estudante[i+1].getNome();
                    cpf = estudante[i+1].getCpf();
                    curso = estudante[i+1].getCurso();
                    if(nome != null){
                        System.out.println("Nome: " + nome);
                        System.out.println("CPF: " + cpf);
                        System.out.println("Curso: " + curso);
                    }else{
                        break;
                    }
                }
                for (int i = 0; i < 200; i++) {
                    String nome = "";
                    String cpf = "";
                    String cargo = "";
                    nome = bibliotecario[i + 1].getNome();
                    cpf = bibliotecario[i + 1].getCpf();
                    cargo = bibliotecario[i + 1].getCargo();
                    if (nome != null) {
                        System.out.println("Nome: " + nome);
                        System.out.println("CPF: " + cpf);
                        System.out.println("Curso: " + cargo);
                    } else {
                        break;
                    }
                }
            }
        }        
        
    }
}
