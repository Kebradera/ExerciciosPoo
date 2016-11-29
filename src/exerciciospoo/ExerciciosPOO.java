/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospoo;

import classes02.EntradaDeCinema;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author Klinger
 */
public class ExerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String data = JOptionPane.showInputDialog(null, "Data do filme: ");
        java.util.Date dataEntrada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        float horarioDoFilme = parseInt(JOptionPane.showInputDialog("Digite o horário do filme: "));
        int sala = parseInt(JOptionPane.showInputDialog("Digite a sala do filme: "));
        float valor = parseInt(JOptionPane.showInputDialog("Digite o valor da entrada: "));
        String dataNasc = JOptionPane.showInputDialog(null, "Data de Nascimento: ");
        java.util.Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
        int carteiraEstudante = parseInt(JOptionPane.showInputDialog("Digite a carteira de estudante: "));
        EntradaDeCinema edc = new EntradaDeCinema(dataEntrada, horarioDoFilme, sala, valor);
        edc.calculaDesconto(dataNascimento);
        edc.calculaDesconto(dataNascimento, carteiraEstudante);
        edc.descontoDeHorario(horarioDoFilme);
        edc.imprimir();

    }

}
