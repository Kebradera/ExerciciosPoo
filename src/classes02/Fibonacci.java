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
public class Fibonacci {
    private Integer num;
    private Integer termos;
    private String sequencia;
    private Integer resultado;
    private String respostaFibo;
    int vetorFibo[] = new int [(getNum()-1)];
    
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
    /**
     * 
     * @param num 
     */    
    public Fibonacci(Integer num){
        setNum(num);
    }
    static long calculoFibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return calculoFibo(n - 1) + calculoFibo(n - 2);
        }
    }
    public void calculaFibonacci(){
        setTermos(0);
        setResultado(0);
        setSequencia(null);
            for(int c : vetorFibo){
                vetorFibo[c] =  (int) Fibonacci.calculoFibo(c);
                setTermos(c);
                setSequencia(vetorFibo[c]+" ");
                setResultado(+ vetorFibo[c]);
            }
    }
    public void mostraFibonacci(){
        Msg.mostra("A sequência tem "+getTermos()+" números."+"\n"+getSequencia()+"\n"
                  +"Valor da soma da sequência: "+getResultado());
    }
    public String pertenceFibonacci(Integer n){
        boolean pertence = false;
        String mensagem;
        for(int cont : vetorFibo){
            if(getNum() ==  vetorFibo[cont]){
                pertence = true;
                break;
            }else pertence = false;
        }if(pertence == true)
            mensagem = "Este número pertence a sequência Fibonacci";
        else
            mensagem = "Este número não pertence a sequência Fibonacci";
        return mensagem;
    }

    
}
