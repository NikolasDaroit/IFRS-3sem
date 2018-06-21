# Definição do Sistema:   
  
Muitas atividades administrativas de uma instituição de ensino são processadas via sistema de informação, como os trabalhos de conclusão de curso.   
No último ano do curso, alunos devem se cadastrar em um sistema para poder cadastrar uma proposta de TCC.   
Antes de um aluno poder cadastrar sua proposta de TCC, o coordenador do curso deve definir um cronograma de execução do TCC a ser seguido por todos, que inclui as datas de definição de proposta, do seminário de andamento e da defesa final do trabalho.   
Encerrado o período de inscrição dos trabalhos, o coordenador do curso, que também pode orientar trabalhos, define as bancas que avaliarão cada trabalho.   
Quando o aluno cadastra sua proposta de TCC, ele deve obrigatoriamente indicar um orientador, sendo que este orientador deve explicitamente aprovar ser orientador deste trabalho.   
Caso o orientador não aprove, a proposta de trabalho é descartada e o aluno deve submeter nova proposta.   
Sempre que um aluno cadastrar uma proposta de TCC ou uma banca for definida, o sistema irá notificar todos os envolvidos (professores e alunos).   
Quando o coordenador alterar o cronograma do TCC, esta notificação acontecerá opcionalmente para os usuários que assim solicitarem.   
O trabalho de conclusão de curso consiste basicamente no aluno Entregar Trabalhos, sempre no formato PDF, que tem que ser um primeiramente um seminário de andamento e depois uma monografia final.   
Para entregar o seminário, o aluno deve obrigatoriamente realizar três ações para apresentar a banca:   
(1) uma pesquisa bibliográfica para a fundamentação teórica,   
(2) um teste de viabilidade do seu projeto, que inclui algum experimento técnico e   
(3) uma análise de mercado (que é opcional conforme decisão do orientador, mas deve ser uma ação prevista e discutida no artigo).  
Quando as 3 ações estiverem concluídas, daí ele poderá começar a elaboração de um artigo de 4 páginas que sintetizará seu trabalho.  
Após elaborar este artigo, o aluno deve submete-lo no sistema.   
Após a submissão, será realizada uma apresentação, na qual a banca irá avaliar o trabalho e emitir um parecer para o orientador cadastrar no sistema.   
Se for reprovado no seminário de andamento, o aluno deve refazer o artigo até ser aprovado.   
Se aprovado, o aluno deve terminar de construir sua solução, escrever e submeter a monografia sua dentro do prazo estipulado.   
Após submetido o trabalho, o aluno deverá apresentar para a banca.   
A banca tem até 48h para passar um parecer final do trabalho como aprovado ou não para que o orientador possa submeter no sistema, bem como suas recomendações (semelhante ao processo de avaliação do seminário de andamento).   
Se o aluno tira abaixo de 6 é reprovado, caso contrário, é aprovado.  
Frente a isso, elabore os itens solicitados abaixo e submeta um documento .astah com os diagramas e os textos na resposta desta questão.  
  
  
  
## Descreva o produto acima conforme o Documento de visão.  
  
  
  
 Para **Institução de Ensino  
  
 Que **deseja maior controle sobre o processo de TCC  
  
 O **TCC-Tron  
  
 É UM **sistema de gerência de trabalhos  
  
 Que **gerencia o processo burocrático de TCCs  
  
 Ao contrário **Moodle, sistema de entrega de trabalhos e realização de tarefas  
  
 Nosso produto **permite o agendamento completo de toda a rotina de TCC, validando e decidindo se é possível seguir para o próximo passo  
  
  
  
## Especificação de 4 Requisitos Não Funcionais  
  
O sistema deve ser responsivo.  
Deve ser possível personalizar a cor do sistema para as cores da instituição.  
As notificações deverão emitir som.  
O sistema não deve consumir mais que 100Mb de processamento.  
  
  
## Diagrama de Casos de Uso com todos estereótipos relacionados:   
  
  
  
1 caso de uso abstrato  
  
1 generalização de ator  
  
1 generalização de caso de uso  
  
1 extensão  
  
2 inclusões  
  
  
  
## Especificação de caso de uso de cadastrar uma proposta de TCC  
  
 CdU001 - Especificação do Caso de Uso  
  
Resumo:   Aluno cadastra uma proposta de tcc, o orientador decide ou não aprovar
  
Tipo:   Concreto
  
Atores: (Aluno), (Orientador)  
  

  
### Fluxo Principal de Eventos:  
  
P1. O aluno se cadastra no sistema
  
P2. O sistema verifica se o coordenador já definiu o cronograma de execução do TCC
  
P3. O aluno cadastra a proposta de TCC
  
P4. O aluno indica um orientador
  
P5. O orientador aprova orientar este trabalho

P6. O sistema notifica o aluno e o orientador

P7. O caso de uso se encerra
  

### Fluxos Alternativos:  
 
  
A1 Cronograma não definido
  
A1.1. No passo 2 do fluxo principal, o coordenador não definiu o cronograma de execução.  
    
A1.2. O sistema informa ao aluno que ainda não é possível cadastrar uma proposta de TCC.  

A1.3. O caso de uso de encerra.
 

A2 A proposta de TCC não é aprovada
  
A2.1. No passo 5 do fluxo principal, o orientador não aprova a proposta de TCC.
  
A3.2. O sistema então descarta a proposta de TCC.  
  
A4.3. O sistema permite que o aluno cadastre uma nova proposta de TCC.  

A5.4. O caso de uso retorna para o passo 5 do fluxo principal.
  
  
  
## Diagrama de Atividades de todo o processo de submissão e aprovação do TCC, desde a proposta até a aprovação na disciplina, com todos estereótipos relacionados:   
  
Call Behavior Action,   
  
Guardas,   
  
Conectores,   
  
join e fork,   
  
Nodos de Objetos,   
  
Pino de Entrada,   
  
Pino de Saída,   
  
Partições  
  
  
  
  
  
## Diagrama de Máquina de Estado para os estados do TCC:   
  
  
  
1 atividade com DO/EXIT  
  
1 atividade com apenas ENTRY/EXIT  
  
1 transição interna  
  
2 transições externas completas (com os 3 componentes)  
  
evento all (com nota indicando/explicando)  
  
evento completion (com nota indicando/explicando)  
  
1 estado ortogonal com 2 regiões e paralelização/sincronização  
  
1 ponto de saída  
