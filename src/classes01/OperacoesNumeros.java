/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes01;

import utilidades.Msg;

/**
 *
 * @author Klinger
 */
public class OperacoesNumeros {

    public void comparacao() {
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

    public void inteirosPositivos() {
        Msg.mostra("Lista 01 - questão 03");
        Integer num = Msg.pedeNumero("Informe um numero: ");
        for (int cont = 0; cont <= num; cont++) {
            if (cont % 2 == 0) {
                Msg.mostra(cont + " ");
            }
        }
    }

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
    
}
