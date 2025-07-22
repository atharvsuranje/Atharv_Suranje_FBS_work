#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "abcde123";
    char str2[] = "abc";
    int len = strspn(str1, str2); //checks from 1st char of str1 and returns length where the mismatch begins 
    printf("Span length: %d\n", len);
}
