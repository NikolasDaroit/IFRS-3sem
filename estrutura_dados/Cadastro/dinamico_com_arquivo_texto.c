#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define TAM_NOME  20
#define TAM_DOENCA  30

typedef struct{
   int dia;
   int mes;
   int ano;

} Data;

typedef struct{
    char nome[TAM_NOME];
    char sexo;
    Data datanasc;
    int nascimento;
    char doencas[TAM_DOENCA];
    int idade;
    int id;

} Cliente;

Cliente * cadastro;
int total = 0 ;
FILE *arqtxt;
int menu(){
    printf("\n1 criar clientes\n2 mostrar todos\n3 pesquisa por nome\n4 excluir por nome\n5 salvar\n6 finalizar" );
    int op;
    scanf("%d",&op);
    return op;
}
void leia(char buffer[], int tamanho){
    getchar();
    fflush(stdin);
    fgets(buffer, tamanho, stdin);
    buffer[strcspn(buffer, "\n")]=0;
    fflush(stdin);
}
void mostrar(Cliente c){
    printf("\nNome %s\n", c.nome);
    printf("Sexo %c\n", c.sexo);
    printf("Dt. Nasc. %d/%d/%d (idade: %d)\n", c.datanasc.dia, c.datanasc.mes, c.datanasc.ano, idade(c.datanasc));
    printf("doencas %s\n", c.doencas);
}
void cadastrar(){
    Cliente c;
    printf("nome: ");
    leia(c.nome, TAM_NOME);
    printf("sexo (m/f):");
    scanf(" %c",&c.sexo);
    getchar();
    c.sexo=toupper(c.sexo);    
    fflush(stdin);
    printf("dia: ");
    scanf("%i", &c.datanasc.dia);
    fflush(stdin);
    printf("mes: ");
    scanf("%i", &c.datanasc.mes);
    fflush(stdin);
    printf("ano: ");
    scanf("%i", &c.datanasc.ano);
    printf("doencas: ");
    leia(c.doencas, TAM_DOENCA);
    printf("finalizado!");
    mostrar(c);
    cadastro = (Cliente *) realloc(cadastro, (total+1)*sizeof(Cliente) );
    cadastro[total] = c;
    total++;
}

int idade(Data d){
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    int dataint = d.dia+d.mes*100+d.ano*10000;
    int agoraint = tm.tm_mday + (tm.tm_mon+1)*100+(tm.tm_year+1900)*10000;
    int diff = agoraint-dataint;
    return (int) (diff/10000);

}
void buscar(){
    printf("nome");
    char nome[TAM_NOME];
    leia(nome, TAM_NOME);
    int i;
    for(i=0;i<total;i++){
        if (strcmp(nome, cadastro[i].nome)==0){
            mostrar(cadastro[i]);
            return;
        }
    }
    printf("cadastro nao encontrado");
}


void listar(){
    int i;
    for (i=0;i<total;i++){
        printf("registro %d\n", i);
        mostrar(cadastro[i]);
    }
}
void excluir(){
    printf("qual numero do registro a ser excluido");
    int n,i;
    scanf("%d", &n);
    if (n>=0 && n < total){
        for (i=n;i<total-1;i++){
            cadastro[i]=cadastro[i+1];
        }
        total--;
        cadastro = (Cliente *) realloc(cadastro, (total)*sizeof(Cliente) );
    }else{
        printf("codigo invalido");
    }
}
void salvar(){
    int l;
    // FILE *arqtxt;
    arqtxt = fopen("cadastro.txt", "wt");
    fprintf(arqtxt, "%i\n", total);
    for (l=0;l<total;l++){
        printf("%d\n",l );
        // printf("Total: %s\n", total);
        fprintf(arqtxt, "%s\n", cadastro[l].nome);
        fprintf(arqtxt, "%c\n", cadastro[l].sexo);
        fprintf(arqtxt, "%d\n", cadastro[l].datanasc.dia);
        fprintf(arqtxt, "%d\n", cadastro[l].datanasc.mes);
        fprintf(arqtxt, "%d\n", cadastro[l].datanasc.ano);
        fprintf(arqtxt, "%s", cadastro[l].doencas);
    }
    fclose(arqtxt);
    return;
}
void carregar(){
    char word[100];
    int aux=0;
    arqtxt = fopen("cadastro.txt", "rt");
    fseek(arqtxt, 1, SEEK_SET);
    while(!feof(arqtxt)) { 
        Cliente c;
        fscanf(arqtxt, "%s", &c.nome);
        fscanf(arqtxt, "\n%c", &c.sexo);
        fscanf(arqtxt, "\n%d", &c.datanasc.dia);
        fscanf(arqtxt, "\n%d", &c.datanasc.mes);
        fscanf(arqtxt, "\n%d", &c.datanasc.ano);
        fscanf(arqtxt, "\n%s", &c.doencas);
        aux++;
        
        cadastro = (Cliente *) realloc(cadastro, (total+1)*sizeof(Cliente) );
        cadastro[total] = c;
        total++;
    }
    
    fclose(arqtxt);
    return;
}
int main_opt(){
    int op;
    while(1){
        op = menu();
        switch (op){
            case 1:
                cadastrar();break;
            case 2:
                listar();break;
            case 3:
                buscar();break;
            case 4:
                excluir();break;
            case 5:
                salvar();
                break;
            case 6:
                exit(0);
        }
    }
}

 int main() {
     
     char palavra[100];
     again: arqtxt = fopen("cadastro.txt", "rt");
     if (arqtxt == NULL) {
        printf("Não foi encontrado arquivo. Criando...\n");
        arqtxt = fopen("cadastro.txt", "wt");
        fputs("0", arqtxt);
        fclose(arqtxt);
        goto again;
     }else{
         fseek(arqtxt, 0, SEEK_SET);
         
        fscanf(arqtxt, "%s", &palavra);

        printf("Quantidade de registros %d\n",strcmp(palavra, "0") );
        // quando da erro ele passa a ler como se tivessem 96 registros
        if ((strcmp(palavra, "0")==96) ){

            fclose(arqtxt);
            int ret = remove("cadastro.txt");
            printf("Arquivo com problema\n");
            goto again;
        }else{
            if((strcmp(palavra, "0"))){
                printf("Carregando cadastros do arquivo\n");
                carregar();   
            }
                main_opt();
        }
        
            
        
            
         printf("Programa finalizado.\n");
        
     }
     return 0;
 }
