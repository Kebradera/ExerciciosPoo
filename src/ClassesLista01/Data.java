/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import utilidades.Msg;

/**
 *
 * @author Klinger
 */
public class Data {

    private Integer dia;
    private Integer mes;
    private String mesExtenso;
    private Integer ano;
    private Date data;
    private String signo;

    GregorianCalendar calendar = new GregorianCalendar();

    public void dataSistema() {
        setDia(calendar.get(GregorianCalendar.DAY_OF_MONTH));
        setMes(calendar.get(GregorianCalendar.MONTH));
        setAno(calendar.get(GregorianCalendar.YEAR));
    }

    public void dataPassada() throws Exception {
        setData(Msg.formataData(Msg.prompt("Digite uma data no formato DD/MM/AAAA: ")));

    }

    /**
     * 5. Receber uma data no formato (DD/MM/AAAA) e mostrá-la no formato:
     * Recife, DD de mmmmmmmm de AAAA. Onde mmmmmmmm = mês por extenso. Suponha
     * o operador digitar uma data válida e no formato indicado. Ex.: 07/02/2012
     *  Recife, 07 de fevereiro de 2012
     *
     * @throws Exception
     */
    public void dataPassadaExtenso() throws Exception {
        dataPassada();
        converteMes();
        Msg.mostra("Recife, " + getDia() + " de " + getMesExtenso() + " de " + getAno());
    }

    /**
     * 7. Faça um programa que irá receber uma data de nascimento e informará a
     * qual signo pertence.
     *
     * @return
     * @throws Exception
     */
    public void qualSigno() throws Exception {
        dataPassada();
        if (getMes() == 1 && getDia() > 20 && getMes() == 2 && getDia() < 19) {
            setSigno("Aquários");
        } else if (getMes() == 2 && getDia() > 18 || getMes() == 3 && getDia() < 20) {
            setSigno("Peixes");
        } else if (getMes() == 3 && getDia() > 19 || getMes() == 4 && getDia() < 21) {
            setSigno("Áries");
        } else if (getMes() == 4 && getDia() > 20 || getMes() == 5 && getDia() < 21) {
            setSigno("Touro");
        } else if (getMes() == 5 && getDia() > 20 || getMes() == 6 && getDia() < 21) {
            setSigno("Gêmios");
        } else if (getMes() == 6 && getDia() > 20 || getMes() == 7 && getDia() < 22) {
            setSigno("Cancêr");
        } else if (getMes() == 7 && getDia() > 21 || getMes() == 8 && getDia() < 23) {
            setSigno("Leão");
        } else if (getMes() == 8 && getDia() > 22 || getMes() == 9 && getDia() < 23) {
            setSigno("Virgem");
        } else if (getMes() == 9 && getDia() > 22 || getMes() == 10 && getDia() < 23) {
            setSigno("Libra");
        } else if (getMes() == 10 && getDia() > 22 || getMes() == 11 && getDia() < 22) {
            setSigno("Escorpião");
        } else if (getMes() == 11 && getDia() > 21 || getMes() == 12 && getDia() < 22) {
            setSigno("Sagitário");
        } else if (getMes() == 12 && getDia() > 21 || getMes() == 1 && getDia() < 22) {
            setSigno("Capricórnio");
        }
        Msg.mostra(getSigno());
    }

