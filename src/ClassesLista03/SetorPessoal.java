/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLista03;

import utilidades.Msg;

/**
 * 4. Escreva uma classe “SetorPessoal” que tenha como atributo um vetor da
 * classe “Funcionário” e uma variável inteira para ser usada como índice do
 * vetor. Crie um construtor que receba como parâmetro o número de funcionários
 * de uma empresa para instanciar o vetor e inicialize o índice do vetor com
 * zero. Acrescente os seguintes métodos a classe:
 *
 * @author Klinger
 */
public class SetorPessoal {

    Funcionario[] funcionario;
    private Integer indice;

    /**
     * Inicializa o vetor e o indice na instância.
     *
     * @param numeroDeFuncionarios
     */
    public void SetorPessoal(Integer numeroDeFuncionarios) {
        funcionario = new Funcionario[numeroDeFuncionarios];
        setIndice(0);
    }

    /**
     * a. um método para adicionar funcionários no vetor definido na classe;
     * @param funcionario
     */
    public void adcionarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < this.funcionario.length; i++) {
            if (getFuncionario()[i] == null) {
                this.funcionario[i] = funcionario;
                break;
            }
        }
    }

    /**
     * b. um método que possa imprimir a folha de pagamento informando o nome
     * dos funcionários e o seus respectivos salários.
     */
    public void folhaDePagamento() {
        for (int i = 0; i < this.funcionario.length; i++){
            Msg.mostra("Funcionário: "+funcionario[i].getNome()+" "+funcionario[i].getSalario());
        }
    }
    
    /**
     * c. um método que possa retornar o valor total da folha de pagamento.
     */
    public double totalPagamento(){
        double totalPagamento = 0;
        for (int i = 0; i < this.funcionario.length; i++){
            totalPagamento += funcionario[i].getSalario();
        }
        return totalPagamento;
    }
    
    /**
     * d. um método que possa retornar o nome do funcionário que recebe o maior 
     * salário.
     */
    public String maiorSalario(){
        double maior = 0;
        String nomeSalario = null;
        for (int i = 0; i < this.funcionario.length; i++){
            if(funcionario[i].getSalario() > maior){
                nomeSalario = funcionario[i].getNome();
            }
        }
        return nomeSalario;
    }
    
    /**
     * e. um método que possa receber como parâmetro o número de um determinado 
     * departamento e mostrar o nome e o cargo de todos os funcionários daquele 
     * departamento.
     */
    public void nomeCargo(int departamento){
        for (int i = 0; i < this.funcionario.length; i++){
            if(funcionario[i].getDepartamento() == departamento){
                Msg.mostra(funcionario[i].getNome()+" - "+funcionario[i].getFuncao());
            }
        }
    }
    
    /**
     * f. um método que possa receber como parâmetro o nome de uma determinada 
     * função e posteriormente imprimir o nome de todas as pessoas que exercem essa função.
     */
    public void imprimirNomeFuncao(String funcao){
        for (int i = 0; i < this.funcionario.length; i++){
            if(funcionario[i].getFuncao().equalsIgnoreCase(funcao)){
                Msg.mostra("Funcionário: "+funcionario[i].getNome());
            }
        }
    }
    
    /**
     * g. um método que possa imprimir a folha de pagamento informando o nome dos 
     * funcionários e o seus respectivos salários em ordem crescente de salário.
     *Dica: É necessário criar um outro vetor que conterá o vetor original e posteriormente ordena-lo.
     */
    public void imprimirPagamentoCrecente(){
        Funcionario[] aux = new Funcionario[1];
        Funcionario[] funcionario2 = new Funcionario[this.funcionario.length];
        for(int cont = 0; cont < funcionario2.length; cont++){
            funcionario2[cont] = this.funcionario[cont];
        }
        for(int cont1 =0; cont1<funcionario2.length; cont1++){
                for(int cont2 =0; cont2 <this.funcionario.length-1; cont2++){
                   if(funcionario2[cont2].getSalario() > funcionario2[cont2+1].getSalario()){
                        aux[0] = funcionario2[cont2];
                        funcionario2[cont2] = funcionario2[cont2+1];
                        funcionario2[cont2+1] = aux[0];
                    }
                }
            }
        for(int ord =0; ord<funcionario2.length; ord++){
            Msg.mostra(funcionario2[ord].getNome()+" - "+funcionario2[ord].getSalario());
        }
    }
    

    /**
     * @return the indice
     */
    public Integer getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    /**
     * @return the funcionario
     */
    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }
}
