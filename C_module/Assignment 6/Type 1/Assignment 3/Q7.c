#include <stdio.h>

void factorial();
void main() {
    factorial();
}
void factorial(){
    int n = 5, fact = 1;
    for (int i = 1; i <= n; i++) fact *= i;
    
    // int j=1;
    // while(j<=n){
    //     fact *= j;
    //     j++;
    // }
    printf("%d\n", fact);

}