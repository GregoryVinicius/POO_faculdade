package br.ifpr.paranavai.polimorfismo.gregory;

import br.ifpr.paranavai.polimorfismo.gregory.Atividade;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(234);
        int a[] = {1,2,3};
        int soma = soma(a);
        System.out.println(soma);
        System.out.println(soma(a));
        
    }
    public static double soma(double x, double y){
        return x + y;
    }

    public static double soma(String x, String y){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        return a + b;
    }

    public static int soma(int x[]) {
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma += x[i];
        }
        return soma;
    }

    public static float soma(Float... x ){
        float soma = 0;
        for(float valor : x){
            soma += valor;
        }
        return soma;
    }

    /* soma vetor de caracteres -usar tabela asc2 
     * somar suas String com double
     * somar dois vetores de inteiros retomar o vetor com a soma
    */


}
