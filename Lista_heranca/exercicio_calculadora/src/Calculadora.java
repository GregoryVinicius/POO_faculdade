import java.util.Scanner;

public class Calculadora {
    protected float num1;
    protected float num2;
    protected String operacoes;


    public Calculadora() {
    }

    public float getNum1() {
        return this.num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return this.num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getOperacoes() {
        return this.operacoes;
    }

    public void setOperacoes(String operacoes) {
        this.operacoes = operacoes;
    }
    
    public float calculo(){
        float resultado;
        if(this.operacoes == "+"){
            resultado = this.num1 + this.num2;
        }else if(this.operacoes == "-"){
            resultado = this.num1 - this.num2;
        }else if(this.operacoes == "*"){
            resultado = this.num1 * this.num2;
        }else if(this.operacoes == "/"){
            resultado = this.num1 / this.num2;
        }else{
            System.out.println("Operação matematica invalida.");
            return 0;
        }
        return resultado;
    }
    
}
