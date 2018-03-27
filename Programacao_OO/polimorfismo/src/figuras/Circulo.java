package figuras;

public class Circulo extends Figura{
	private double raio;
	
	public double Area() {
		return this.raio*this.raio*3.141592;
		
	}
	public double Perimetro() {
		return this.raio*2*3.141592;
	}
}
