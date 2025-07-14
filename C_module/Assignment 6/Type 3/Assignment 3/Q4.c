#include <stdio.h>

void isPrime(int);
void main() {
    int num=7;
    isPrime(num);
}

void isPrime(int num){
    int flag=1;
    for(int i=2;i<= num/2;i++){
        if(num%i==0){
            flag=0;
            break;
        }
    }
    // int j=2;
    // while(j<=num/2){
    //     if(num%j==0){
    //         flag=0;
    //         break;
    //     }
    //     j++;
    // }
    if(flag==1) printf("PRIME");
    else printf("NON-PRIME");
}