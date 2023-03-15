public class App {
    /*
     * 1 - Crie uma função EM JAVA que dado um salário e uma porcentagem de aumento
     * retorne o valor do salário atualizado
     * 
     * 2 - Crie um procedimento EM JAVA que imprima os nomes dos tipos de
     * dados/variáveis da linguagem JAVA
     * 
     * 3 - Crie uma função EM JAVA que dado um numero inteiro, retorne a soma de
     * zero até ele.
     */
    public static void main(String[] args) throws Exception {
        double salNovo = salNovo(1000.00, 10);
        System.out.println(salNovo);
    }
    static double salNovo(double salAntigo, double porcentAumento){
        double aumento = salAntigo / (porcentAumento / 100);
        double salNovo = salAntigo + aumento;
        return salNovo;
    }
}
