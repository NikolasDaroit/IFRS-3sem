import java.util.ArrayList;

public class Colmeia {
	private Rainha rainha;
	private Operaria[] operarias = new Operaria[20];
	private int oCount =0;
	
	public Colmeia() {
		rainha = new Rainha();
	}
	public float coletaMel() {
		System.out.println("coletando");
		return 1;
	}
	public boolean addRainha(Rainha r) {
		this.rainha = r;
		return true;
	}
	public String toString() {
		return "Rainha "+this.rainha;
	}
	public void geraOperaria() {
		operarias[oCount++] = this.rainha.cria();
	}
	
}
