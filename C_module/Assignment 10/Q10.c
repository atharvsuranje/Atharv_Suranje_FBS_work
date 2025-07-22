#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "Hello World";
    char *ptr = strstr(str, "Hell");
    if (ptr != NULL)
        printf("Substring starts at: %ld\n", ptr - str);
}
