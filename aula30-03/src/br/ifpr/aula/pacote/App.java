package br.ifpr.aula.pacote;

public class App {
    int x;
    public static void main(String[] args) {
        
        App pou = new App();
        System.out.println(pou.x);

        JogadorVolei simaoPerdedor = new JogadorVolei();

        // String corCabelo = simaoPerdedor.getCorCabelo();
        simaoPerdedor.setCorCabelo("preto");
    }
    public void imprimir(){
        System.out.println(this.x);
    }
}
