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
public class SeriesMatematicas {
    
    private double x;
    private Integer y;
    private double resultado;
    private double resultadopiQuadradoSobre8;
    private double calculaPi;

    
    /**
     *
     * @param x
     * @param y
     */
    public SeriesMatematicas(double x,Integer y){
        setX(x);
        setY(y);
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
    public void elevadoA(){
        int cont = 1;
        double res = getX();
        while(cont <= getY())
            res = res * getX();
        setResultado(res);
    }
    public void imprimeResultado(){
        Msg.mostra("O resultado da potência "+getX()+" elevado a "+getY()+" é: "+getResultado());
    }
    public void piQuadradoSobre8(Integer n){
        int cont = 0;
        int div = 12;
        double res = 0;
        do {
            res += 1/div;
            div += 20;
            cont += 1;            
        } while (cont <= n);
        setResultadopiQuadradoSobre8(res);
    }

    /**
     * @return the resultadopiQuadradoSobre8
     */
    public double getResultadopiQuadradoSobre8() {
        return resultadopiQuadradoSobre8;
    }

    /**
     * @param resultadopiQuadradoSobre8 the resultadopiQuadradoSobre8 to set
     */
    public void setResultadopiQuadradoSobre8(double resultadopiQuadradoSobre8) {
        this.resultadopiQuadradoSobre8 = resultadopiQuadradoSobre8;
    }
    public void calculaPi(int n){
        
    }

    /**
     * @return the calculaPi
     */
    public double getCalculaPi() {
        return calculaPi;
    }

    /**
     * @param calculaPi the calculaPi to set
     */
    public void setCalculaPi(double calculaPi) {
        this.calculaPi = calculaPi;
    }
    
}
