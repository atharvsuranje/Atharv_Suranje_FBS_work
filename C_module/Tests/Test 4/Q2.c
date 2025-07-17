#include <stdio.h>

void main() {
    int base,power,res=1;
    printf("Enter base and power :: ");
    scanf("%d %d",&base,&power);
    while (power>0)
    {
        res=res*base;
        power--;
    }
    printf("Result is :: %d",res);
}