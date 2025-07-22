#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "abcdef", str2[] = "abcxyz";
    if (strncmp(str1, str2, 3) == 0)
        printf("First 3 chars are same\n");
    else
        printf("First 3 chars are different\n");
}
