/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista02;

import utilidades.Msg;

/**
 * 9. Escreva uma classe chamada “Fibonacci” que tenha um método que receba como
 * parâmetro um número inteiro para indicar a quantidade de termos que se quer
 * calcular e imprimir da série. Série: 1 + 1 + 2 + 3 + 5 + 8 + 13 + ...
 *
 * @author Klinger
 */
public class Fibonacci {

    private Integer num;
    private Integer termos;
    private String sequencia;
    private Integer resultado;
    private String respostaFibo;
    int vetorFibo[] = new int[(getNum() - 1)];

    /**
     *
     * @param num
     */
    public void Fibonacci(Integer num) {
        setNum(num);
    }

    /**
     * Calcula o próximo número para a sequência de Fibonacci.
     * @param n
     * @return 
     */
    static long calculoFibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return calculoFibo(n - 1) + calculoFibo(n - 2);
        }
    }

    /**
     * Calcula a série de Fibonacci.
     */
    public void calculaFibonacci() {
        setTermos(0);
        setResultado(0);
        setSequencia(null);
        for (int c : vetorFibo) {
            vetorFibo[c] = (int) Fibonacci.calculoFibo(c);
            setTermos(c);
            setSequencia(vetorFibo[c] + " ");
            setResultado(+vetorFibo[c]);
        }
    }

    /**
     * Mostra a sequência de Fibonacci.
     */
    public void mostraFibonacci() {
        Msg.mostra("A sequência tem " + getTermos() + " números." + "\n" + getSequencia() + "\n"
                + "Valor da soma da sequência: " + getResultado());
    }

    /**
     * 10. Acrescente a classe “Fibonacci” um método que receba como parâmetro um 
     * número inteiro e retorne verdadeiro se o número pertence a série e falso em caso contrário.
     * @param n
     * @return 
     */
    public boolean pertenceFibonacci(Integer n) {
        boolean pertence = false;
        for (int cont : vetorFibo) {
            if (getNum() == vetorFibo[cont]) {
                pertence = true;
                break;
            } else {
                pertence = false;
            }
        }        
        return pertence;
    }

    /**
     * @return the num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num the n to set
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return the termos
     */
    public Integer getTermos() {
        return termos;
    }

    /**
     * @param termos the termos to set
     */
    public void setTermos(Integer termos) {
        this.termos = termos;
    }

    /**
     * @return the sequencia
     */
    public String getSequencia() {
        return sequencia;
    }

    /**
     * @param sequencia the sequencia to set
     */
    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    /**
     * @return the resultado
     */
    public Integer getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the respostaFibo
     */
    public String getRespostaFibo() {
        return respostaFibo;
    }

    /**
     * @param respostaFibo the respostaFibo to set
     */
    public void setRespostaFibo(String respostaFibo) {
        this.respostaFibo = respostaFibo;
    }
}
