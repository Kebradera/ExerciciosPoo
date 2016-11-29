/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Klinger
 */
public class Texto {
    public static String nomeCompleto(){
		String nome = Msg.prompt("Informe seu nome completo: ");
		return nome;
	}
	public static String pegaSobrenome(String x){
		String nome = nomeCompleto().trim();
		for (int cont = 0; cont < nome.length() ; cont++ ){
			if (" ".equals(nome.substring(cont,1)))
				x = nome.substring(cont);
		}
		return x;
	}
	public static String pegaNome(String x){
		String nome = nomeCompleto().trim();
		for (int cont = 0; cont < nome.length() ; cont++ ){
			if (" ".equals(nome.substring(cont,1)))
				x = nome.substring(cont);
			break;
		}
		return x;
	}
	public static String misturaNome(String x,int k){
		
		return x;
	}
}
