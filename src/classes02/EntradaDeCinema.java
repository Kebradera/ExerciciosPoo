/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes02;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Klinger
 */
public class EntradaDeCinema {
    private Date dataDoFilme;
    private float horario;
    private int sala;
    private float valor;

    public EntradaDeCinema(String data, float horario, int sala, float valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dataDoFilme
     */
    public Date getDataDoFilme() {
        return dataDoFilme;
    }

    /**
     * @param dataDoFilme the dataDoFilme to set
     */
    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }

    /**
     * @return the horario
     */
    public float getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(float horario) {
        this.horario = horario;
    }

    /**
     * @return the sala
     */
    public int getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(int sala) {
        this.sala = sala;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void EntradaDeCinema(Date dataDoFilme,float horario,int sala,float valor ){
        setDataDoFilme(dataDoFilme);
        setHorario(horario);
        setSala(sala);
        setValor(valor);
    }
    public void calculaDesconto(Date dataNasc){
        double desc = 1;
        CalculaIdade a = new CalculaIdade();
        int idade = a.calculaIdade(dataNasc);
        if(idade < 12){
        desc = 0.5;
        }
        setValor((float) (getValor()*desc));
        
    }
    public void calculaDesconto(Date dataNasc,int carteira){
        double desc = 1;
        CalculaIdade a = new CalculaIdade();
        int idade = a.calculaIdade(dataNasc);
        if((idade >= 12) && (idade <= 15))
            desc = 0.6;
        else
            if((idade >= 16) && (idade <= 20))
                desc = 0.7;
                else
                desc = 0.8;
        setValor((float) (getValor()*desc));
    }
    public void descontoDeHorario(float horario){
        double desc = 1;
        setHorario(horario);
        if(getHorario()< 16){
            desc = 0.9;
        }
        setValor((float) (getValor()*desc));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, getDataDoFilme()+"\n"+getHorario()+
                                            "\n"+getSala()+"\n"+getValor());
    }
}
