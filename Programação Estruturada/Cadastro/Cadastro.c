#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define n 5

struct cliente{
    char nome[20];
    char sexo[3];
    char doencas[20];
    int nascimento;
    int idade;

};
int mostrar_cliente_por_nome(char nome[]);
int criar_cliente(int posicao);
void mostrar_clientes();
void excluir();
int i = 0;
struct cliente clientes[n];


int main(int argc, char const *argv[]){
    int posicao = 0;
    int k = 0;

    while (k!=6){
        printf("\n1 criar clientes\n2 mostrar todos\n4 pesquisa por nome\n5 excluir por nome\n6 sair\n" );
        printf("Opcao... ");
        scanf("%d", &k);
        printf("\n");
        switch ( k ){
            case 1 :
                posicao = criar_cliente(posicao);
                
                break;
            case 2 :
                mostrar_clientes();
            
                break;
            case 4 :
                mostrar_cliente_por_nome("fulano");
                
                break;
            case 5 :    
                excluir(mostrar_cliente_por_nome("fulano"));
     
        }
    }
}
int criar_cliente(int posicao){
    strcpy(clientes[posicao].nome, "fulano");
    strcpy(clientes[posicao].sexo, "fem");
    strcpy(clientes[posicao].doencas, "asma");
    clientes[posicao].nascimento = 1011997;
    clientes[posicao].idade = 21;
    
    return posicao+1;

}
void mostrar_clientes(){
    int encontrado = 0;
    for (int posicao=0;posicao<n;posicao++){
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
    return NULL;
}

void excluir(int posicao){
    strcpy(clientes[posicao].nome, "");
    strcpy(clientes[posicao].sexo, "");
    strcpy(clientes[posicao].doencas, "");
    clientes[posicao].nascimento = 0;
    clientes[posicao].idade = 0;
}
