#include <stdio.h>

void main() {
    int start=10,end=20;
    printf("Enter the start and end :: ");
    scanf("%d %d",&start,&end);
    int sum=0;
    for(int i=start;i<=end;i=i+2){
        sum=sum+i;
    }
    printf("SUM is :: %d",sum);
}