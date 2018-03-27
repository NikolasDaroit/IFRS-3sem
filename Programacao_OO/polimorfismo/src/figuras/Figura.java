package figuras;
/*
 * Implemente classes para representar as figuras geométricas: círculo, retângulo e quadrado. Para
todas elas devem ser implementados métodos para retornar a área e o perímetro. O círculo possui
um raio e as outras classes os tamanhos dos lados. Além disso as figuras possuem uma cor, definida
por um atributo string e um atributo “filled” que diz se a figura é preenchida pela cor ou se é vazia.
 */
public class Figura {
	protected double width;
	protected double height;
	protected String cor;
	protected boolean filled;
	
	public double Area() {
		return width*height;
	}
	public double Perimetro() {
		return height*2+width*2;
	}
}
