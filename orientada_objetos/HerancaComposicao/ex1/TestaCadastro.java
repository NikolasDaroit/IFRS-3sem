package ex1;

public class TestaCadastro {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Cliente c = new Cliente();
		Gerente g = new Gerente();
		
		f.setSalario(1000);
		f.setNome("funcionario");
		Data d = new Data();
		d.setDia(1);d.setMes(1);d.setAno(2001);
		f.setData(d);
		c.setNome("cliente");
		c.setData(d);
		c.setCodigo(1312);
		g.setArea("asdas");
		g.setData(d);
		g.setNome("gerente");
		g.setSalario(7823);
		
		CadastroPessoa cp = new CadastroPessoa();
		cp.cadastraPessoa(f);
		cp.cadastraPessoa(c);
		cp.cadastraPessoa(g);
		cp.imprimeCadastro();
	}
}
