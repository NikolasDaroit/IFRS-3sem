#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define n 2
#define TAM_NOME  20
#define TAM_DOENCA  50

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
int total = -1;
int menu(){
    printf("\n1 criar clientes\n2 mostrar todos\n4 pesquisa por nome\n5 excluir por nome\n6 sair\n" );
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
    printf("dia: ");
    scanf("%d", &c.datanasc.dia);
    printf("mes: ");
    scanf("%d", &c.datanasc.mes);
    printf("ano: ");
    scanf("%d", &c.datanasc.ano);
    printf("doencas: ");
    leia(c.doencas, TAM_DOENCA);
    printf("finalizado!");
    mostrar(c);
    cadastro = (Cliente *) realloc(cadastro, (total++)*sizeof(Cliente) );
    cadastro[total] = c;
}

int idade(Data d){
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    int dataint = d.dia+d.mes*100+d.ano*10000;
    int agoraint = tm.tm_mday + (tm.tm_mon+1)*100+(tm.tm_year+1900)*10000;
    int diff = agoraint-dataint;
    return (int) (diff/10000);

}
int buscar(char nome[]);
int criar_cliente(char *nome, char sexo, char *doencas);
void mostrar_clientes();
void excluir();

void mostrar(Cliente c){
    printf("Nome", c.nome);
}
int main(int argc, char const *argv[]){
    int posicao = 0;
    int k = 0;
    int result;

    while (k!=6){

        FILE * fp;
        char * line = NULL;
        char palavra[100];

        fp = fopen("cadastro.txt", "r");
        if (fp == NULL){
            fp = fopen("cadastro.txt", "wt");
        }else{
            while(!feof(fp)) {
                fgets(palavra, 100, fp);
                printf("%s", palavra);
            }
        }



        fclose(fp);
        if (line)
            free(line);
        exit(EXIT_SUCCESS);

        printf("\n1 criar clientes\n2 mostrar todos\n4 pesquisa por nome\n5 excluir por nome\n6 sair\n" );
        printf("Opcao... ");
        scanf("%d", &k);
        printf("\n");
        char *nome="";
        char sexo="";
        char *doencas="";
        switch ( k ){
            case 1 :

                result = criar_cliente(nome, sexo, doencas);
                if (result == 1){
                    printf("\nCadastro realizado com sucesso\n");

                }else{
                    printf("\nNão foi possível realizar este cadastro. Consulte o administrador do sistema.\n");
                }

                break;
            case 2 :
                mostrar_clientes();

                break;
            case 4 :
                buscar("fulano-1");

                break;
            case 5 :
                excluir(buscar("fulano-1"));

        }
    }
}
int criar_cliente(char *nome, char sexo, char *doencas){
    int aux ;
    for (aux=0;aux<n;aux++){
        if (cadastro[aux].id == 0){
            char buf[20];
            sprintf(buf, "fulano-%d", aux);
            strcpy(cadastro[aux].nome, buf);
            strcpy(cadastro[aux].sexo, "fem");
            strcpy(cadastro[aux].doencas, "asma");
            //cadastro[aux].nascimento = 1011997;
            cadastro[aux].idade = 21;
            cadastro[aux].id = aux+1;
            return 1;
        }
    }
    return 0;

    }
void mostrar_clientes(){
    int encontrado = 0;
    int posicao;
    for (posicao=0;posicao<n;posicao++){
        if (cadastro[posicao].nascimento != 0 && cadastro[posicao].idade != 0){
            printf("\nNome: %s\nSexo: %s\nDoencas: %s\nNascimento: %i\nIdade: %i\n", cadastro[posicao].nome, cadastro[posicao].sexo, cadastro[posicao].doencas, cadastro[posicao].nascimento, cadastro[posicao].idade);
            encontrado = 1;
        }
    }
    if (encontrado == 0){
        printf("Nenhum cliente encontrado\n");
    }
}

int buscar(char nome[]){
    int encontrado = 0;
    int i;
    for (i=0;i<n;i++){
        if (strcmp(cadastro[i].nome, nome) == 0){
            printf("\nCliente encontrado: ");
            printf("\nNome: %s\nSexo: %s\nIdade: %i\n\n", cadastro[i].nome, cadastro[i].sexo, cadastro[i].idade);
            encontrado +=1 ;
            return i;
        }
    }

    if (encontrado == 0){
        printf("Cliente nao encontrado\n");
    }
    return 0;
}

void excluir(int posicao){
    strcpy(cadastro[posicao].nome, "");
    strcpy(cadastro[posicao].sexo, "");
    strcpy(cadastro[posicao].doencas, "");
    cadastro[posicao].nascimento = 0;
    cadastro[posicao].idade = 0;
    cadastro[posicao].id = 0;
}
