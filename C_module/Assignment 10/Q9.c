#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "Abaacd";
    char *ptr = strrchr(str, 'a');
    if (ptr != NULL)
        printf("Last 'a' at: %ld\n", ptr - str);
}
