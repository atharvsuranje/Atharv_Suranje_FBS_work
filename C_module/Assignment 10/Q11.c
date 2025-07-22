#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void main() {
    char str[] = "Hello Copy";
    char *copy = strdup(str);
    printf("Duplicate: %s\n", copy);
    free(copy);
}
