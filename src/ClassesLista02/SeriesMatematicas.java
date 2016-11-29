/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista02;

import utilidades.Msg;

/**
 *6. O valor de xy pode ser calculado como sendo x multiplicado por si mesmo y 
 * vezes (se y for inteiro). Escreva uma classe chamada “SeriesMatemáticas” que 
 * contenha um construtor para inicializar x e y, um método chamado “elevadoA” 
 * que calcule e retorne o resultado de xy , e um método chamado “imprimeResultado” 
 * que mostre o resultado obtido. Obs: Use o comando while.
 * @author Klinger
 */
public class SeriesMatematicas {
    
    private double x;
    private Integer y;
    
    /**
     * 6. Construtor para inicializar os atributos.
     * @param x
     * @param y
     */
    public void SeriesMatematicas(double x,Integer y){
        setX(x);
        setY(y);
    }
    
    /**
     * 6. Calcula a potência de XY.
     * @return 
     */
    public double elevadoA(){
        int cont = 1;
        double res = getX();
        while(cont <= getY())
            res = res * getX();
        return res;
    }
    
    /**
     * 6. Imprime o resultado da otência XY.
     */
    public void imprimeResultado(){
        Msg.mostra("O resultado da potência "+getX()+" elevado a "+getY()+" é: "+elevadoA());
    }
    
    /**
     * 7. Acrescente a classe “SeriesMatematicas” o método “piQuadradoSobre8” que 
     * calcule a série (1/12) + (1/32) + (1/52) + (1/72) + (1/92) + ... Evidentemente 
     * a série não poderá ser calculada infinitamente, devendo parar depois de N termos, 
     * sendo que o valor de N deve ser fornecido como parâmetro ao método. Obs: Use o comando do-while.
     * @param n 
     * @return  
     */
    public double piQuadradoSobre8(int n){
        int cont = 0;
        int div = 12;
        double res = 0;
        do {
            res += 1/div;
            div += 20;
            cont += 1;            
        } while (cont <= n);
        return res;
    }

    /**
     * 8. Acrescente a classe “SeriesMatematicas” o método “calculaPi” que calcule 
     * a série 2 x (2/1) x (2/3) x (4/3) x (4/5) x (6/5) x (6/7)... Evidentemente 
     * a série não poderá ser calculada infinitamente, devendo parar depois de N termos, 
     * sendo que o valor de N deve ser fornecido como parâmetro ao método. O resultado 
     * da série deve retornar um valor aproximado a PI.
     * @param n 
     */
    public void calculaPi(int n){
        
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

}
