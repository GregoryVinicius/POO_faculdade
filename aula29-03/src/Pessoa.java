public class Pessoa {
    static int quantPessoas = 0;
    int quantidade = 0;
    String cpf;

    public Pessoa(){
        this.cpf = "";
        this.quantPessoas++;
        this.quantidade++;
    }

    public Pessoa(String cpf){
        this.cpf = cpf;
        this.quantPessoas++;
        this.quantidade++;
    }
}
