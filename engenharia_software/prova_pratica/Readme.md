Você deverá modelar um sistema que apoie pessoas a gerenciar suas finanças. 
* Para tanto, um usuário poderá gerenciar rendas, que podem ser especificamente receitas ou despesas. 
* Com relação a este gerenciamento de rendas, o usuário poderá adicionar dinheiro (gerenciar receita) ou retirar dinheiro (gerenciar despesa) de sua conta e ambas compartilham um comportamento comum para gerir essas rendas. 
* Sempre que um usuário registrar uma despesa que faz seu saldo entrar no negativo, o sistema deve enviar um email notificando. 
* O usuário poderá também visualizar um painel com sua saúde financeira atual (relação entre despesas e receitas do mês corrente) e navegar pelos meses anteriores. 
* Da parte administrativa do usuário, o mesmo poderá gerenciar sua conta e suas finanças externas, que podem ser contas bancárias e/ou cartões de crédito. 
* Com relação a sua conta, toda vez que um usuário cria uma, que é o objetivo principal dessa funcionalidade, o sistema deve mandar um email de confirmação de dados. 

# O principal objetivo deste sistema é gerenciar a renda de usuários. 

* Ao criar uma conta, a renda fica ativa, mas pode ficar inativa quando o usuário resolve suspende-la. 
* Ao reativar uma conta que possui renda inativa, o usuário mantém a sua renda prévia. 
* Sempre quando uma renda se torna inativa ou deixa de ser inativa, um email é enviado ao usuário com a situação. 
* Caso o usuário resolva cancelar a conta, então a renda é excluída. 
* Quando uma conta se torna ativa pela primeira vez, seu saldo é Zero (saldo=0) e ela fica classificada como positiva. 
* Neste sistema, uma renda ativa e positiva é aquela que possui saldo maior ou igual a Zero, caso contrário a renda é considerada negativa. 
* Para manter o saldo em uma conta ativa, sempre que se registra uma despesa, através da operação 'despesa(x)', ou receita, pela operação 'receita(x)', ocorre uma ação de atualizar o saldo com o valor 'x' da transação. 
* Sempre que atualizar um saldo e ele ficar menor que Zero, a renda é dita negativa, caso contrário, ela é positiva. 
* Sempre que ocorrer uma transação que deixar o saldo menor que Zero, um email é enviado ao usuário. 
* Um uso típico deste sistema é o registro de despesa. Digamos que o usuário almoçou e resolve registrar seu gasto. 

### Gerenciar Despesa

* Para isso, ele primeiro abre o aplicativo, que apresenta sua tela inicial com a saúde financeira do usuário. 
* Para montar o painel com a saúde financeira, primeiro o sistema recupera ao mesmo tempo os registros das despesas e das receitas do usuário e depois apresenta o painel. 
* Após apresentar o painel, o sistema apresenta a opção de registrar nova despesa ou receita. 
* Neste caso o usuário irá solicitar adicionar uma despesa (que retira da renda o valor gasto no seu almoço). 
* O sistema então solicita o valor gasto, que é informado pelo usuário. 
* Após, o sistema solicita ao usuário selecionar uma categoria (alimentação, vestuário, transporte, lazer, educação, saúde, etc.). 
* Após a seleção da categoria pelo usuário, como no caso alimentação, o sistema registra a despesa na data corrente. 
* Neste momento, o sistema busca informação da renda do usuário e realiza uma validação se o usuário não gastou mais do que tem e, caso saldo tenha se tornado negativo, envia um email notificando (com mensagem específica). 
* Ao final, o sistema apresenta a confirmação do registro da despesa e encerra este processo. 

# Gerenciar Receita

* Caso o usuário tenha recebido algum dinheiro e queira registrar, quando o sistema apresenta a opção de adicionar despesa ou receita, o usuário seleciona receita. 
* Neste momento, o sistema apresenta em uma única tela a solicitação de valor e descrição. 
* Após o usuário informar o valor e descrição, o sistema salva a nova receita e notifica o usuário.

# (1.5 ponto) 1. Complete as lacunas da descrição do problema do Documento de Visão: 

Para *qualquer pessoa*

Que	*deseja ter controle de sua renda*

O *Carteira Saudável*

É um *aplicativo para dispositivos móveis*

Que *gerencia a renda dos usuários*

Ao contrário *do Minhas Finanças(Banco do Brasil), sistema onde é possível ver e categorizar os lançamentos*

Nosso produto *permite gerenciar contas externas e cartões de crédito*

**Feedback do professor Rodrigo Noll (DV)** |
--- |
DV (1.5/1.5): |

# (1 ponto) 2. Especificação dos requisitos não funcionais referentes ao acrônimo UCPS. Inclua o que significa cada letra e o requisito especificamente para o sistema em questão. 

## Usabilidade  
	* O usuário poderá regular o tamanho da fonte.

## Confiabilidade  
	* Os dados sensíveis (referentes a contas e cartões) devem ser criptografados.

## Performance  
	* O tempo de resposta ao realizar uma transação (respesa, receita) deve ser inferior a 3s.

