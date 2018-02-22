
Faça um programa para gerenciar um cadastro de um consultório médico. Seu programa deverá ter uma estrutura que armazene, para cada cliente, as seguintes informações:

* Nome;

* Sexo;

* Data de nascimento;

* Idade;

* Doenças importantes;

Seu programa deve gerenciar estas informações através das seguintes opções do menu:


##### 1. CADASTRAR CLIENTE: 

Seu programa deverá ter uma função responsável pelo cadastro

de clientes. A cada seleção desta opção seu programa deverá cadastrar um novo cliente,

cuidando para não exceder o tamanho de sua estrutura. Esta função deverá receber as

informações de cada cliente do usuário, com exceção da idade, que deverá ser calculada

dentro da função.


##### 2. BUSCAR CLIENTE: 

Esta opção do menu deve chamar uma função que consulta se um

determinado nome, informado pelo usuário, consta no cadastro. Se o nome não for

encontrado, uma mensagem deve ser repassada ao usuário, caso o cliente seja encontrado,

deve ser informado o nome, sexo e idade deste paciente.


##### 3. LISTAR CLIENTES: 

O programa deverá apresentar TODAS as informações dos clientes

cadastrados, através de uma função. Não deverão ser apresentadas informações vazias.


##### 4. EXCLUIR CLIENTE: 

Esta opção deverá chamar uma função responsável por excluir um

cliente, cujo nome foi informado pelo usuário. Caso o nome do cliente não seja encontrado,

uma mensagem deverá ser informada.


Para desenvolver seu programa você deve seguir as orientações abaixo:

* **Não devem ser utilizadas variáveis globais.**

* **Todas as informações necessárias pelas funções devem ser passadas como parâmetro.**

* **usuário deverá poder utilizar seu programa, solicitando as opções tantas vezes quanto ele deseje e em qualquer ordem.**

* **Limite o número de cadastro de pacientes a 10. Após ocupados os 10 espaços para cadastro, seu programa não deve aceitar novas inserções, a menos que algum cadastro seja excluído.**
