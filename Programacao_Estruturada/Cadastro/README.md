Exerc�cio de revis�o dos conte�dos j� abordados na disciplina de Programa��o Estruturada e que ser�o necess�rios para o bom acompanhamento da disciplina de Estruturas de Dados. Realize a atividade seguindo as orienta��es e verifique suas d�vidas:

Fa�a um programa para gerenciar um cadastro de um consult�rio m�dico. Seu programa dever� ter uma estrutura que armazene, para cada cliente, as seguintes informa��es:

? Nome;

? Sexo;

? Data de nascimento;

? Idade;

? Doen�as importantes;

Seu programa deve gerenciar estas informa��es atrav�s das seguintes op��es do menu:

1. CADASTRAR CLIENTE: Seu programa dever� ter uma fun��o respons�vel pelo cadastro

de clientes. A cada sele��o desta op��o seu programa dever� cadastrar um novo cliente,

cuidando para n�o exceder o tamanho de sua estrutura. Esta fun��o dever� receber as

informa��es de cada cliente do usu�rio, com exce��o da idade, que dever� ser calculada

dentro da fun��o.

2. BUSCAR CLIENTE: Esta op��o do menu deve chamar uma fun��o que consulta se um

determinado nome, informado pelo usu�rio, consta no cadastro. Se o nome n�o for

encontrado, uma mensagem deve ser repassada ao usu�rio, caso o cliente seja encontrado,

deve ser informado o nome, sexo e idade deste paciente.

3. LISTAR CLIENTES: O programa dever� apresentar TODAS as informa��es dos clientes

cadastrados, atrav�s de uma fun��o. N�o dever�o ser apresentadas informa��es vazias.

4. EXCLUIR CLIENTE: Esta op��o dever� chamar uma fun��o respons�vel por excluir um

cliente, cujo nome foi informado pelo usu�rio. Caso o nome do cliente n�o seja encontrado,

uma mensagem dever� ser informada.

Para desenvolver seu programa voc� deve seguir as orienta��es abaixo:

? N�o devem ser utilizadas vari�veis globais.

? Todas as informa��es necess�rias pelas fun��es devem ser passadas como par�metro.

? O usu�rio dever� poder utilizar seu programa, solicitando as op��es tantas vezes quanto ele deseje e em qualquer ordem.

? Limite o n�mero de cadastro de pacientes a 10. Ap�s ocupados os 10 espa�os para cadastro, seu programa n�o deve aceitar novas inser��es, a menos que algum cadastro seja exclu�do.