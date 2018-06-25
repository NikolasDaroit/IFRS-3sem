/*----------------------NÃO MEXA, MAS LEIA!-----------------------------------*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define SIZE 100

typedef struct {
	int head;		//índice do topo da pilha no array
	char * data[SIZE];	//array de SIZE strings para guardar os dados
} PilhaString;

PilhaString * criaPilhaString() {
	PilhaString* p = (PilhaString*) malloc(sizeof(PilhaString));
	p->head = -1;
	return p;
}

void push(PilhaString * p, char * valor) {
	if (p->head < SIZE - 1) {		//Se cabe mais 1
	    p->head++;
	    p->data[p->head] = (char *) malloc(sizeof(char) * 100);
		strcpy(p->data[p->head], valor);	//Insere valor no topo
	}
}

char * pop(PilhaString * p) {
	if (p->head > -1) {
		return p->data[p->head--];
	}
    return NULL;	//Quando a pilha está vazia
}

void back(char * atual, PilhaString * voltar, PilhaString * avancar);
void forward(char * atual, PilhaString * voltar, PilhaString * avancar);
void clear(PilhaString * p);
void visit(char * digitado, char * atual, PilhaString * voltar, PilhaString * avancar);

int main() {
    char * digitado = (char *) malloc(sizeof(char) * 100);
    char * atual = (char *) calloc(sizeof(char), 100);

    PilhaString * voltar = criaPilhaString();
    PilhaString * avancar = criaPilhaString();
    
    while (scanf("%s", digitado) > -1) {
        if (strcmp(digitado, "BACK") == 0) {    //Se escreveu BACK, voltar
            back(atual, voltar, avancar);
        }
        else if (strcmp(digitado, "FORWARD") == 0) {    //Se escreveu FORWARD, avançar
            forward(atual, voltar, avancar);
        }
        else {  //Digitou um site
            visit(digitado, atual, voltar, avancar);
        }
    }
    printf("%s", atual);
    return 0;
}

/*--MEXER! IMPLEMENTE AS 4 FUNÇÕES QUE FALTAM CONFORME AS DECLARAÇÕES ACIMA!--*/

//Visita o site informado (e emplilha em 'voltar' e esvazia 'avancar')
//(função de maior importância na nota da questão)
void visit(char * digitado, char * atual, PilhaString * voltar, PilhaString * avancar) {
    if (strcmp(atual, "")>0){
      avancar->head=-1;
        push(voltar, atual);  
    }
    
    strcpy(atual,digitado);
    //SEU CÓDIGO AQUI (~5 linhas de código)
}

//Esvazia uma pilha
void clear(PilhaString * p) {
    p->head = -1;
    //SEU CÓDIGO AQUI (~1 linha de código)
}

//Botão voltar do navegador
void back(char * atual, PilhaString * voltar, PilhaString * avancar) {
    push(avancar, atual);
    strcpy(atual,pop(voltar));
    //SEU CÓDIGO AQUI (~4 linhas de código)
}

//Botão avançar do navegador
void forward(char * atual, PilhaString * voltar, PilhaString * avancar) {
    push(voltar,atual);
    strcpy(atual, pop(avancar));
    //SEU CÓDIGO AQUI (~4 linhas de código)
}
