/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista02;

import utilidades.Msg;

/**
 *2. Escreva uma classe em Java que simule uma calculadora bem simples. 
 * Essa classe deve ter como atributos duas variáveis double e um char. 
 * Deve possuir um construtor que recebe como parâmetro dois números e um caracter, 
 * correspondente a uma das operações básicas (+, -, *, /). Deve ter um método para 
 * calcular a operação desejada e um para imprimir o resultado. O programa deve considerar 
 * divisões por zero como sendo erros, e imprimir uma mensagem adequada.
 * @author Klinger
 */
public class CalcSimples {
    private double numero1;
    private double numero2;
    private char operador;

    /**
     * Construtor que inicia os atributos.
     * @param num1
     * @param num2
     * @param oper 
     */
    public void CalcSimples(double num1,double num2,char oper){
        setNumero1(num1);
        setNumero2(num2);
        setOperador(oper);
    }
    
    /**
     * Calcula a operação entre 2 números.
     */
    public void calcular(){
         double resultado = 0;
        if (getOperador() == '+') {
            resultado = (getNumero1()+getNumero2());
        } else if (getOperador() == '-') {
            resultado = (getNumero1() - getNumero2());
        } else if (getOperador() == '/') {
            if(getNumero2() == 0){
                Msg.mostra("Divisão por 0 não aceita!");
            }
            resultado = (getNumero1() / getNumero2());
        } else if (getOperador() == '*') {
            resultado = (getNumero1() * getNumero2());
        }
        imprimirResultado(resultado);
    }
    
    /**
     * Imprime o resultado da operação.
     * @param resultado 
     */
    public void imprimirResultado(double resultado){
        Msg.mostra("O resultado da operação é "+resultado);
    }
    /**
     * @return the numero1
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the operador
     */
    public char getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(char operador) {
        this.operador = operador;
    }    
}
