# Plano de Teste  
  
## 1. Objetivo  
Este plano de teste suporta as atividades de teste para o desenvolvimento do presente sistema de informação e possui os seguintes objetivos:

- Definir as ferramentas que serão utilizadas ao longo do processo. 
- Comunicar as partes interessadas sobre os itens a serem testados, alinhar expectativas em torno do prazo e definir as necessidades de infraestrutura. 
- Definir como os testes serão conduzidos.

O produto final deve incluir:
* Um software disponível para o ambiente de produção
* Um conjunto estável de scripts de teste que podem ser usados também para o Teste de Aceitação do Usuário. 


## 2. Itens a serem testados

O sistema a ser testado inclui uma aplicação para **gestão de trabalhos acadêmicos de conclusão de curso**. 
O sistema deve ser testado no **Chrome 65** e **FireFox 59**. 

O sistema deve ser testado em ambientes Windows, Linux e Mac.


## 3. Funcionalidades a serem testadas

* [Eu como usuário gostaria de me autenticar no sistema para que possa gerenciar meu TCC](./CdT001-NOME-FUNCIONALIDADE). 
* Eu como Aluno gostaria de definir um tema e escolher um orientador para desenvolver meu TCC. O orientador deve aprovar. 
* Eu como Usuário gostaria de gerenciar alertas e mensagens recebidas pelo sistema. 
* Eu como Usuário gostaria de visualizar painel com as principais atividades e marcos do TCC. 
* Eu como Professor gostaria de Avaliar Trabalhos para que os alunos tenham nota para proposta e monografia. 
* Eu como Aluno gostaria de gerenciar minha monografia conversando com o orientador para que possa concluir meu TCC. 
* Eu como Professor gostaria de Definir as Banca para que os TCCs sejam avaliados. 
* Eu como Professor gostaria de manter o meu perfil com informações sobre área de atuação para que os alunos possam me conhecer. 
 
 
## 4. Funcionalidades que não serão testadas
<sub> _Definir quais funcionalidades não pertencem ao escopo deste plano:_ </sub>


## 5. Técnicas e Níveis de Teste

Testes funcionais serão conduzidos pelos casos de teste especificados na Wiki do projeto. Os testadores irão planejar os casos de teste, implementar e executar os testes. Testes estruturais serão implementados com base nos métodos implementados nas classes do projeto, obtendo uma cobertura de 100%, com pelo menos 2 casos de teste por método implementado.

### Testes Funcionais

Testes funcionais serão aplicados para verificar as funcionalidades da aplicação. Eles são conduzidos entrando dados no sistema e avaliando sua resposta.

Os testes funcionais devem ser implementados utilizando Selenium WebDriver, FluentLenium, JUnit 4.x, AssertJ. Deve-se utilizar o padrão **Page Object Model** para separação de responsabilidades.

Os casos de testes funcionais devem ser especificados textualmente usando o padrão de Funcionalidades e Cenários através da representação **Given-When-Then**. A ideia essencial é quebrar a funcionalidade em cenários (ou critérios) de teste em três seções:
* **Given** (Dado) é a parte que descreve o estado do mundo antes de você começar o comportamento esperado pelo cenário (é uma precondição para o teste)
* **When** (Quando) é o comportamento que você está esperando/especificando
* **Then** (Então) é quando você descreve as mudanças esperadas pelo comportamento anterior.

A estrutura dos casos de teste funcionais será a seguinte:

```gherkin
Funcionalidade: Algum texto descritivo conciso do que é desejado 
   A fim de realizar um valor de negócio 
   Como ator explicito do sistema 
   Eu quero ganhar algum resultado benéfico que promova a meta 
  
Texto adicional... 
 
 Cenário: Uma determinada situação de negócio 
   Dado uma pré condição  
     E uma outra pré condição 
   Quando uma ação é feita pelo ator 
     E uma outra ação 
     E outra ação diferente 
   Então um resultado testável é alcançado 
     E outra coisa que possamos verificar também acontece 
 
 Cenário: Uma situação diferente 
   ... 
```
Segue um exemplo de caso de teste funcional: 

```gherkin
Cenário: Consumidor devolve um produto defeituoso 
 
Dado que o Consumidor tenha comprado um produto por R$ 100,00 
E tenha a nota fiscal de compra 
Quando ele devolver o produto 
Então Ele deve ser ressarcido em R$ 100,00 
```

### Testes Estruturais

Serão implementados testes unitários estruturais com cobertura de 100%, com pelo menos dois casos de teste por métodos implementados, nas seguintes categorias:
 * Repository: DataJpaTest
 * Service:
 * Controller: WebMvcTest e Mocks
 * Utilitárias

Todos os testes estruturais devem ser implementados utilizando as tecnologias acima descritas, além de JUnit 4.x e AssertJ. 

Todos os casos de teste estruturais devem ser implementados com o padrão GIVEN-WHEN-THEN.


## 6. Tarefas de Teste

As seguintes tarefas devem ser completadas:
* Preparação do plano de teste
* Especificações funcionais formalizadas pela equipe
* Organização do ambiente (dados de teste, login, etc.)
* Execução dos casos de teste
