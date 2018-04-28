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


//ponteiro
/*Node * criaNo(){
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    return n;
}
*/

//sem ponteiro
Node createNode(int valor){
    Node n;
    n.next = NULL;
    n.valor = valor;
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
void addFirst(List * l, Node * novo);
int removeAll (List* l, int valor);

int main(){
  List lista;
  lista = createList();
  Node n0, n1, n2, n3;
  n1 = createNode(22);
  addLast(&lista, &n1);
  n0 = createNode(33);
  addLast(&lista, &n0);
  // n2 = createNode(11);
  // addLast(&lista, &n2);
  // n3 = createNode(44);
  // addLast(&lista, &n3);
  
  removeAll(&lista, 22);
  // removeAll(&lista, 33);

  printAll(&lista);
  printf("Ultimo valor: %d\n", lista.last->valor);
  printf("Total itens: %d\n", lista.size );


}

void addLast(List * l, Node * n){
    /*A opção adicionar valor deve solicitar um inteiro ao usuário e 
    adicionar o valor digitado ao final da lista. Mostre a lista após a inclusão.*/
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
    // printAll(l);
}

void addFirst(List * l, Node * novo){
    //novo aponta para o endereco do anterior
    novo->next = l->first;
    //proximo do antigo e o end do novo
    l->first = novo;
    if (l->last == NULL){
      l->last = novo;

    }
    l->size++;
}
int printAll(List * l){
    int count = 0;  // Initialize count
    Node * atual = l->first;  // Initialize current
    while (atual != NULL){
        printf("[Nodo %i] -> %d\n",count, atual->valor);
        count++;
        atual = atual->next;
    }
    return count;
}
int removeAll (List* l, int valor) {
    Node* prev = l->first;
    Node* node = l->first;
    Node* next;
    int i = 0;
    do{
        if (prev==node){
            if (node->valor == valor){
                if(node->next != NULL){
                    l->first = node->next;  
                    // free(node); 
                }else{

                }
            }

        }else{
            if (node->valor == valor){
                if(node->next != NULL){
                    
                }
            }
        }
        node = node->next;
    }while(node->next != NULL);

    // while (node != NULL){
    //     prev = node;
    //         printf("%d\n", node->valor);
    //     if (node->valor == valor){
    //         next = node->next;
    //         prev->next = node->next;
    //         // free(node);
    //         l->size--;
    //         i++;
    //         node = next;

    //     }
        
    // }
    return i;
}
/* 
Implemente uma lista encadeada com as operações de criar, 
  adicionar item ao final, 
  remover item em qualquer posição e imprimir a lista completa na tela.

Faça um programa que ofereça ao usuário um menu com as opções 
  1) Adicionar valor 2) Remover valor 3) Sair.

A opção adicionar valor deve solicitar um inteiro ao usuário e 
  adicionar o valor digitado ao final da lista. Mostre a lista após a inclusão.

A opção de remover valor deve solicitar um inteiro ao usuário e 
  remover o valor na posição escolhida (começando em 0). 
  Mostre a lista após a remoção.
*/
/*
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

  // removeAfter(&n1);
  // n1 n3

  Node n4;
  n4 = criaNo();
  n4.valor = 40;

  insertBeginning(&l, &n4);

  Node n5;
  n5 = criaNo();
  n5.valor = 50;
  insertBeginning(&l, &n5);
  // n4 n1 n3
  printf("\n-------------\nCount |  %i  |\n-------------", getCount(&l));
  printAll(&l);
  // printf("\n[First] Nodo %d", l.first->valor);
  // printf("\n[2nd] Nodo %d", l.first->next->valor);
  // printf("\n[3rd] Nodo %d", l.first->next->next->valor);
  // printf("\n[4th] Nodo %d", l.first->next->next->next->valor);
  printf("\n");

}
*/
