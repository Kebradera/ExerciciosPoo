/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista02;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import utilidades.Msg;

/**
 * 3. Escreva uma classe “EntradaDeCinema” com a seguinte estrutura (dados): 
 * Data dataDoFilme  float horário  int sala  float valor E com as seguintes
 * ações (métodos):  Construtor: com a finalidade de inicializar todos os
 * atributos.  CalculaDesconto: que deve receber como parâmetro a data de
 * nascimento do cliente (do tipo Data) e caso seja menor de 12 anos, deve ser
 * dado um desconto de 50% no valor normal.  CalculaDesconto: que deve receber
 * como parâmetro a data de nascimento do cliente (do tipo Data) e o número de
 * sua carteira de estudante (do tipo int). Se o estudante tiver idade entre 12
 * e 15 anos, deve ser dado um desconto de 40%, de 16 a 20 um desconto de 30% e
 * mais que 20 anos um desconto de 20% no valor normal. 
 * CalculaDescontoHorário: esse método deve dar um desconto de 10% sobre o valor
 * aferido após todas as outras opções de desconto, caso o horário do filme seja
 * antes das 16 horas.  toString(): que deve imprimir todos os dados do
 * ingresso.
 *
 * @author Klinger
 */
public class EntradaDeCinema {

    private Date dataDoFilme;
    private float horario;
    private int sala;
    private float valor;

    /**
     *
     * @param dataDoFilme
     * @param horario
     * @param sala
     * @param valor
     */
    public void EntradaDeCinema(Date dataDoFilme, float horario, int sala, float valor) {
        setDataDoFilme(dataDoFilme);
        setHorario(horario);
        setSala(sala);
        setValor(valor);
    }

    /**
     * Calcula desconto por idade.
     *
     * @param dataNasc
     */
    public void calculaDesconto(Date dataNasc) {
        double desc = 1;
        CalculaIdade a = new CalculaIdade();
        int idade = a.calculaIdade(dataNasc);
        if (idade < 12) {
            desc = 0.5;
        } 
        setValor((float) (getValor() * desc));
    }

    /**
     * Calcula desconto por idade e carteira de estudante.
     *
     * @param dataNasc
     * @param carteira
     */
    public void calculaDesconto(Date dataNasc, int carteira) {
        double desc = 1;
        CalculaIdade a = new CalculaIdade();
        int idade = a.calculaIdade(dataNasc);
        if ((idade >= 12) && (idade <= 15)) {
            desc = 0.6;
        } else if ((idade >= 16) && (idade <= 20)) {
            desc = 0.7;
        } else {
            desc = 0.8;
        }
        setValor((float) (getValor() * desc));
    }

    /**
     * Calcula desconto por horario do filme.
     *
     * @param horario
     */
    public void descontoDeHorario(float horario) {
        double desc = 1;
        setHorario(horario);
        if (getHorario() < 16) {
            desc = 0.9;
        } 
        setValor((float) (getValor() * desc));
    }

    /**
     * Imprime os dados da entrada do cinema com seus descontos.
     */
    public void imprimirIngresso() {
        Msg.mostra("Data do filme " + getDataDoFilme() + "\n"
                + "Horario do filme " + getHorario() + "\n"
                + "Sala do filme " + getSala() + "\n"
                + "Total pago " + getValor());
    }

    /**
     * 4. Desenvolva uma aplicação que leia os dados necessários para instanciar
     * e imprimir o ingresso para clientes normais, menores de 12 anos e
     * estudantes. no main:
     *EntradaDeCinema(Date dataDoFilme, float horario, int sala, float valor);
     * if(getCarteira()=0){
     *  calculaDesconto(getDataNasc());
     *  descontoDeHorario(getHorario());
     * }else{
     * calculaDesconto(getDataNasc(),getCarteira());
     * descontoDeHorario(getHorario());
     * imprimirIngresso();
     */
    
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
}
