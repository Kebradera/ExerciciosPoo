/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes02;

import utilidades.Msg;

/**
 *
 * @author Klinger
 */
public class CalcSimples {
    private double numero1;
    private double numero2;
    private char operador;
    private double resultado;

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

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void CalcSimples(double num1,double num2,char oper){
        setNumero1(num1);
        setNumero2(num2);
        setOperador(oper);
    }
    public void calcular(){
         double setResultado = 0.0;
        if (getOperador() == '+') {
            setResultado(getNumero1()+getNumero2());
        } else if (getOperador() == '-') {
            setResultado(getNumero1() - getNumero2());
        } else if (getOperador() == '/') {
            if(getNumero2() == 0){
                Msg.mostra("Divisão por 0 não aceita!");
            }
            setResultado(getNumero1() / getNumero2());
        } else if (getOperador() == '*') {
            setResultado(getNumero1() - getNumero2());
        }
    }
    public double imprimirResultado(){
        return getResultado();
    }
   
    
}
