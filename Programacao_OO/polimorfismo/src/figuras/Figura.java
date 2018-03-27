package figuras;
/*
 * Implemente classes para representar as figuras geom�tricas: c�rculo, ret�ngulo e quadrado. Para
todas elas devem ser implementados m�todos para retornar a �rea e o per�metro. O c�rculo possui
um raio e as outras classes os tamanhos dos lados. Al�m disso as figuras possuem uma cor, definida
por um atributo string e um atributo �filled� que diz se a figura � preenchida pela cor ou se � vazia.
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
