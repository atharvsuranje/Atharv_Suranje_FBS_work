#include <stdio.h>

int isEven();
void main() {
    if(isEven()) printf("EVEN");
    else printf("ODD");
}

int isEven(){
    int num;
    printf("Enter the num :: ");
    scanf("%d",&num);
    if(num%2 == 0) return 1;
    else return 0;
}