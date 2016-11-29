/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes03;

import utilidades.Msg;

/**
 *
 * @author Klinger
 */
public class MatrizDeInteiros {

    Integer[][] matriz;

    /**
     *
     * @param qtdLinha
     * @param qtdColuna
     */
    public void MatrizDeInteiros() {
        Integer qtdLinha = Msg.pedeNumero("Lista 03 - Questão 01: " + "/n" + "Escreva uma classe chamada “MatrizDeInteiros” que tenha como" + "/n"
                + "atributo uma matriz de inteiros e um construtor que receba como parâmetro a ordem da matriz," + "/n"
                + "a instancie e inicialize com zeros. Acrescente a classe os seguintes métodos:" + "/n"
                + "INSIRA A QUANTIDA DE LINHAS: ");
        Integer qtdColuna = Msg.pedeNumero("INSIRA A QUANTIDADE DE COLUNAS: ");
        matriz = new Integer[qtdLinha][qtdColuna];
        for (int linha = 0; linha < qtdLinha; linha++) {
            for (int coluna = 0; coluna < qtdColuna; coluna++) {
                matriz[linha][coluna] = 0;
            }
        }
    }

    /**
     *
     * @param linha
     * @param coluna
     * @param valor
     */
    public void localizar() {
        Integer linha = Msg.pedeNumero("a. um método que receba como parâmetro três números inteiros indicando " + "/n"
                + "respectivamente linha, coluna e o valor que deve ser armazenado na linha e coluna indicada." + "\n"
                + "Obs: Caso a linha ou a coluna passadas como parâmetro estejam fora da ordem da matriz indique com uma mensagem o erro." + "/n"
                + "INSIRA A LINHA: ");
        Integer coluna = Msg.pedeNumero("INSIRA A COLUNA: ");
        Integer valor = Msg.pedeNumero("INSIRA O VALOR: ");

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
    public void eQuadrada() {
        
    }
    /**
     * c. um método total que some todos os valores da matriz retornando o resultado.
     */
    public void total(){
        
    }
    /**
     * d. um método que receba como parâmetro um determinado valor e retorne a 
     * linha onde o elemento foi encontrado na matriz ou –1 caso contrário.
     */
    public void retorneLinha(){
        
    }
}
