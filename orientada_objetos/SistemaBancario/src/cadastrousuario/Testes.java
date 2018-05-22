/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;


/**
 *
 * @author Aluno
 */
public class Testes {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        usuario.setNome("Usuariosão");
        usuario.setEmail("user@user.com");
        
        Cliente cliente = new Cliente();
        cliente.setCpf("234234");
        cliente.setNome("Clientasso");
        
        ContaSalario cSalario = new ContaSalario();
        cSalario.deposita(10);
        cSalario.setCliente(cliente);
        
        ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.setCliente(cliente);
        cCorrente.deposita(30);
        
        ContaPoupanca cPoupanca = new ContaPoupanca();
        cPoupanca.setCliente(cliente);
        cPoupanca.deposita(23);
        
        Gerente gerente = new Gerente();
        gerente.setNome("Patrão");
        
        Agencia agencia = new Agencia();
        agencia.setGerente(gerente);
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ehentao");
        funcionario.setGerente(gerente);
        
        Seguranca seguranca = new Seguranca();
        seguranca.setNome("Boladão");
        seguranca.setTurno(0);
        
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.setAgencia(agencia);
        
        Saque saque = new Saque();
        saque.setValor(23);
        saque.setAgencia(agencia);
        
        Deposito deposito = new Deposito();
        deposito.setValor(34);
        deposito.setAgencia(agencia);
        
        Transferencia transferencia = new Transferencia();
        transferencia.setValor(54);
        transferencia.setAgencia(agencia);
        
        System.out.println(usuario);
        System.out.println(cliente);
        System.out.println(cSalario);
        System.out.println(cCorrente);
        System.out.println(cPoupanca);
        System.out.println(agencia);
        System.out.println(caixaEletronico);
        System.out.println(saque);
        System.out.println(deposito);
        System.out.println(transferencia);
        System.out.println(gerente);
        System.out.println(funcionario);
        System.out.println(seguranca);
        
        
    }
}
