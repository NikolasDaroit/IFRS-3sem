#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ITERACOES 10000000
int busca_linear(int vetor_length, int vetor[vetor_length], int valor);

int main()
{
    int vetor[30] = {2,4,6,7,8,10,11,12,14,16,18,20,22,24,25,26,28,30,32,34,36,38,39,40,42,44,46,48,49,50};
    int vetor_length =  (int)( sizeof(vetor) / sizeof(vetor[0]));

    clock_t start, end;
    double cpu_time_used;
    /* Do the work. */
    start = clock();
    int i;
    for (i=0;i<ITERACOES;i++){
        busca_linear(vetor_length, vetor, 50);
    }
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf("LINEAR %lf\n", cpu_time_used);
    /* End the work. */

    /* Do the work. */
    start = clock();
    for (i=0;i<ITERACOES;i++){
        busca_binaria(vetor_length, vetor, 42);
    }
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf("BINARIA % lf\n", cpu_time_used);
    /* End the work. */

    /* Do the work. */
    start = clock();
    for (i=0;i<ITERACOES;i++){
        busca_interp(vetor_length, vetor, 42);
    }
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf("INTERP %lf\n", cpu_time_used);
    /* End the work. */

    return 0;
}
int busca_linear(int vetor_length, int vetor[vetor_length], int valor) {
    int i = 0;

    for (i = 0; i < vetor_length; i++) {
        if (vetor[i] == valor){
            return i;
        }
    }
    return -1;
}
int busca_binaria(int vetor_length, int vetor[vetor_length], int valor) {
    int esq = 0;
    int dir = (vetor_length-1);
    while (esq < dir) {
        int meio = (esq + dir) >> 1;
        if (vetor[meio] == valor) return meio;
        if (vetor[meio] < valor) esq = meio + 1;
        else if (vetor[meio] > valor) dir = meio - 1;
    }
    return -1;
}
int busca_interp(int vetor_length, int vetor[vetor_length], int valor) {
    int esq = 0;
    int dir = (vetor_length-1);
    while (esq < dir) {
        int meio = esq + ((valor - vetor[esq]) * (dir - esq) / (vetor[dir] - vetor[esq]));
        if (vetor[meio] == valor) return meio;
        if (vetor[meio] < valor) esq = meio + 1;
        else if (vetor[meio] > valor) dir = meio - 1;
    }
    return -1;
}


