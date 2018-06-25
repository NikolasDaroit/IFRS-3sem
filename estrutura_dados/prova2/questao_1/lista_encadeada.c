/*--------------------------NÃO MEXA AQUI! MAS LEIA!--------------------------*/
#include <stdio.h>
#include <stdlib.h>

typedef struct node Node;
struct node {
    int data;
    Node * next; //Ponteiro para o próximo nó, null se for o último
};
typedef struct {
    Node * firstNode; // Ponteiro para o primeiro nó; null se a lista estiver vazia
} List;

List * criaLista(); 
Node * criaNo(int valor);
void insere(List * lista, int valor, int posicao);
void printaLista(List * lista);

int main() {
    List * lista = criaLista();
    int valor;
    int cont = 0;
    while (scanf("%d", &valor) != EOF) {
        insere(lista, valor, cont / 2);
        cont++;
    }
    printaLista(lista);
    return 0;
}

void printaLista(List * lista) {
    Node * v = lista->firstNode;
    while (v != NULL) {
        printf("%d ", v->data);
        v = v->next;
    }
}

/*--MEXER! IMPLEMENTE AS 3 FUNÇÕES QUE FALTAM CONFORME AS DECLARAÇÕES ACIMA!--*/

//Cria (aloca e inicializa) uma List e retorna um ponteiro para ela
List * criaLista() {
    List *lista = (List *) malloc(sizeof(List));
    lista->firstNode = NULL;
    return lista;
    //SEU CÓDIGO AQUI (~3 linhas)
}

//Cria (aloca e inicializa) um Node com o valor informado  e retorna um ponteiro para ele
Node * criaNo(int valor) {
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    n->data=valor;
    return n;
    //SEU CÓDIGO AQUI (~3 linhas)
}

//Cria um Node com o valor informado e o insere na posição informada da lista
void insere(List * lista, int valor, int posicao) {
    Node * novo = criaNo(valor);
    Node * first = lista->firstNode;
    if (first==NULL || posicao == 0){
        if (first!=NULL){
            novo->next=first;
        }
        lista->firstNode = novo;
        return;
    }
    Node * next = first->next;
    Node * prev = first;
    Node * temp = NULL;
    int i = 1;
    while(next!=NULL){
        if (i==posicao){
            if (next->next!=NULL){
                temp=next->next;
            }
            prev->next = novo;
            novo->next=next;
            next->next = temp;
            break;
        }
        prev=next;
        next=next->next;
        i++;
    }
    //SEU CÓDIGO AQUI (~18 linhas)
}
