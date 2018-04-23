#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int valor;
    struct node * next;
} Node;

typedef struct {
    Node * first;
} List;

//ponteiro
/*Node * criaNo(){
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    return n;
}

int main(){
  Node * n1, * n2;
  n1 = criaNo();
  n2 = criaNo();
  n1->valor = 10;
  n2->valor = 20;
  n1->next = n2;
  printf("%d", n1->next->valor);
}
*/

//sem ponteiro
Node criaNo(){
    Node n;
    n.next = NULL;
    return n;
}

void insertAfter(Node * n, Node * novo){
    printf("\nTeste\n%d %d", n->valor, novo->valor);
    //novo aponta para o endereco do anterior
    novo->next = n->next;
    //proximo do antigo e o end do novo
    n->next = novo;
}

void insertBeginning(List * l, Node * novo){
    //novo aponta para o endereco do anterior
    novo->next = l->first;
    //proximo do antigo e o end do novo
    l->first = novo;
}


void removeAfter(Node * node){ // remove o nó após este
 Node * obsoleteNode = node->next; //Guarda o nó que vai sumir
 node->next = node->next->next; //Atualiza o ponteiro do nó atual para o depois do excluído
 free(obsoleteNode); //Libera memória do nó excluído
}
/*
void removeBeginning(List list){ // remove o primeiro nó
 obsoleteNode := list.firstNode; //Guarda o nó que vai sumir
 list.firstNode := list.firstNode.next; //Lista aponta para o segundo elemento
 free(obsoleteNode) //Libera memória do nó excluído
}
*/
int main(){
  Node  n1,  n2;
  n1 = criaNo();
  n2 = criaNo();
  n1.valor = 10;
  n2.valor = 20;
  n1.next = &n2;
  printf("%d", n1.next->valor);

  Node n3;
  n3 = criaNo();
  n3.valor = 30;

  List l;
  l.first = &n1;
  printf("\nNodo1 %d", l.first->valor);

  insertAfter(&n2, &n3);
  // n1 n2 n3

  removeAfter(&n1);
  // n1 n3

  Node n4;
  n4 = criaNo();
  n4.valor = 40;

  insertBeginning(&l, &n4);
  // n4 n1 n3
  printf("\nNodo4 %d", l.first->valor);

}
