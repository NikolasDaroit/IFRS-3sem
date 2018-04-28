package animais;

public class Teste {

	public static void main(String[] args) {
		Gato g = new Gato("gatineo");
		Dogo d = new Dogo("wow");
		System.out.println(g.caminha());
		g.emitirSom();
		System.out.println(d.caminha());
		d.emitirSom();

	}

}
