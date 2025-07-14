#include <stdio.h>

void isArmstrong();
void main() {
    isArmstrong();
}
void isArmstrong(){
    int n = 153, temp = n, sum = 0;
    for(n;n>0;n/=10){
        int digit = n % 10;
        sum += digit*digit*digit; 
    }
    // while (n > 0) {
    //         int digit = n % 10;
    //         sum += digit*digit*digit;
    //         n /= 10;
    //     }
    if (sum == temp)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");

}
