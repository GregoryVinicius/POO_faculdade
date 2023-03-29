public class App {
    int x;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("123.456.789-10");
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa("109.876.543-21");

        System.out.println("Quantidade 1: " + p1.quantPessoas);
        System.out.println("Quantidade 2: " + p1.quantidade);   
    }
/*
    public void imprimir(){
        System.out.println(this.x);
    }

    public static int somar(int y){
        this.x = this.x + y;
    }
*/
}
