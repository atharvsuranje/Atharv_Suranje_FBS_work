#include <stdio.h>
#include <string.h>

void main() {
    char src[] = "Hello World";
    char dest[20];
    strncpy(dest, src, 7);
    dest[7] = '\0';
    printf("Copied till index of 7: %s\n", dest);
}
