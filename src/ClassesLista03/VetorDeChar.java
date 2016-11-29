/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista03;

import utilidades.Msg;

/**
 * 2. Escreva uma classe chamada “VetorDeChar” que tenha como atributo um vetor
 * de char e um construtor que receba como parâmetro uma frase. No construtor
 * deve ser passada a frase para o vetor de char. Dica: Use o método
 * “toCharArray” da classe String para colocar os elementos da frase no vetor.
 * Exemplo: char vetor[] = frase.toCharArray();
 *
 * @author Klinger
 */
public class VetorDeChar {

    char vetor[];

    /**
     *
     * @param frase
     */
    public void VetorDeChar(String frase) {
        vetor = frase.toCharArray();
    }

    /**
     * a. um método que retorne o número de vogais existentes na frase.
     */
    public Integer numeroDeVogais() {
        String vogais = "aeiou";
        int totalVogais = 0;
        int NumeroLetras = vetor.length;
        for (int cont = 0; cont < NumeroLetras; cont++) {
            if (vogais.indexOf(vetor[cont]) >= 0) {
                totalVogais++;
            }
        }
        return totalVogais;
    }
}
