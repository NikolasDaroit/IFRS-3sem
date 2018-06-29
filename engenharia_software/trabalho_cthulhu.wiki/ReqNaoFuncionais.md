# Requisitos Não Funcionais

### Histórico da Revisão
Data|Versão|Descrição|Autor
-----|------|---------|-------
|18/04|1.0|Alteração do item Documentação|Leonardo Iglesias
|23/04|1.1|Alteração do item Documentação|Guilherme Rodrigues
|24/04|1.2|Alteração de layout| Níkolas Daroit
|24/04|1.3|Alteração em requisitos do sistema| Filipe Colares

# Requisitos Não Funcionais

## Usabilidade 
* RNF001. O software será desenvolvido seguindo padrões de design limpo, ou seja, preservando os espaços em branco e a objetividade dos elementos distribuídos na tela. 
* RNF002. O sistema deverá utilizar design responsivo na implementação de suas telas, comportando-se de maneira adequada em navegadores acessados por smartphone, computador ou tablet.

## Confiabilidade
* RNF002. Os dados sensíveis serão criptografados utilizando a biblioteca bcrypt.
* RNF003. O servidor será escalável, ou seja, caso sua utilização exceda 80% de sua capacidade, uma nova instância será iniciada, e a carga será dividida entre elas. 
* RNF004. O banco de dados contará com uma instância master e uma slave, para fins de redundância.
* RNF005. Apenas usuários administradores devem possuir acesso à camada de administração do sistema.

## Performance  
* RNF006. Tempo estimado de inicialização do sistema após login: 3s em servidor com 15Mb de banda larga.
* RNF007. Tempo estimado para o processamento das operações do sistema: 2s em servidor com 15Mb de banda larga.
* RNF008. Capacidade de transferência de dados para o servidor local: 5TB.

## Suportabilidade
* RNF009. O sistema deve ser suportado pelos navegadores Google Chrome, Firefox e Safari. 
* RNF010. Suporte à Internacionalização de idiomas, em inglês e espanhol. 
* RNF011. O site deve ser responsivo.

## Interfaces com Usuário
* RNF012. O sistema deve seguir o padrão de design do Bootstrap.
* RNF013. A paleta de cores deve ser constituída por tons de cinza.

## Padrão de Navegação e Leiaute
* RNF014. O sistema deverá usar a navegação por funcionalidades.

## Consistência das Interfaces com Usuário
* RNF015. O sistema trabalha com padrão de listagem de itens cadastrados, quando acessado a página para cadastro, exclusão ou alteração. 

## Interfaces com Sistemas Externos
* RNF016. O sistema contará com um sistema externo de Nota Fiscal, no qual sua comunicação será feita através de uma API.

## Interfaces de Hardware
* RNF017. O sistema possui integração com leitores de códigos de barra (S100 Bematech) e balança (Prix 4 Uno) . 

## Interfaces de Comunicação
* RNF018. O sistema de contará com integração a um sistema de nota fiscal eletrônica através de arquivos JSON e API's.
* RNF018_1. [JSON de empresas](https://github.com/eng-sw/es-trabalho-cthulhu-1/blob/master/docs/json/empresas.json)
* RNF018_2. [JSON de NFE](https://github.com/eng-sw/es-trabalho-cthulhu-1/blob/master/docs/json/listagem_nfe.json)
* RNF018_3. [JSON de clientes](https://github.com/eng-sw/es-trabalho-cthulhu-1/blob/master/docs/json/pessoas_fisicas.json)
* RNF018_4. [JSON de empresas](https://github.com/eng-sw/es-trabalho-cthulhu-1/blob/master/docs/json/produtos.json)

## Licenciamento
* RNF019. O sistema sera disponibilizado como Software as a Service (SaaS), ou seja, o sistema funcionará baseado em uma assinatura mensal.

## Legal
* RNF020. O sistema possui garantia de 99% de uptime. 
* RNF021. Todas as imagens pertencem a CthulhuⓇ empreendimentos.
* RNF022. Se aplica a LEI 9.609/1998. Dispõe sobre a proteção da propriedade intelectual de programa de computador, sua comercialização no país, e dá outras providências.
* RNF023. Lei Nº 12.551, de 15 de Dezembro de 2011 – Equipara os efeitos jurídicos da subordinação exercida por meios telemáticos e informatizados à exercida por meios pessoais e diretos.

* RNF024. Lei Nº 12.546, de 14 de Dezembro de 2011 – Desoneração da folha para empresas de TI e TIC.

* RNF025. Lei Nº 11.452, de 27 de Fevereiro de 2007 - Não incidência de “CIDE” de 10% nas operações com programas de computador .

* RNF026. Lei Nº 11.196, de 21 de Novembro 2005 - Institui o Regime Especial de Tributação para a Plataforma de Exportação de Serviços de Tecnologia da Informação - REPES, o Regime Especial de Aquisição de Bens de Capital para Empresas Exportadoras - RECAP e o Programa de Inclusão Digital; dispõe sobre incentivos fiscais para a inovação tecnológica.

* RNF027. Portaria Nº 338, de 27 de Agosto de 1996 – Ministério da Ciência e Tecnologia – Dispensa a realização dos procedimentos de cadastramento, do exame de similaridade e da aprovação dos atos e contratos de licença ou de cessão de direitos de comercialização de programas de computador.

## Padrões
* RNF028. O sistema deve ser desenvolvido com padrão arquitetural MVC.
* RNF029. O sistema deve ser planejado e executados baseado na metodologia SCRUM, com  Sprints de uma semana, e a definição de Pronto, do requisito, será aceita após a validação e aprovação do cliente.

## Documentação do sistemas
* RNF030. O manual de utilização do sistema será disponibilizado em uma base de conhecimento presente na central de suporte da empresa Cthulhu.


