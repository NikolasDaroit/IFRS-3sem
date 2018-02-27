package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Escreva a descrição da classe Funcionario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Funcionario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Departamento departamento;
    private double salario;
    private Date data;
    private String rg;
    private boolean ativo;
    private String nome;
    

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
     * COnstrutor para objetos da classe Funcionario
     * altura
     * largura
     * comprimento
     * peso
     */
    public Funcionario()
    {
        // inicializa variáveis de instância
    	nome = utils.generateName();
    	departamento = new Departamento();
        salario = 2000;
        Date myDate = parseDate("2014-02-14");
        data=myDate;
        rg="234234234";
        ativo=true;
    }
    public boolean iguais(Funcionario func){
        if (this == func) {
            return true;
        } else {
            return false; 
        }
    }
   public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
     }
    public void bonifica(double percent){
    	this.salario += this.salario * (percent/100);
    }
    
    public double calculaGanhoAnual(){
    	return (this.salario*12);
    }
    public String toString() {
    	return ("Funcionario: "+this.nome+"\nAtivo: "+this.ativo+ "\nData de cadastro: " + this.data+ "\nDepartamento: " + this.departamento+ "\nRG: " + this.rg+ "\nSalario: " + this.salario);
    }
    public void mostra(){
    	utils.print("\n"+this.toString()+"\n");
    }
    public void demite(){
    	if (this.ativo){
    		this.ativo = false;
    	}
    }

	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getData() {
		return data.getDate();
	}


	public void setData(String data) {
		/*** Formato dd/MM/yyyy ***/
		Date myDate = parseDate(data);
		this.data = myDate;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
