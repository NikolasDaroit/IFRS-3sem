# CdU001 - Especificação do Caso de Uso Gerenciar Vendas

**Resumo**: Cadastrar e consultar vendas no sistema  
**Tipo**: Concreto  
**Atores**:  
 - *Primário*: Vendedor.
 - *Secundário*: Cliente.

## Fluxo Principal de Eventos:  
P1. O vendedor seleciona a opção vendas.[[IV004](./prototipos##IV004)]  
P2. A aplicação mostra a lista de vendas já concretizadas.[[IV005](./prototipos##IV005)]     
P3. O vendedor seleciona a opção nova venda.[[IV006](./prototipos##IV006)]    
P4. O vendedor seleciona o cliente que está realizando a compra.  
P5. A aplicação mostra a tela com opções para incluir produtos.  
P6. O vendedor preenche os campos de cadastro.  
P7. O vendedor seleciona a opção incluir.  
P8. O vendedor seleciona a opção confirmar.[[MSG003](./regras_mensagens#MSG003)]  
P9. O vendedor é redirecionado para a lista de vendas.[[IV004](./prototipos##IV005)]     
P10. O caso de uso se encerra.  

## Fluxos Alternativos:  

<a name="a1"/>    

### A1. No passo 2 do fluxo principal o vendedor seleciona uma venda já concretizada.  
A1.1. O vendedor seleciona uma das vendas já concretizadas. [[P2](./CdU001–EspecificacaoDoCasoDeUso#P2)]  
A1.2. A aplicação mostra uma lista com os itens refentes ao pedido selecionado.[[IV007](./prototipos##IV007)]     
A1.3. O vendedor seleciona a opção voltar.  
A1.4. A aplicação retorna à tela anterior, com a lista de vendas concretizadas.[[IV005](./prototipos##IV005)]    
A1.5. O caso de uso se encerra.  

<a name="a2"/>

### A2. No passo 4 do fluxo principal o vendedor seleciona a opção para cadastrar um novo cliente.
A2.1. A aplicação mostra a tela de cadastro de cliente. [[P4](./CdU001–EspecificacaoDoCasoDeUso#P4)][[IV008](./prototipos##IV008)]    
A2.2. O vendedor preenche os campos de cadastro.[[MSG003](./regras_mensagens#MSG003)]  
A2.3. O vendedor seleciona a opção cadastrar e voltar ao caixa.  
A2.4. O vendedor seleciona a opção confirmar.  
A2.5. O vendedor é redirecionado para a lista de vendas.[[IV005](./prototipos#I#V005)]    
A2.6. O caso de uso se encerra.  

<a name="a3"/>

### A3. No passo 6 do fluxo principal o vendedor seleciona a opção para adicionar um produto a venda com estoque baixo.
A2.1. A aplicação mostra a tela de cadastro de produtos. [[P6](./CdU001–EspecificacaoDoCasoDeUso#P6)]  
A2.2. O vendedor preenche os campos de cadastro.[[MSG003](./regras_mensagens#MSG003)]  
A2.3. O vendedor seleciona a opção adicionar.  
A2.4. O sistema apresenta a mensagem de estoque baixo. [[MSG005](./regras_mensagens#MSG005)]  
A2.5. O vendedor é redirecionado para a lista de vendas.[[IV005](./prototipos#I#V005)]    
A2.6. O caso de uso se encerra.  

## Fluxos de Exceção:  

<a name="e1"/>

### E1. No passo 8 do fluxo principal o vendedor seleciona a opção confirmar sem ter um cliente selecionado.  
E1.1. O vendedor seleciona a opção confirmar sem ter um cliente selecionado. [[P8](./CdU001–EspecificacaoDoCasoDeUso#P8)]  
E1.2. O sistema notifica que é necessário incluir um cliente.  
E1.3. O vendedor seleciona um cliente.  
E1.4. O sistema retorna para o passo 8 do fluxo principal.  


<a name="e2"/>

### E2. No passo 8 do fluxo principal o ator seleciona a opção confirmar tendo preenchido algum dado inválido.  
E2.1. O vendedor seleciona a opção confirmar tendo preenchido algum dado inválido. [[P8](./CdU001–EspecificacaoDoCasoDeUso#P8)]  
E2.2. O sistema notifica qual campo que possui dados inválidos. [[MSG006](./regras_mensagens#MSG006)]  
E2.3. O vendedor corrige o dado inválido.  
E2.4. O sistema retorna para o passo 8 do fluxo principal.  