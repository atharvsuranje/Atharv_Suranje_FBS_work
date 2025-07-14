#include <stdio.h>

int isArmstrong();
void main() {
    int n = 153;
    int flag=isArmstrong(n);
    if (flag) printf("Armstrong\n");
    else printf("Not Armstrong\n");
}

int isArmstrong(int n){
    int temp = n, sum = 0;
    for(n;n>0;n/=10){
        int digit = n % 10;
        sum += digit*digit*digit; 
    }
    // while (n > 0) {
    //         int digit = n % 10;
    //         sum += digit*digit*digit;
    //         n /= 10;
    //     }
    if (sum == temp) return 1;
    else return 0;
}