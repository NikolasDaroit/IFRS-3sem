package code;

public class Casa {
	private String cor;
	private Porta porta1, porta2, porta3;
	public Casa(){
		cor="Branco";
		porta1 = new Porta();
		porta2 = new Porta();
		porta3 = new Porta();

	}
	public void pinta(String s){
		this.cor = s;
	}
	public String toString() {
    	return ("Cor: "+this.cor+"\nPorta1: "+this.porta1.isAberta()+ "\nPorta2: "+this.porta2.isAberta()+"\nPorta3: "+this.porta3.isAberta());
    }
	public int quantasPortasEstaoAbertas(){
		int total = 0;
		total = porta1.isAberta()  ? total+=1 : total;
		total = porta2.isAberta()  ? total+=1 : total;
		total = porta3.isAberta()  ? total+=1 : total;
		return total;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Porta getPorta1() {
		return porta1;
	}
	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}
	public Porta getPorta2() {
		return porta2;
	}
	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}
	public Porta getPorta3() {
		return porta3;
	}
	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}
	
	
}
