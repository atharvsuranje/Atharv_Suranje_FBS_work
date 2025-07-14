#include <stdio.h>

void armstrongRange(int*);
void main() {
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);
    armstrongRange(&n);

}
void armstrongRange(int* n){
    
    for (int num = 1; num <= *n; num++) {
        int temp = num, count = 0;
    
        while (temp != 0) {
            count++;
            temp /= 10;
        }
    
        temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) power *= digit;
            sum += power;
            temp /= 10;
        }
    
        if (sum == num) printf("%d ", num);
    }

}
