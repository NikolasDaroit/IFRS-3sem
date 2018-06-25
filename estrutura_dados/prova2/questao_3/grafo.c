/*----------------------NÃO MEXA, MAS LEIA!-----------------------------------*/
#include <stdio.h>
#include <stdlib.h>

#define MAXSIZE 100

typedef struct node Node;
struct node {
    int data;
    Node * next; //Ponteiro para o próximo nó, null se for o último
};
typedef struct {
    Node * firstNode; // Ponteiro para o primeiro nó; null se a lista estiver vazia
    Node * lastNode; // Ponteiro para o último nó; null se a lista estiver vazia
} List;

List * criaLista();
Node * criaNo(int valor);
void insere(List * lista, int valor);
void printaGrafo(List * grafo[], int size);

int main() {
    char linha[MAXSIZE];
    List * grafo[MAXSIZE];    //Um grafo é um array de (ponteiros de) Lists
    int num_vertices = 0;
    while (fgets(linha, MAXSIZE, stdin) != NULL) {
        num_vertices++;
        List * vertices = criaLista();
        grafo[num_vertices-1] = vertices;
        for (int i = 0; linha[i] != '\0'; i++) {
            if (linha[i] == '\n') break;
            if (linha[i] != '0') {
                insere(vertices, i+1);
            }
        }
    }
    printf("%d\n", num_vertices);
    printaGrafo(grafo, num_vertices);
    return 0;
}

/*--MEXER! IMPLEMENTE AS 4 FUNÇÕES QUE FALTAM CONFORME AS DECLARAÇÕES ACIMA!--*/

//Cria (aloca e inicializa) uma List e retorna um ponteiro para ela
List * criaLista() {
    List *lista = (List *) malloc(sizeof(List));
    lista->firstNode = lista->lastNode = NULL;
    return lista;
    //SEU CÓDIGO AQUI (~3 linhas)
}

//Cria (aloca e inicializa) um Node com o valor informado  e retorna um ponteiro para ele
Node * criaNo(int valor) {
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    n->data = valor;
    return n;
    //SEU CÓDIGO AQUI (~3 linhas)
}

//Cria um Node com o valor informado e o insere ao *final* da lista informada
void insere(List * lista, int valor) {
    Node * novo = criaNo(valor);
    if (lista->lastNode == NULL){
      lista->lastNode = novo;
    }else{
      lista->lastNode->next = novo;
      lista->lastNode = novo;
    }
    if (lista->firstNode == NULL){
      lista->firstNode = novo;
    }
    //SEU CÓDIGO AQUI (~7 linhas)
}

//Percorre o array de vértices do grafo e mostra todos seus vizinhos separados por espaço
//Os vizinhos de cada vértice ocupam uma linha (igual ao exercício de grafos)
void printaGrafo(List * grafo[], int size) {
    int i  =0;
    int len =  (int)( sizeof(List) / sizeof(grafo[0]));
    //pra cada grafo(lista)
    for (i=0;i<len;i++){
        //primeiro nodo
        Node * novo = grafo[i]->firstNode;
        //enquanto tiver nodo
        while (novo!=NULL){
            printf("%d\n", grafo[i]->firstNode->data);
            novo=novo->next;
        }

    }
    //SEU CÓDIGO AQUI (~9 linhas)
}