## Suportabilidade  
	* O sistema deverá rodar em dispositivos Android a partir da versao 4.


**Feedback do professor Rodrigo Noll (Req.N.Func)** |
--- |
RNF (0.8/1.0): |
 Usabilidade: |
 Confiabilidade: |
 Performance: |
 Suportabilidade: não diz respeito a plataforma, mas como o software será mantido |
 
# (1.5 pontos) 4. Especificação de caso de uso do caso de uso Gerenciar Despesa
	* 1 fluxo alternativo com no mínimo 3 passos
	* 	1 fluxo de exceção com no mínimo 3 passos
	* 	3 Regras de Negócio e 2 mensagens, todas significativas

CdU001 - Especificação do Caso de Uso
Resumo: O usuário registra uma despesa
Tipo: Concreto
Atores: usuário

Fluxo Principal de Eventos:  
P01. O usuário abre o aplicativo.  
P02. O sistema apresenta a tela inicial com a saúde financeira do usuário.  
P03. O usuário solicita adicionar uma despesa.  
P04. O sistema solicita o valor gasto.  
P05. O usuário informa o valor.  
P06. O sistema solicita a categoria.  
P07. O usuário seleciona uma categoria.  
P08. O sistema registra a despesa na data corrente.  
P09. O sistema busca informação da renda do usuário.  
P10. O sistema realiza uma validação na saúde do usuário.(RN01, MSG01)  
P11. O sistema apresenta a confirmação do registro da despesa.  
P12. O caso de uso se encerra.  

Fluxos Alternativos:  
A1 Usuário adiciona renda  
A1.1. No passo P03 do fluxo principal, o usuário solicita adicionar uma renda.  
A1.2. O sistema solicita o valor da renda e a descrição.(RN02)  
A1.4. O usuario informa preenche os campos.  
A1.5. O sistema registra a renda na data corrente.  
A1.6. O sistema apresenta a confirmação do registro da renda.(MSG02)  
A1.7. O caso de uso se encerra.  

Fluxos de Exceção:  
E1 Usuário não encontra categoria  
E1.1. No passo P06 do fluxo principal, o usuário não encontra a categoria desejada.  
E1.2. O usuário seleciona 'cadastrar nova categoria'.  
E1.3. O sistema solicita o nome da categoria.(RN03)  
E1.4. O usuário informa o nome da categoria.  
E1.5. O sistema retorna para o passo P06 do fluxo principal.  

Regras de Negócio:
RN01: Se o saldo do usuário se tornou negativo, então envia email notificando com a mensagem MSG01.  
RN02: Se o usuário deixar o campo de descrição em branco, então a descrição será 'outros'.  
RN03: Se o usuário cadastrar uma categoria com o nome já existente, então o sistema deverá selecionar aquela categoria ao invés de criar outra.  

Mensagens do Sistema:
MSG01: Caro usuário, seu saldo se tornou negativo, atualmente você possui um limite de R$X,Y em sua conta.  
MSG02: Renda cadastrada com sucesso, atualmente você possui R$X,Y em sua conta.  


**Feedback do professor Rodrigo Noll (Esp.CdU)** |
--- |
Esp.CdU: Gerenciar Despesa (1.2/1.5): |
1 fluxo alternativo com no mínimo 3 passos: o caso de uso é de despesa e não renda |
1 fluxo de exceção com no mínimo 3 passos: |
3 Regras de Negócio e 2 mensagens, todas significativas: |

#### Feedback dos diagramas

**Feedback do professor Rodrigo Noll (Diag.CdU)** |
--- |
Diag.CdU (1.8/2.0): gerenciar e criar conta deveriam ser o mesmo cdu |
1 caso e uso abstrato por dependência: ok |
2 generalizações de caso de uso: ok |
1 extensão, com os respectivos estereótipos e notações: ok |
1 inclusão: ok |

**Feedback do professor Rodrigo Noll (Diag.Ativ)** |
--- |
Diagrama de Atividades: Gerenciar Renda (1.8/2.0): ao selecionar renda, vc incrementa o saldo (e teoricamente não pode ser negativo) |
Call Behavior Action (com implementação): ok |
Datastore: não é objeto |
Parâmetro de atividade: não |
Conectores: ok, mas não usado corretamente (envio de sinal é assinc) |
Decisão e União (com estereótipos): ok |
Nodo de Objeto : ok |
Envio de Sinal: é assíncrono |
Pino de Entrada: ok |
Pino de Saída: ok |
Partições: ok |

**Feedback do professor Rodrigo Noll (Diag.MaqEst)** |
--- |
Diag.Estados: Renda:(1.5/2.0): negativa poderia virar positiva |
4 estados: ok |
1 estado composto: ok |
1 atividade com ENTRY/EXIT: ok |
2 transições internas parciais (2 das 3 partes): ok |
1 nodo terminal: não |
1 transição externa completa (3 partes): não |
1 história profunda ou rasa, com nota apontando e explicando o motivo: não aponta para início |
2 eventos de chamada, com nota apontando e explicando o motivo: ok |
