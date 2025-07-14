#include <stdio.h>

int isPrime(int);
void main() {
    int num=9;
    int flag=isPrime(num);
    if(flag) printf("PRIME");
    else printf("NON-PRIME");
}

int isPrime(int num){
    int flag=1;
    for(int i=2;i<= num/2;i++){
        if(num%i==0){
            flag=0;
            break;
        }
    }
    return flag;
    // int j=2;
    // while(j<=num/2){
    //     if(num%j==0){
    //         flag=0;
    //         break;
    //     }
    //     j++;
    // }
}