#include <stdio.h>

void main() {
    int start,end;
    printf("Enter the start and end :: ");
    scanf("%d %d",&start,&end);
    if((start%2)==0){
        printf("EVEN :: ");
        for(int i=start;i<=end;i+=2){
            printf("%d ",i);
        }
        printf("\nODD :: ");
        for(int i=start+1;i<=end;i+=2){
            printf("%d ",i);
        }
    }
    else{
        printf("EVEN :: ");
        for(int i=start+1;i<=end;i+=2){
            printf("%d ",i);
        }
        printf("\nODD :: ");
        for(int i=start;i<=end;i+=2){
            printf("%d ",i);
        }
    }
} 