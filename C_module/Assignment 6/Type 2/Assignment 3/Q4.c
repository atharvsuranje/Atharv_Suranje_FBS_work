#include <stdio.h>

int isPrime();
void main() {
    if(isPrime()) printf("PRIME");
    else printf("NON-PRIME");
}

int isPrime(){
    int num=7,flag=1;
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
    if(flag==1) return 1;
    else return 0;
}