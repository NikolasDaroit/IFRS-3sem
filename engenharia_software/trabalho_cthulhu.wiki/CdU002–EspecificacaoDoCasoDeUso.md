# CdU001 - Especificação do Caso de Uso - Gerenciar Pessoal

**Resumo**: resumo do caso de uso.  
**Tipo**: Concreto
**Atores**:  
 - *Primário*: Gerente


## Fluxo Principal de Eventos:
P1. O usuário acessa a página como administrador.   
P2. A aplicação exibe o menu de opções.[[IV002](./prototipos#IV002)]  
P3. O usuário seleciona a opção desejada.  
P4. A aplicação vai para a tela de cadastro desejada.  
P5. O caso de uso se encerra.  

## Fluxos Alternativos:  

<a name="a1"/>    

### A1 No passo três do fluxo principal da aplicação, o usuário clica na opção "Cadastrar Usuário"   
A1.1. A aplicação exibe o formulário de cadastro do usuário. [[IV011](./prototipos#IV011)]  
A1.2. O usuário preenche os dados do usuário.  
A1.3. O usuário clica em "Cadastrar".  
A1.4. A aplicação vai para a tela de consulta de usuários. [[IV010](./prototipos#IV010)]  
A1.5. O caso de uso se encerra.  


### A2 No passo três do fluxo principal da aplicação, o usuário clica na opção "Cadastrar Fornecedor"  
A2.1. A aplicação exibe o formulário de cadastro do fornecedor. [[IV013](./prototipos#IV013)]
A2.2. O usuário preenche os dados do fornecedor.  
A2.3. O usuário clica no botão "Cadastrar".  
A2.4. A aplicação vai para a tela de consulta de fornecedores. [[IV012](./prototipos#IV012)]  
A2.5. O caso de uso se encerra.  

### A3 Clicar na opção "Cancelar" nas telas de cadastro 
A3.1. O usuário realiza o fluxo alternativo A1 até o passo três (A1.3).  
A3.2. O usuário clica no botão "Cancelar".  
A3.3. A aplicação retorna para a tela de consulta.  
A3.4. O fluxo alternativo se encerra.  

### A4 Clicar na opção "Cancelar" do cadastro de fornecedor  
A4.1. O usuário realiza o fluxo alternativo A2 até o passo três (A2.3).  
A4.2. O usuário clica no botão "Cancelar".  
A4.3. A aplicação executa o passo cinco do fluxo alternativo A1 (A2.5).  
A4.4. O fluxo alternativo se encerra.  
 

## Fluxos de Exceção:  

<a name="e1"/>

### E1. Inserir dois ou mais cadastros iguais    
E1.1. O usuário realiza um cadastro com dados já existente no sistema.  
E1.2. O usuário clica na opção "Cadastrar".  
E1.3. A aplicação o notifica que o usuário já foi cadastrado.  
E1.4. A aplicação mantém os dados inseridos nos campos do formulário.  
E1.5. O usuário clica na opção "Cancelar".  
E1.6. A aplicação vai para a tela de consulta de cadastro.  
 

### E2. Dados insuficientes para o cadastro  
E2.1. O usuário preenche o formulário de cadastro e deixa um ou mais dados em branco.  
E2.2. O usuário clica no botão "Cadastrar".  
E2.3. A aplicação contorna os campos de vermelho sinalizando a falta de informações.  
E2.4. O usuário preenche o campo em branco.  
E2.5. O usuário clica no botão "Cadastrar".  
E2.6. A aplicação retorna para o passo cinco (P5) do fluxo principal.  