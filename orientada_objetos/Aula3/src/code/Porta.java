package code;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX, dimensaoY, dimensaoZ;
	
	public Porta(){
		aberta=false;
		dimensaoX=12;
		dimensaoY=13;
		dimensaoZ=14;
	}
	public String toString() {
		return "Cor: "+this.cor+"\nAberta: "+this.estaAberta()+"\nDimensao X: "+this.dimensaoX+"\nDimensao Y: "+this.dimensaoY+"\nDimensao Z: "+this.dimensaoZ;
	}
	public String getCor() {
		return cor;
	}

	public void pinta(String cor) {
		this.cor = cor;
	}
	public void setDimensoes(double x, double y, double z){
		this.dimensaoX = x;
		this.dimensaoY = y;
		this.dimensaoZ = z;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void abre(){
		this.aberta=true;
	}
	public void fecha(){
		this.aberta=false;
	}

	public String estaAberta(){
		if(this.aberta){
			return "Aberta";
		}else{
			return "Fechada";
		}
	}            
	
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
}
