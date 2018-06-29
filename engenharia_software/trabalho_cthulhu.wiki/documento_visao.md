# Documento de Visão  

### Histórico da Revisão
Data|Versão|Descrição|Autor
-----|------|---------|-------
|17/04|1.1| teste close git |NikolasDaroit
|23/04|1.2| Alteração do requisito 6| FilipeColares
|24/04|1.1| alteração segundo feedback |NikolasDaroit
  
## 1. Objetivo  
_O propósito deste documento é coletar, analisar e definir as necessidades de alto-nível e características do sistema, focando nas potencialidades requeridas pelos afetados e usuários-alvo, e como estes requisitos foram abordados no sistema.
A visão do sistema documenta o ambiente geral de processos desenvolvidos para o sistema, fornecendo a todos os envolvidos uma descrição compreensível deste e suas macro-funcionalidades.
O Documento de Visão documenta as necessidades e funcionalidades do sistema_


## 2. Descrição do Problema

O problema de|**Inconsistência entre produtos em estoque e produtos na frente de caixa** 
-------------|-------------------------------------
afeta|**Empresa e Cliente**  
cujo impacto é|**A falta de confiabilidade da parte do cliente para com a empresa.** 
uma boa solução seria|**Ter um estoque mínimo, e reposição automática quanto atingir estes níveis.**


## 3. Definição das Partes Interessadas  

### Cliente  

Nome|Descrição|Responsabilidades
-----|------|---------
_Gerente_ |_Encarregado pela manutenção de produto e fornecedores_|_Manutenção de produtos e fornecedores e visualiza relatórios. Encarregado pela homologação da integração com fornecedores. Contratante._ 
_Estoquista_ |_Encarregado pela manutenção física do estoque_|_Organização e retirada de produtos do estoque. Encarregado pela homologação do controle de estoque._ 
_Vendedor_ |_Encarregado pela venda dos produtos_|_Faz a frente de caixa, em contato com clientes. Gera pedidos e emissão de notas. Encarregado pela homologação do caixa e das vendas_ 

### Time de Desenvolvimento
Nome|Descrição|Responsabilidades
-----|------|---------
_Felipe Colares_| _Desenvolvedor de Software_| _Participa do time de desenvolvimento, desenvolvendo as necessidades especificadas no product backlog._
 _Guilherme Rodrigues_ | _Gerente de Marketing_ | _Mantém a marca em destaque, por meio da divulgação de mail marketing e mídias sociais._
_Leonardo Iglesias_ | _Desenvolvedor de Software_ | _Participa do time de desenvolvimento, desenvolvendo as necessidades especificadas no product backlog._
_Nikolas Daroit_ | _Gerente de Vendas_  | _Contato comercial, prospecção e venda do sistema à possíveis clientes_.
_Victor Zeferino_ |  _Suporte Técnica_ | _Auxilia usuários que possuam dúvidas quanto à utilização do sistema, abre chamados ao time de desenvolvimento._

## 4. Descrição do Produto  

Para| **Empresa contrantante**  
----|------  
Que | **Deseja melhor controle sobre seu estoque**   
O   | **Cthulhu**   
É um| **sistema de controle de estoque**   
Que | **Facilita e integração de estoque diretamente com o fornecedor.**   
Ao contrário| **[ContaAzul](https://contaazul.com/) que oferece integração com ERP**   
Nosso produto| **Fornece inteligencia preditiva de estoque, prevendo variações de mercado e evitando assim produtos encalhados em estoque, enquanto mantém uma alta disponibilidade.**   

## 5. Necessidades e Funcionalidades do Produto  
### 1. Vendendor precisa realizar a venda de um ou mais produtos

 - **Benefício**: Crítico.

 - **Funcionalidades**:  
    1. Adicionar itens ao pedido/Caixa 1.1
      - Atores Envolvidos: Vendedor
    2. Fechar pedido/Caixa 1.2
      - Atores Envolvidos: Vendedor
    3. Emitir nota/Caixa 1.3
      - Atores Envolvidos: Vendedor
    4. Ver clientes/Clientes 1.4
      - Atores Envolvidos: Vendedor
    5. Cadastrar clientes/Clientes 1.5
      - Atores Envolvidos: Vendedor
    6. Ver produtos em estoque/Produtos 1.6
      - Atores Envolvidos: Vendedor
    7. Ver pedidos (vendas realizadas)/Vendas
      - Atores Envolvidos: Vendedor
    8. Ver detalhes do pedido(venda realizada)/Vendas 1.8
      - Atores Envolvidos: Vendedor

### 2. Estoquista precisa verificar produtos em estoque

 - **Benefício**: Crítico.

 - **Funcionalidades**:  
    1.  Visualizar produtos em estoque/Produtos 2.1
      - Atores Envolvidos: Estoquista

### 3. Gerente precisa controlar usuários do sistema

 - **Benefício**: Crítico.

 - **Funcionalidades**:  
    1.  Visualizar usuários/Usuários 3.1
      - Atores Envolvidos: Gerente
    2.  Cadastrar usuários/Usuários 3.2
      - Atores Envolvidos: Gerente

### 4. Gerente precisa controlar fornecedores do sistema

 - **Benefício**: Crítico.

 - **Funcionalidades**:  
    1.  Visualizar fornecedores/Fornecedores 4.1
      - Atores Envolvidos: Gerente
    2.  Cadastrar Fornecedores/Fornecedores 4.2
      - Atores Envolvidos: Gerente

### 5. Gerente precisa ver relatórios do sistema

 - **Benefício**: Importante.

 - **Funcionalidades**:  
    1.  Visualizar relatórios/Relatórios 5.1
      - Atores Envolvidos: Gerente
    2. Ver pedidos (vendas realizadas)/Vendas 5.2
      - Atores Envolvidos: Gerente
    3. Ver produtos em estoque/Produtos 5.3
      - Atores Envolvidos: Gerente
    4. Ver detalhes do pedido(venda realizada)/Vendas 5.4
      - Atores Envolvidos: Gerente

### 6. Gerente precisa ver cadastrar novos produtos

 - **Benefício**: Crítico.

 - **Funcionalidades**:  
    1.  Cadastrar produto/Produtos 6.1
      - Atores Envolvidos: Gerente
    
## 6. Proposta de Solução Tecnológica Escolhida  

O sistema será web desenvolvido em Python que utilizará o banco em nuvem AWS com capacidade de armazenamento de 1TB de dados, para uma maior segurança de informações. 
Por ser um sistema web, poderá ser acessado independente do sistema operacional, dependendo apenas de conexão à internet e de um navegador (Firefox, Chrome ou Safari).

## 7. Restrições  

Restrições funcionais
  - O sistema não poderá exibir dados específicos para perfis de acessos distintos, pois o administrador ficará responsável por determinadas funções que os demais não possuem.
  - Somente o administrador poderá realizar o cadastro e exclusão de perfis.
  - Quando dados forem deletados do sistema, os usuários não poderão ter mais acesso ao mesmo.
  - Tanto o administrador quanto o estoquista podem realizar o cadastro de produtos.


Restrições tecnológicas
  - O sistema poderá ser acessado apenas nos navegadores Mozila Firefox, a partir da versão 5.3, e Google Chrome, a partir da versão 40



