#include <stdio.h>

void perfectRange(int);
void main() {
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);

    printf("Perfect numbers from 1 to %d :: ", n);
    perfectRange(n);
}
void perfectRange(int n){
    for (int num = 1; num <= n; num++) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
    
        if (sum == num) printf("%d ", num);
    }
}