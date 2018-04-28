package festas;
/*
 * 
a. crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um m�todo que retorne o valor do ingresso VIP (com o adicional inclu�do).
b. crie uma classe Normal, que herda Ingresso e possui um m�todo que imprime: "Ingresso Normal".
*c. crie uma classe CamaroteInferior (que possui a localiza��o do ingresso e m�todos para acessar e imprimir esta localiza��o) e 
*uma classe CamaroteSuperior, que � mais cara (possui valor adicional). Esta �ltima possui um m�todo para retornar o valor do ingresso.
* Ambas as classes herdam a classe VIP.

d. crie um main onde crie um ingresso. Pe�a para o usu�rio digitar 1 para normal e 2 para VIP.
Conforme a escolha do usu�rio, diga se o ingresso � do tipo normal ou VIP. Se for VIP, pe�a para ele digitar 1 para camarote superior e 2 para camarote inferior. Conforme a escolha do usu�rio, diga se que o VIP � camarote superior ou inferior. Imprima o valor do ingresso.

Crie a classe Imovel, que possui um endere�o e um pre�o.

a. crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie m�todos de acesso e impress�o deste valor adicional.

b. crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie m�todos de acesso e impress�o para este desconto.

c. codifique um main ao qual voc� deve criar um im�vel. Pe�a para o usu�rio digitar 1 para novo e 2 para velho. Conforme a defini��o do usu�rio, imprima o valor final do im�vel. Implemente o seguinte diagrama de classe

 */
public class CamaroteInferior extends Vip{
	protected int localizacaoIngresso;

	public int getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}

	public void setLocalizacaoIngresso(int localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
	public void imprime() {
		System.out.println("Localiza��o:"+localizacaoIngresso);
	}
	
}
