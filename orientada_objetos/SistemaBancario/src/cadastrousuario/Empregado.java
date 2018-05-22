/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *
 * @author Aluno
 */
abstract class Empregado extends Usuario{

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    protected String endereco;
    protected double salario;

    @Override
    public String toString() {
        return "Empregado{Nome: " +this.nome + " endereco=" + endereco + ", salario=" + salario + '}';
    }
    
}
