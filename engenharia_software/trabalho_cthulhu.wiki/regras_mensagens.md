# Especificações de Regras de Negócio e Mensagens do Sistema 

## 1. Regras de Negócio
<sub>_Regras de negócio são declarações que definem ou restringem algum aspecto do negócio e que podem ser implementadas por um sistema computacional. Elas são definidas através de uma declaração independente que especifica a execução de uma ou mais ações quando determinada condição é satisfeita. Regras de negócio restringem o comportamento do sistema e fazem parte de um ou mais casos de uso._</sub>  

RGN001  

Venda não pode ser realizada caso não haja produto em estoque.

RNG002

Venda não pode ser realizada sem um cliente cadastrado.

RGN003

Toda venda deverá emitir uma nota fiscal.

RGN004 

Um cliente poderá possuir apenas um cadastro.

RGN005

Não poderá ser cadastrado produto que não conste no estoque.

RGN006

Todos os dados de um cadastro devem ser preenchidos corretamente.

RGN007

O cliente poderá realizar uma ou mais compras simultaneamente.

RGN008

Um alerta será emitido caso um produto necessite de reposição.

RGN009

O cliente poderá visualizar suas compras já efetuadas.

RGN010

Itens somente serão descontados do estoque após a confirmação da compra.

***

## 2. Mensagens do Sistema  
<sub>_Mensagens do sistema definem todos os diálogos apresentados na interface com o usuário e podem estar associados a uma ou mais regras de negócio ou casos de uso._</sub>  

MSG001  

Cliente inválido ou não cadastrado.

MSG002  

Produto inválido ou não cadastrado.

MSG003  

Confirmar cadastro?(Confirmar/Cancelar)

MSG004

Usuário já cadastrado.

MSG005

Produto ________ em falta no estoque. Requisitar reposição?(S/N)

MSG006

Dados incorretos: _________
