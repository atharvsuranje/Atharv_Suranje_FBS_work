#include <stdio.h>

void primeRange(int*);
void main() {
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);

    printf("Prime numbers from 1 to %d :: ", n);
    primeRange(&n);

}
void primeRange(int *n){
    for (int num = 2; num <= *n; num++) {
        int isPrime = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime) printf("%d ", num);
    }
}