public class Pessoa {
    String nome;
    int anoNascimento;
    String idade;

    public void log(){
        System.out.println("nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.anoNascimento);
        System.out.println("Idade: " + this.idade);
    }

    public Pessoa(){
        anoNascimento = 1990;
    }

    public Pessoa(String nome){
        this();
        this.nome = nome;
        this.log();
    }
}
