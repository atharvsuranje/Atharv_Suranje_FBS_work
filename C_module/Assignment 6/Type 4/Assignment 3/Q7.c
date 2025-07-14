#include <stdio.h>

int factorial(int);
void main() {
    int n = 5;
    printf("factorial is %d\n", factorial(n));
}

int factorial(int n){
    int fact = 1;
    for (int i = 1; i <= n; i++) fact *= i;
    
    // int j=1;
    // while(j<=n){
    //     fact *= j;
    //     j++;
    // }
    // printf("%d\n", fact);
    return fact;
}
