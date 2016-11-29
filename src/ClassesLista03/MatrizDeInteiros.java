/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista03;

import utilidades.Msg;

/**
 *
 * @author Klinger
 */
public class MatrizDeInteiros {

    Integer[][] matriz;
    private Integer linha;
    private Integer coluna;

    /**
     *1. Escreva uma classe chamada “MatrizDeInteiros” que tenha como atributo uma
     * matriz de inteiros e um construtor que receba como parâmetro a ordem da matriz, 
     *a instancie e inicialize com zeros. Acrescente a classe os seguintes métodos:
     * @param qtdLinha
     * @param qtdColuna
     */
    public void MatrizDeInteiros(Integer qtdLinha,Integer qtdColuna) {
        setLinha(linha);
        setColuna(coluna);
        matriz = new Integer[qtdLinha][qtdColuna];
        for (int linhaV = 0; linhaV < qtdLinha; linhaV++) {
            for (int colunaV = 0; colunaV < qtdColuna; colunaV++) {
                matriz[linha][coluna] = 0;
            }
        }
    }

    /**
     *um método que receba como parâmetro três números inteiros indicando respectivamente linha, 
     * coluna e o valor que deve ser armazenado na linha e coluna indicada.
     *Obs: Caso a linha ou a coluna passadas como parâmetro estejam fora da ordem da matriz indique 
     * com uma mensagem o erro.
     * @param linha
     * @param coluna
     * @param valor
     */
    public void localizar(Integer linha,Integer coluna,Integer valor) {
        try {
            matriz[linha][coluna] = valor;
        } catch (Exception e) {
            Msg.mostra("Campo limite ultrapassado!");
        }
    }

    /**
     * b. um método “éQuadrada”, que retorna true se a matriz for quadrada (isto
     * é, tem o mesmo número de linhas e colunas).
     */
    public boolean eQuadrada() {
        if (getLinha() % getColuna() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * c. um método total que some todos os valores da matriz retornando o
     * resultado.
     */
    public void total() {
        Integer resultado = 0;
        for (int linhaV = 0; linhaV < getLinha(); linhaV++) {
            for (int colunaV = 0; colunaV < getColuna(); colunaV++) {
                resultado += matriz[linhaV][colunaV];
            }
        }
        Msg.mostra("A soma de todos valores da matriz é: " + resultado);
    }
    
    /**
     * d. um método que receba como parâmetro um determinado valor e retorne a
     * linha onde o elemento foi encontrado na matriz ou –1 caso contrário.
     */
    public void retorneLinha(Integer valor) {
        Integer encontrado = 0;
        for (int linhaV = 0; linhaV < getLinha(); linhaV++) {
            for (int colunaV = 0; colunaV < getColuna(); colunaV++) {
                if(matriz[linhaV][colunaV]==valor){
                    encontrado = linhaV;
                    break;
                }    
                else
                    encontrado = -1;                
            }
        }
        Msg.mostra("O valor foi encontrado na linha "+encontrado);
    }
    
    /**
     * @return the linha
     */
    public Integer getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public Integer getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }
}
