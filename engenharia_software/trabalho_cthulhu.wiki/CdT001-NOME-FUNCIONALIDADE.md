# CdT001 - Título da Funcionalidade

Descrição da funcionalidade

## Caso de Uso

- [CdU00X – Nome do Caso de Uso](https://github.com/rodrigonoll/req-documentacao/wiki/CdU001%E2%80%93EspecificacaoDoCasoDeUso) 



## Regras de Negócio ou Critérios de Aceitação

- [RNG001](https://github.com/rodrigonoll/req-documentacao/wiki/regras_mensagens#rng001)
- [RNG002](https://github.com/rodrigonoll/req-documentacao/wiki/regras_mensagens#rng002)

...

## Detalhes adicionais

Qualquer informação/condição necessária ou relevante.

### Cenário 1 - [RNG001](https://github.com/rodrigonoll/req-documentacao/wiki/regras_mensagens#rng001)

```gherkin
      Given there's a book called "Tips for job interviews" written by "John Smith"
        And there's a book called "Bananas and their many colors" written by "James Doe"
        And there's a book called "Mama look I'm a rock star" written by "John Smith"
      When an employee searches by author "John Smith"
      Then 2 books should be found
        And Book 1 has the title "Tips for job interviews"
        And Book 2 has the title "Mama look I'm a rock star"
```

### Cenário 2 - [RNG001](https://github.com/rodrigonoll/req-documentacao/wiki/regras_mensagens#rng001), [RNG002](https://github.com/rodrigonoll/req-documentacao/wiki/regras_mensagens#rng002)

```gherkin
      Given there's a book called "Tips for job interviews" written by "John Smith"
        And there's a book called "Bananas and their many colors" written by "James Doe"
        And there's a book called "Mama look I'm a rock star" written by "John Smith"
      When an employee searches by author "John Smith"
      Then 2 books should be found
        And Book 1 has the title "Tips for job interviews"
        And Book 2 has the title "Mama look I'm a rock star"
```

...