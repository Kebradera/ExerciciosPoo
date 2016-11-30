/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista03;

/**
 *3. Escreva uma classe “Funcionário” com os atributos matricula (int), nome (String), 
 * departamento (int), salário (float) e função (String). Adicione na classe um 
 * construtor que receba todos os parâmetros para inicializar os dados de um funcionário.
 * @author Klinger
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;
    
    /**
     * Construtor para inicializar os atributos.
     * @param matricula
     * @param nome
     * @param departamento
     * @param salario
     * @param funcao
     */
    public void Funcionario(int matricula,String nome,int departamento,float salario,String funcao){
        setMatricula(matricula);
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
        setFuncao(funcao);
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
