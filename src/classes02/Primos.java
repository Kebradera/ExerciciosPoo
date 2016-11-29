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
public class Primos {
    
    
    public void verificarPrimo(Integer num){
        Integer dividido = 0;
        for(int cont = 1;cont <= num;cont++){
            if(num%cont == 0){
                dividido ++;
            }
        }
        if(dividido <= 2)
            Msg.mostra("Este número é PRIMO");
        else
            Msg.mostra("Este número não é Primo");
    }
    public void intervaloPrimo(Integer num1,Integer num2){
        do {            
            num1 = Msg.pedeNumero("Digite o primeiro número: ");
            num2 = Msg.pedeNumero("Digite o primeiro número: ");
            if(num1 <= num2){
                Msg.mostra("O primeiro número não pode ser menor que o segundo.");
            }
        } while (num1 <= num2);
        boolean primo = false;
        for(int cont = num2; cont <= num1; cont++ ){
            for(int c = 1; c <= cont; c++){
                primo = false;
                Integer dividido = 0;
                if(cont % c == 0)
                    dividido ++;
                if(dividido <= 2)
                    primo = true;
            }
                if(primo == true)
                    Msg.mostra("São primos: "+cont);
        }
        
    }
}
