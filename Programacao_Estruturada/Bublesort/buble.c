#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>   
#define MAX 0
#define ARRAY_SIZE 8

void swap( int x, int y, int array[] ){
    int aux;
    // aux assume o valor de x
    aux = array[x];
    // valor de y é guardado na posicao x
    array[x] = array[y];
    // valor anterior de x é guardado na posicao y
    array[y] = aux;
}

int bubbleSort(int* num, int array_size, int asc){
    int temp, loops=0;
    // corre pelo array
    for(int i = 1; i < array_size; i++) {
        int trocou=0;
        // para cada posicao do array
        for(int j = 0; j < array_size-i; j++ ) {
            if (asc){
                // compara com a proxima, se for maior, troca
                if(num[j] > num[j+1]) {
                    swap(j, j+1, num);
                    trocou=1;
                }
            }else{
                 if(num[j] < num[j+1]) {
                    swap(j, j+1, num);
                    trocou=1;
                }
            }
            loops++;
        }
        // se nao houve troca, o array esta ordenado. Finaliza.
        if (trocou==0){      
            return loops;
        }
    }

    return loops;
}

void printArray(int* num, int array_size) {
     // mostra um array, passando o tamanho
    for(int i = 0; i < array_size; ++i) {
        printf("array[%d] = %d\n", i, num[i]);
    }
}
 
int main(){
    // declaramos o ponteiro
    int *ptrInt;
    // alocamos espaco 
    ptrInt = malloc (ARRAY_SIZE * sizeof *ptrInt);
    // gerar numeros aleatorios
    srand(time(NULL));   // seed aleatoria
    for(int i = 0; i < ARRAY_SIZE; ++i) {
        // preencher o array com numeros de 0 até MAX
        ptrInt[i] = rand() % (MAX + 1 - 0) + 0;
    }   
    // mostrar o array desordenado
    printf("Array desordenado: \n");
    printArray(ptrInt, ARRAY_SIZE);
    // array ordenado ascendente(1) ou descendentemente(0)
    int asc = 1;
    // ordenar o array
    int total_loops = bubbleSort(ptrInt, ARRAY_SIZE, asc);
    // mostrar o array ordenado   
    printf("\nArray ordenado %s :\n", (asc == 1) ? "asc": "desc");
    printArray(ptrInt, ARRAY_SIZE);
    // mostrar quantas operaçoes foram realizadas
    printf("\nTotal de iterações: %i\n", total_loops);
    // liberar a memoria alocada
    if(ptrInt != NULL) {    
        free(ptrInt);
     }
    // finaliza programa
    return 0;
}