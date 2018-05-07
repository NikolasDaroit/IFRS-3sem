#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct node{
    char valor;
    struct node * next;
} Node;

typedef struct List{
    Node * first;
    Node * last;
    int size;

} List;


//ponteiro
Node * createNode(char valor){
    Node * n = (Node *) malloc(sizeof(Node));
    n->next = NULL;
    n->valor = valor;
    return n;
}


//sem ponteiro
/*Node createNode(int valor){
    Node n;
    n.next = NULL;
    n.valor = valor;
    return n;
}
*/
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
int main_opt();
int menu();
void addLast2(List * l, Node * n);
void removePosition(List *l, int valor);
void leia(char buffer[], int tamanho);
char * getText();
char removeFirst(List * l);
int main(){
    List lista;
    lista = createList();
    List lfecha;
    lfecha = createList();
    List labre;
    labre = createList();

    char valor[30];
    leia(valor, 30);
    int length = strlen(valor);
    int i=0;
    char c1, c2;
    for (i=0;i<length;i++){
        //printf("%c\n", valor[i]);
        Node * n = createNode(valor[i]);
        c1 = valor[i];
        c2 = "-1";
        //printf("%d\n", (c1=='('));

        if (c1== '('){
            addFirst(&labre, n);
        }else if(c1== '{'){
            addFirst(&labre, n);
        }else if (c1== '['){
            addFirst(&labre, n);
        }else if(c1== ')'){
            c2 = removeFirst(&labre);

            if (c2!='('){
                    printf("%d",0);
                exit(0);
            }
        }else if (c1== ']'){
            c2 = removeFirst(&labre);
            if (c2!='['){
                    printf("%d",0);
                exit(0);
            }
        }else if (c1== '}'){
            c2 = removeFirst(&labre);
            if (c2!='{'){
                printf("%d",0);
                exit(0);
            }
        }
    }
    if (labre.size>0){
       printf("%d",0);
       return 0;
    }else{
        printf("%d",1);
    return 1;
    }


}
void leia(char buffer[], int tamanho){
    fflush(stdin);
    fgets(buffer, tamanho, stdin);
    buffer[strcspn(buffer, "\n")]=0;
    fflush(stdin);
}

void addFirst(List * l, Node * novo){
    novo->next = l->first;
    l->first = novo;
    l->size++;

}
char removeFirst(List * l){
    Node * temp;
    temp = l->first;
    l->first = l->first->next;
    l->size--;
    return temp->valor;
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

/*
Faça um programa onde o usuário digitará uma string
(não coloque texto pedindo para digitar, apenas aguarde a digitação).
Após, verifique se a abertura e fechamento de colchetes e parênteses no
texto informado estão corretos. Caso sim, mostre apenas "1" na tela.
Caso não, mostre "0".
*/
