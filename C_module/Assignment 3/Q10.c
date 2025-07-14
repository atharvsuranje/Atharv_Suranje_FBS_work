#include <stdio.h>

void main() {
    int n = 12345, last = n % 10, first;

    for(n;n>=10;n/=10);
  // while (n >= 10) n /= 10;
    first = n;
    printf("Sum = %d\n", first + last);
}