    /**
     * 8. Faça um programa que irá exibir a quantidade de dias que faltam para
     * uma data informada.
     */
    /**
     * public void diasQueFaltam(){ SimpleDateFormat sdf = new
     * SimpleDateFormat("dd/MM/yyyy"); Calendar data1 = Calendar.getInstance();
     * Calendar data2 = Calendar.getInstance(); try {
     * data1.setTime(sdf.parse(jTextField1.getText()));
     * data2.setTime(sdf.parse(jTextField2.getText())); } catch
     * (java.text.ParseException e ) {} int dias =
     * data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR);
     * jTextField3.setText(String.valueOf(dias));
     *
     *
     * public static int getDaysOfInterval(String dataInit, String dataFinish) {
     * int[] data1 = new int[3]; int[] data2 = new int[3]; int dias = 0;
     * //Desmembra dia, mes e ano das datas; data1[0] =
     * Integer.parseInt(dataInit.substring(0, 2)); //dia; data1[1] =
     * Integer.parseInt(dataInit.substring(3, 5)); //mes; data1[2] =
     * Integer.parseInt(dataInit.substring(6, 10)); //ano; data2[0] =
     * Integer.parseInt(dataFinish.substring(0, 2)); //dia; data2[1] =
     * Integer.parseInt(dataFinish.substring(3, 5)); //mes; data2[2] =
     * Integer.parseInt(dataFinish.substring(6, 10)); //ano; int m1 =
     * getDaysMonth(data1[1], data1[2]); int m2 = getDaysMonth(data2[1],
     * data2[2]); if (data2[2] == data1[2]) { // Calculo para o mesmo ano; if
     * (data1[1] == data2[1]) { dias = data2[0] - data1[0]; } else { int
     * diasMes1 = (m1 - data1[0]) + 1; // numero de dias do primeiro mes (do dia
     * x até o dia 30); int diasMes2 = m2 - (m2 - data2[0]);	// numero de dias
     * do ultimo mes (do dia 1 até o dia x); int interMeses = (data2[1] -
     * data1[1]);	// quantidade de meses entre o primeiro e o ultimo mes; if
     * (interMeses == 0) { dias = diasMes1 + diasMes2; } else { for (int i = 1;
     * i < interMeses; i++) { dias += getDaysMonth(data1[1] + i, data1[2]); }
     * dias += (diasMes1 + diasMes2); } } } else {//Calculo para anos diferentes
     * int mesesAno1 = 12 - data1[1];	//Numero de Meses ate o fim do ano (O Mes1
     * não está incluído); int diasMes1 = m1 - data1[0];	//Numero de dias do
     * Mes1(inicial); for (int i = 0; i < mesesAno1; i++) { dias +=
     * getDaysMonth(data1[1] + i, data1[2]); } dias += diasMes1; int diasMes2 =
     * m2 - (m2 - data2[0]);	//Numero de dias do ultimo mes do periodo; int
     * mesesAno2 = data2[1] - 1;	//Numero de meses do mes 1 ate o mes x do novo
     * ano; for (int i = 0; i < mesesAno2; i++) {
     * dias += getDaysMonth(data2[1], data2[2]);
     * }
     * dias += diasMes2;
     * if (data2[2] - data1[2] > 1) { dias += 365 * (data2[2] - data1[2] - 1);
     * // quantidade de anos entre o primeiro e o ultimo ano; } } return dias; }
     * public static boolean yearIsBisext(int year) { //Ano Bisexto (Regras do
     * Calendário Gregoriano): // 1 - Todo ano divisível por 4 é bissexto // 2 -
     * Todo ano divisível por 100 não é bissexto // 3 - Mas se o ano for também
     * divisível por 400 é bissexto // FONTE:
     * http://blog.webcalc.com.br/2006/04/29/o-que-e-ano-bissexto/ boolean
     * retorno; if (year % 4 == 0) { if (year % 100 == 0) { if (year % 400 == 0)
     * { retorno = true; } else { retorno = false; } } else { retorno = true; }
     * } else { retorno = false; } return retorno; } public static int
     * getDaysMonth(int month, int year) { //O ano valor do ano será usado para
     * verificar se o ano é bisexto int[] mes = new int[12]; mes[0] = 31; if
     * (yearIsBisext(year)) { mes[1] = 29; } else { mes[1] = 28; } mes[2] = 31;
     * mes[3] = 30; mes[4] = 31; mes[5] = 30; mes[6] = 31; mes[7] = 31; mes[8] =
     * 30; mes[9] = 31; mes[10] = 30; mes[11] = 31; return mes[month - 1]; }
     *
     * @return
     * @throws java.lang.Exception}
     */

    //retorna o dia da semana dada uma data
    /**
     * 12. Faça um programa que irá informar o dia da semana de uma data
     * informada. Diga também se este dia é um dia útil ou final de semana.
     *
     * @return
     * @throws Exception
     */
    public String retornarDiaSemana() throws Exception {
        dataPassada();
        Calendar calendario = new GregorianCalendar(ano, mes - 1, dia);
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);

        String diaSemanaExtenso = null;
        String diaUtil = null;

        switch (diaSemana) {

            case 1: {
                diaSemanaExtenso = "Domingo";
                diaUtil = "Fim de semana";
                break;
            }
            case 2: {
                diaSemanaExtenso = "Segunda";
                diaUtil = "Dia útil";
                break;
            }
            case 3: {
                diaSemanaExtenso = "Terça";
                diaUtil = "Dia útil";
                break;
            }
            case 4: {
                diaSemanaExtenso = "Quarta";
                diaUtil = "Dia útil";
                break;
            }
            case 5: {
                diaSemanaExtenso = "Quinta";
                diaUtil = "Dia útil";
                break;
            }
            case 6: {
                diaSemanaExtenso = "Sexta";
                diaUtil = "Dia útil";
                break;
            }
            case 7: {
                diaSemanaExtenso = "Sábado";
                diaUtil = "Fim de semana";
                break;
            }

        }
        return (diaSemanaExtenso + " - " + diaUtil);

    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * @return the mesExtenso
     */
    public String getMesExtenso() {
        return mesExtenso;
    }

    /**
     * @param mesExtenso the mesExtenso to set
     */
    public void setMesExtenso(String mesExtenso) {
        this.mesExtenso = mesExtenso;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the signo
     */
    public String getSigno() {
        return signo;
    }

    /**
     * @param signo the signo to set
     */
    public void setSigno(String signo) {
        this.signo = signo;
    }

    /**
     * Lista 02_Questão 05. 
     * Construa a classe Data para que essa possua um método chamado “retornaMes”, 
     * que ao ser passado uma determinada data (do tipo Date) retorne uma String 
     * indicando o mês do ano da data passada como parâmetro. Use o comando switch 
     * para resolver o exercício.
     */
    public void converteMes() {
        switch (getMes()) {
            case 1:
                setMesExtenso("Janeiro");
                break;
            case 2:
                setMesExtenso("Fevereiro");
                break;
            case 3:
                setMesExtenso("Março");
                break;
            case 4:
                setMesExtenso("Abril");
                break;
            case 5:
                setMesExtenso("Maio");
                break;
            case 6:
                setMesExtenso("junho");
                break;
            case 7:
                setMesExtenso("Julho");
                break;
            case 8:
                setMesExtenso("Agosto");
                break;
            case 9:
                setMesExtenso("Setembro");
                break;
            case 10:
                setMesExtenso("Outubro");
                break;
            case 11:
                setMesExtenso("Novembro");
                break;
            default:
                setMesExtenso("Dezembro");
        }
    }
}
