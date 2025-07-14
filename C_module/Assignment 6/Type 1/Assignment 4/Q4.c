#include <stdio.h>

int n;
void strongRange();
void main() {
    printf("Enter upper limit: ");
    scanf("%d", &n);

    printf("Strong numbers from 1 to %d:\n", n);
    strongRange();
}
void strongRange(){
    for (int num = 1; num <= n; num++) {
        int temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }

        if (sum == num) printf("%d ", num);
    }
}