#include <stdio.h>

int isPerfect(int);
void main() {
    int n = 28;
    int flag=isPerfect(n);
    if(flag) printf("Perfect\n");
    else printf("Not Perfect\n");
}

int isPerfect(int n){
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) sum += i;
    }
    // int j=1;
    // while (j<n)
    // {
    //     if (n % j == 0) sum += j;
    //     j++;
    // }
    
    if (sum == n) return 1;
    else return 0;
}