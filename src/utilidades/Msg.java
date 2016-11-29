/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Klinger
 */
public class Msg {
    public static String prompt(String x){
		String aux = javax.swing.JOptionPane.showInputDialog(x);
		return aux;
	}
	public static void mostra(String x){
		javax.swing.JOptionPane.showMessageDialog(null,x);
	}
	public static void texto(String x){
		System.out.println(x);
	}
	public static Integer pedeNumero(String x){
		try {
		Integer aux = Integer.parseInt(prompt(x));
		return aux;
		}
	catch(NumberFormatException e){ 
		Integer aux = Integer.parseInt(prompt("NUMERO INFORMADO INVALIDO,DIGITE NOVAMENTE"));
		return aux;
		}
	}
        public static Date formataData(String data) throws Exception { 
		if (data == null || data.equals(""))
			return null;
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException e) {            
            throw e;
        }
        return date;
	}
}
