#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define n 2

struct cliente{
    char nome[20];
    char sexo[3];
    char doencas[20];
    int nascimento;
    int idade;
    int id;

};
int mostrar_cliente_por_nome(char nome[]);
int criar_cliente();
void mostrar_clientes();
void excluir();
struct cliente clientes[n];


int main(int argc, char const *argv[]){
    int posicao = 0;
    int k = 0;
    int result;

    while (k!=6){
        printf("\n1 criar clientes\n2 mostrar todos\n4 pesquisa por nome\n5 excluir por nome\n6 sair\n" );
        printf("Opcao... ");
        scanf("%d", &k);
        printf("\n");
        switch ( k ){
            case 1 :
                result = criar_cliente();
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
                mostrar_cliente_por_nome("fulano-1");

                break;
            case 5 :
                excluir(mostrar_cliente_por_nome("fulano-1"));

        }
    }
}
int criar_cliente(){
    int aux ;
    for (aux=0;aux<n;aux++){
        if (clientes[aux].id == 0){
            char buf[20];
            sprintf(buf, "fulano-%d", aux);
            strcpy(clientes[aux].nome, buf);
            strcpy(clientes[aux].sexo, "fem");
            strcpy(clientes[aux].doencas, "asma");
            clientes[aux].nascimento = 1011997;
            clientes[aux].idade = 21;
            clientes[aux].id = aux+1;
            return 1;
        }
    }
    return 0;

    }
void mostrar_clientes(){
    int encontrado = 0;
    int posicao;
    for (posicao=0;posicao<n;posicao++){
        if (clientes[posicao].nascimento != 0 && clientes[posicao].idade != 0){
            printf("\nNome: %s\nSexo: %s\nDoencas: %s\nNascimento: %i\nIdade: %i\n", clientes[posicao].nome, clientes[posicao].sexo, clientes[posicao].doencas, clientes[posicao].nascimento, clientes[posicao].idade);
            encontrado = 1;
        }
    }
    if (encontrado == 0){
        printf("Nenhum cliente encontrado\n");
    }
}

int mostrar_cliente_por_nome(char nome[]){
    int encontrado = 0;
    int i;
    for (i=0;i<n;i++){
        if (strcmp(clientes[i].nome, nome) == 0){
            printf("\nCliente encontrado: ");
            printf("\nNome: %s\nSexo: %s\nIdade: %i\n\n", clientes[i].nome, clientes[i].sexo, clientes[i].idade);
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
    strcpy(clientes[posicao].nome, "");
    strcpy(clientes[posicao].sexo, "");
    strcpy(clientes[posicao].doencas, "");
    clientes[posicao].nascimento = 0;
    clientes[posicao].idade = 0;
    clientes[posicao].id = 0;
}
