#include <stdio.h>

void table(int*);
void main() {
    int num=5;
    table(&num);
}

void table(int* num){
    for (int i=1; i <= 10; i++)
    {
        printf("%d ",i * (*num));
    }
    // printf("\n");
    // int j=1;
    // while(j<=10){
    //     printf("%d ",j);
    //     j++;
    // }
    
}