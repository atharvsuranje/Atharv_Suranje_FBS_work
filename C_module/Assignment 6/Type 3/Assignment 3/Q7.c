#include <stdio.h>

void factorial(int);
void main() {
    int n = 5;
    factorial(n);
}

void factorial(int n){
    int fact = 1;
    for (int i = 1; i <= n; i++) fact *= i;
    
    // int j=1;
    // while(j<=n){
    //     fact *= j;
    //     j++;
    // }
    // printf("%d\n", fact);
    printf("factorial is %d\n", fact);

}
