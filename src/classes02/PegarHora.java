/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Klinger
 */
public class PegarHora {
    public String horaAtualFormatada(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dataFormatada = sdf.format(hora);
        return dataFormatada;
    }
    public Date horaAtual(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime();
        return hora;
    }

    int get(int HOUR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
