/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista02;

/**
 *1. Escreva uma classe chamada classe “Comparavel” que tem como atributo um valor inteiro,
 * um construtor para inicializar o atributo e os métodos éMaiorOuIgual, éMenorOuIgual e 
 * éDiferenteDe que recebem um valor do tipo int como parâmetro e retornam true se o valor 
 * encapsulado for, respectivamente, maior ou igual, menor ou igual ou diferente do passado 
 * como parâmetro.
 * @author Klinger
 */
public class Comparavel {
    private Integer valor;
    
    /**
     * Método construtor
     */
    public void Comparavel(){
    }
    
    /**
     * Método construtor para iniciar o atributo
     * @param x 
     */
    public void Comparavel(Integer x){
        setValor(x);
    }
    
    /**
     * Compara se é maior.
     * @param x
     * @return 
     */
    public boolean maiorIgual(int x){
        if(getValor() >= x)
            return true;
        else return false;
    }   
    
    /**
     * Compara se é menor.
     * @param x
     * @return 
     */
    public boolean menorIgual(int x){
        if(getValor() <= x)
            return true;
        else return false;
    }
    
    /**
     * Compara se é diferente.
     * @param x
     * @return 
     */
    public boolean diferente(int x){
        if(getValor() != x)
            return true;
        else return false;
    }
    /**
     * @return the valor
     */
    public Integer getValor() {
        return valor;
    }
    
    /**
     * @param valor the valor to set
     */
    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
