/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista01;

import utilidades.Msg;

/**
 * Lista de Exercícios 01
 *
 * @author Klinger
 */
public class OperacoesNumeros {

    /**
     * 1. Faça um programa que receberá um número (inteiro e positivo) e dirá se
     * este número é maior, menor ou igual a 10.
     */
    public static void comparacao() {
        Msg.mostra("Lista 01 - questão 01");
        Integer num = Msg.pedeNumero("Informe um numero: ");
        if (num > 10) {
            Msg.mostra("O número " + num + " é maior que 10");
        } else if (num < 10) {
            Msg.mostra("O número " + num + " é menor que 10");
        } else {
            Msg.mostra("O número " + num + " é igual a 10");
        }
    }

    /**
     * 2. Faça um programa que receberá um número inteiro e positivo, de 1 a 3,
     * e exibirá na tela uma mensagem dependendo do número informado: a. “olá”,
     * se o número for igual a 1; b. “quase”, se o número for igual a 2; c.
     * “tchau”, se o número for igual a 3;
     */
    public void numeroMensagem() {
        Msg.mostra("Lista 01 - questão 02");
        Integer num = Msg.pedeNumero("Informe um numero de 1 a 3: ");
        while (num != 999) {
            while (num < 1 || num > 3) {
                num = Msg.pedeNumero("NUMERO INVALIDO,DIGITE UM NUMERO ENTRE 1 E 3: ");
                switch (num) {
                    case 1:
                        Msg.mostra("Ola!");
                        break;
                    case 2:
                        Msg.mostra("Quase");
                        break;
                    default:
                        Msg.mostra("Tchau");
                }
                num = Msg.pedeNumero("Informe outro numero de 1 a 3,ou 999 para sair");
            }
        }
    }

    /**
     * 3. Faça um programa que irá imprimir todos os números inteiros e
     * positivos menores que um número informado.
     */
    public void inteirosPositivos() {
        Msg.mostra("Lista 01 - questão 03");
        Integer num = Msg.pedeNumero("Informe um numero: ");
        for (int cont = 0; cont <= num; cont++) {
            if (cont % 2 == 0) {
                Msg.mostra(cont + " ");
            }
        }
    }

    /**
     * 4. Elabore um algoritmo que irá receber dois números inteiros e exibirá:
     * a. A soma de todos os números de zero até cada um dos números, incluindo
     * duplicações. Ex.: número1 = 5; número2 = 6 Resultado esperado: 1+2+3+4+5
     * + 1+2+3+4+5+6  36 b. A soma de todos os números pares, de zero até o
     * número. c. A soma de todos os números múltiplos de 3, de zero até o
     * número.
     */
    public void doisNumeros() {
        Msg.mostra("Lista 01 - questão 04");
        Integer num1 = Msg.pedeNumero("Informe o primeiro numero: ");
        Integer num2 = Msg.pedeNumero("Informe o segundo numero: ");
        Integer soma1 = 0, par1 = 0, mult1 = 0, soma2 = 0, par2 = 0, mult2 = 0;
        for (int cont = 0; cont <= num1; cont++) {
            soma1 += cont;
            if (cont % 2 == 0) {
                par1 += cont;
            }
            if (cont % 3 == 0) {
                mult1 += cont;
            }
        }
        for (int cont2 = 0; cont2 <= num2; cont2++) {
            soma2 += cont2;
            if (cont2 % 2 == 0) {
                par2 += cont2;
            }
            if (cont2 % 3 == 0) {
                mult2 += cont2;
            }
        }
        Msg.mostra("a)A soma dos numeros totais e: " + (soma1 + soma2) + "\n"
                + "b)A soma dos numeros pares e: " + (par1 + par2) + "\n"
                + "c)A soma dos multiplos de 3 e: " + (mult1 + mult2));
    }

    /**
     *9. Faça um programa que irá calcular a média entre dois números informados.
     * Considere que qualquer número dividido por zero é igual a zero.
     */
    
    
    /**
     * 10. Faça um programa que irá informar se um dado número é impar ou par.
     */
    
    
    /**
     * 11. Faça um programa que irá informar se um número é primo ou não.
     */
    
    
    /**
     * 13. Faça um programa que exiba a tabela abaixo
     *01.02.03.04.05.06.07.08.09.10
     *02.04.06.08.10.12.14.16.18.20
     *03.06.09.12.15.18.21.24.27.30
     *04.08.12.16.20.24.28.32.36.40
     *05.10.15.20.25.30.35.40.45.50
     *06.12.18.24.30.36.42.48.54.60
     *07.14.21.28.35.42.49.56.63.70
     *08.16.24.32.40.48.56.64.72.80
     *09.18.27.36.45.54.63.72.81.90
     *10.20.30.40.50.60.70.80.90.100
     */
}
