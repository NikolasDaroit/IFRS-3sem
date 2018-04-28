package test;
import code.Casa;
import code.utils;
public class CasaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casa casa = new Casa();
		casa.getPorta1().setAberta(true);
		casa.pinta("verde");
		utils.print(casa.quantasPortasEstaoAbertas());
		utils.print(casa);
	}

}
