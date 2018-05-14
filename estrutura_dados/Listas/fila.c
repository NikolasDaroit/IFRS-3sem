/*Seu programa deverá receber como entrada qualquer quantidade de números inteiros
(não escreva na tela pedindo para o usuário),
que deverão ser inseridos em uma fila.
Quanto o retorno do scanf for -1, é sinal de que não foram digitados mais números.

Cada número representa o número de ciclos da CPU que um processo necessita para ser executado.
O primeiro processo da fila executará 1 ciclo (subtraindo 1 do valor),
será removido da fila e inserido novamente no final caso seu valor ainda seja maior que 0.
Isto deverá ser repetido 100 vezes ou até a fila ficar vazia, o que acontecer primeiro.

Após a execução do 100º ciclo (ou esvaziamento da fila) , mostre na tela o estado atual da fila, com um elemento por linha.

Exemplo:

Entrada: 100
10
1

Execução: 10 1 99, 1 99 9, 99 9, 9 98, 98 8, 8 97, etc...
Saída (após 100 passos): 11
*/
#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int valor;
    struct node * next;
} Node;

typedef struct List{
    Node * first;
    Node * last;
    int size;

} List;

Node * criaNo(){
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    return n;
}

List createList () {
    List l;
    l.first = NULL;
    l.last = NULL;
    l.size = 0;
    return l;
}
int printAll(List * l);
void addLast(List * l, Node * n);
int removeFirst(List * l);

int main(){
    List lista;
    lista = createList();
    Node * n;
    int i=0;
    int ret=0;
    while (ret!=-1 && i!=-1){
        ret = scanf("%d",&i);
        n = criaNo(); n->valor = i; addLast(&lista, n);
    }
    int count = 0;
    while (lista.first != NULL){
        if (count >= 100) break;
        count ++;

        int first;
        first = removeFirst(&lista);
        first -= 1;
        if (first>0){
         n = criaNo(); n->valor = first; addLast(&lista, n);
        }
    }


    printAll(&lista);

    return 0;
}


void addLast(List * l, Node * n){
    if (l->last == NULL){
      l->last = n;
    }else{
      l->last->next = n;
    }
    if (l->first == NULL){
      l->first = n;
    }
    l->last = n;
    l->size++;
}
int removeFirst(List * l){

    if (l->first == NULL) return -1;
    int removed;

    Node * temp;
    temp = l->first;
    if (l->first->next != NULL){
        removed = l->first->valor;
        l->first = l->first->next;
    }else{
        removed = l->first->valor;
        l->first = NULL;
    }
    free(temp);
    return removed;

}
int printAll(List * l){
    int count = 0;  // Initialize count
    Node * atual = l->first;  // Initialize current
    do{
        
    }while (atual->next != NULL){
        printf("%d\n", atual->valor);
        count++;
        if (atual->next == NULL) break;
        atual = atual->next;
    }
    return count;
}
