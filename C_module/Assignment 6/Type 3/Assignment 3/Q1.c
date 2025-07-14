#include <stdio.h>

void series(int);
void main() {
    int i=1;
    series(i);
}

void series(int i){
    for (i; i <= 10; i++)
    {
        printf("%d ",i);
    }
    // printf("\n");
    // int j=1;
    // while(j<=10){
    //     printf("%d ",j);
    //     j++;
    // } 
}