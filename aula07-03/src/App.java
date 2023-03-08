public class App {
    public static void main(String[] args) throws Exception {
        int contagem = 0;
        Carro camaro = new Carro();
        camaro.cor = "branco";
        Anunciante iago = new Anunciante();
        Anunciante theo = new Anunciante();
        iago.nome = "Iago";
        System.out.println(iago.nome);
        theo.nome = "Theo";
        System.out.println(theo.nome);
    }
}