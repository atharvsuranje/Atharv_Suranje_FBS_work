#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "Abaacd";
    char *ptr = strchr(str, 'a');
    if (ptr != NULL)
        printf("Found at position: %d\n", ptr - str);
}
