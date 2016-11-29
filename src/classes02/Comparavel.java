/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes02;

/**
 *
 * @author Klinger
 */
public class Comparavel {
    private Integer valor;
    /**
     * @return the valor
     */
    public Integer getValor() {
        return valor;
    }
    /**
     * 
     */
    public void Comparavel(){
    }
    /**
     * 
     * @param x 
     */
    public void Comparavel(Integer x){
        setValor(x);
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    public boolean maiorIgual(int x){
        if(getValor() >= x)
            return true;
        else return false;
    }   
    public boolean menorIgual(int x){
        if(getValor() <= x)
            return true;
        else return false;
    }
    public boolean diferente(int x){
        if(getValor() != x)
            return true;
        else return false;
    }
}
