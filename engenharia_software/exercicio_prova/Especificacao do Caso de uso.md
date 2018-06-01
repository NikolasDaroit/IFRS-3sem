# CdU001 - Especificação do Caso de Uso: Comprar pacote de viagem

**Resumo**: Cliente compra um pacote de viagem   
**Tipo**: Concreto  
**Atores**:  
 - *Primário*: Cliente.
 - *Secundário*: Promotor de viagem.

## Fluxo Principal de Eventos:  
P1. O Cliente solicita um pacote de viagem informando o destino e o período da viagem (data de ida e de volta).  
P2. O sistema apresenta os hotéis e facilidades disponíveis para o destino e o período escolhido.[[RGN004](./Regras%20de%20negocio%20e%20mensagens.md#1-regras-de-negócio)]   
P3. O cliente seleciona os hotéis e as facilidades desejadas.[[RGN001](./Regras%20de%20negocio%20e%20mensagens.md#1-regras-de-negócio)]   
P4. O sistema apresenta o valor total do pacote.[[RGN005](./Regras%20de%20negocio%20e%20mensagens.md#1-regras-de-negócio)]   
  
P5. O sistema notifica o promotor de viagem por email.  
P6. O cliente aceita o valor.  
P7. O sistema apresenta os meios de pagamentos aceitos.  
P8. O cliente escolhe o meio de pagamento.  
P9. O cliente preenche os dados necessários para efetuar o pagamento e confirma a compra.[[MSG002](./Regras%20de%20negocio%20e%20mensagens.md#2-mensagens-do-sistema)]  
P10. O sistema gera um comprovante da solicitação de compra.[[RGN003](./Regras%20de%20negocio%20e%20mensagens.md#1-regras-de-negócio)]   
  
P11. O sistema envia um email de confirmação com o comprovante e outras informações de viagem.[[RGN002](./Regras%20de%20negocio%20e%20mensagens.md#1-regras-de-negócio)]     
P12. O caso de uso se encerra.  

## Fluxos Alternativos:  

<a name="a1"/>    

### A1. Selecionar mais de um destino.  
A1.1. No passo 1 do fluxo principal o cliente seleciona mais de um destino.  
A1.2. O sistema apresenta os hotéis e facilidades disponíveis para cada destino.  
A1.3. O cliente seleciona os hotéis e facilidades para cada destino.  
A1.4. O sistema retorna para o passo 4 do fluxo principal.  
A1.5. O caso de uso se encerra.  

## Fluxos de Exceção:  

<a name="e1"/>

### E1. Inserir dados de pagamento inválidos.  
E1.1  No passo 9 do fluxo principal o cliente não preenche corretamente os dados de pagamento.  
E1.1. O cliente confirma a compra com os dados de pagamento inválidos.   
E1.2. O sistema notifica que os dados inseridos pelo cliente são inválidos.[[MSG001](./Regras%20de%20negocio%20e%20mensagens.md#2-mensagens-do-sistema)]    
E1.3. O cliente altera os dados incorretos e confirma a compra.  
E1.4. O sistema retorna para o passo 10 do fluxo principal. 
