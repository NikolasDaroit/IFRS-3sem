#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define TAM_NOME  20
#define TAM_DOENCA  30

typedef struct{
   int dia;
   int mes;
   int ano;

} Data;

typedef struct{
    char nome[TAM_NOME];
    char sexo;
    Data datanasc;
    int nascimento;
    char doencas[TAM_DOENCA];
    int idade;
    int id;

} Cliente;

Cliente * cadastro;
int total = 0 ;
int menu(){
    printf("\n1 criar clientes\n2 mostrar todos\n3 pesquisa por nome\n4 excluir por nome\n" );
    int op;
    scanf("%d",&op);
    return op;
}
void leia(char buffer[], int tamanho){
    getchar();
    fflush(stdin);
    fgets(buffer, tamanho, stdin);
    buffer[strcspn(buffer, "\n")]=0;
    fflush(stdin);
}
void cadastrar(){
    Cliente c;
    printf("nome: ");
    leia(c.nome, TAM_NOME);
    printf("sexo: ");
    scanf(" &c", &c.sexo);
    c.sexo=toupper(c.sexo);
    //printf("dt nasc: ");
    //scanf("%i", &c.nascimento);
    fflush(stdin);
    printf("dia: ");
    scanf("%i", &c.datanasc.dia);
    fflush(stdin);
    printf("mes: ");
    scanf("%i", &c.datanasc.mes);
    fflush(stdin);
    printf("ano: ");
    scanf("%i", &c.datanasc.ano);
    //fflush(stdin);

    printf("doencas: ");
    leia(c.doencas, TAM_DOENCA);
    printf("finalizado!");
    mostrar(c);
    cadastro = (Cliente *) realloc(cadastro, (total+1)*sizeof(Cliente) );
    cadastro[total] = c;
    total++;
}

int idade(Data d){
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    int dataint = d.dia+d.mes*100+d.ano*10000;
    int agoraint = tm.tm_mday + (tm.tm_mon+1)*100+(tm.tm_year+1900)*10000;
    int diff = agoraint-dataint;
    return (int) (diff/10000);

}
void buscar(){
    printf("nome");
    char nome[TAM_NOME];
    leia(nome, TAM_NOME);
    int i;
    for(i=0;i<total;i++){
        if (strcmp(nome, cadastro[i].nome)==0){
            mostrar(cadastro[i]);
            return;
        }
    }
    printf("cadastro nao encontrado");
}

void mostrar(Cliente c){
    printf("\nNome %s\n", c.nome);
    printf("Sexo %c\n", c.sexo);
    printf("Dt. Nasc. %d/%d/%d (idade: %d)\n", c.datanasc.dia, c.datanasc.mes, c.datanasc.ano, idade(c.datanasc));
    printf("doencas %s\n", c.doencas);
}
void listar(){
    int i;
    for (i=0;i<total;i++){
        printf("registro %d\n", i);
        mostrar(cadastro[i]);
    }
}
void excluir(){
    printf("qual numero do registro a ser excluido");
    int n,i;
    scanf("%d", &n);
    if (n>=0 && n < total){
        for (i=n;i<total-1;i++){
            cadastro[i]=cadastro[i+1];
        }
        total--;
        cadastro = (Cliente *) realloc(cadastro, (total)*sizeof(Cliente) );
    }else{
        printf("codigo invalido");
    }
}
int main(){
    int op;
    while(1){
        op = menu();
        switch (op){
            case 1:
                cadastrar();break;
            case 2:
                listar();break;
            case 3:
                buscar();break;
            case 4:
                excluir();break;
        }
    }
}

