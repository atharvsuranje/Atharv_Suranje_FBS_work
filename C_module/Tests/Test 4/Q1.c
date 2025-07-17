#include <stdio.h>

void main() {
    int start,end;
    printf("Enter start and end of range :: ");
    scanf("%d %d",&start,&end);
    for(int i=start;i<=end;i++){
        printf("Factors of %d are :: ",i);
        for(int j=1;j<=i;j++){
            if(i%j==0) printf("%d ",j);
        }
        printf("\n");
    }
}