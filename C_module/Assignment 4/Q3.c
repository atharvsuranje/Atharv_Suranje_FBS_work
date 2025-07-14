#include <stdio.h>

void main() {
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);

    printf("Perfect numbers from 1 to %d:\n", n);

    for (int num = 1; num <= n; num++) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }

        if (sum == num) printf("%d ", num);
    }
}
