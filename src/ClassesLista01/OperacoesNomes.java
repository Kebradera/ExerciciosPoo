/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista01;

import utilidades.Msg;
import utilidades.Texto;

/**
 * Lista 01
 *
 * @author Klinger
 */
public class OperacoesNomes {

    /**
     * 6. Receber o nome completo de uma pessoa e informar: a. O tamanho total
     * do nome. b. O tamanho de cada parte do nome. c. Quantas vezes a letra “A”
     * aparece no nome completo. d. Qual a letra que mais aparece no nome
     * sobrenome (para empate, mostre apenas uma).
     */
    public void nomeCompleto() {
        Integer tamanhoTotal = 0, letrasA = 0, partes = 0, maiorQtd = 0, x = 1, i = 0, j, contLetras = 0;
        String tamanhoPartes[] = new String[partes];
        String nome = Texto.nomeCompleto().trim();
        nome = nome.toLowerCase();
        String v = "";
        String[] nomeSeparado = nome.split(" ");

        for (int cont = 0; cont < nome.length(); cont++) {
            if (!" ".equals(nome.substring(cont, 1))) {
                tamanhoTotal++;
            } else {
                tamanhoPartes[partes] = ("A quantidade da " + x + " parte é " + (nomeSeparado[partes].length()));
                partes++;
                x++;
            }
            if ("a".equals(nome.substring(cont, 1)) || "A".equals(nome.substring(cont, 1))) {
                letrasA++;
            }
        }
        for (i = 0; i < nome.length(); i++) {
            for (j = 0; j < nome.length(); j++) {
                if (nome.charAt(i) == nome.charAt(j)) {
                    contLetras++;
                }
            }
            // ao imprimir as frequências, exclui a contagem dos espaços
            char c = nome.charAt(i);
            if (c >= 'a' && c <= 'z' && !v.contains("" + c)) {
                v = v + c;
                Msg.mostra("A letra " + nome.charAt(i) + " aparece " + contLetras + " vezes.");
            }
            contLetras = 0;
        }

        for (int cont2 = 0; cont2 <= partes; cont2++) {
            Msg.mostra("O tamanho total do nome é " + tamanhoTotal + "\n" + "b. O tamanho de cada parte do nome é. "
                    + tamanhoPartes[cont2] + "\n" + "c. Quantas vezes a letra “A” aparece no nome completo. " + letrasA
                    + "\n" + "d. Qual a letra que mais aparece no nome sobrenome (para empate, mostre apenas uma).");
        }
    }
}
