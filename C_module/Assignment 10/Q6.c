#include <stdio.h>
#include <string.h>

int main() {
    char str1[20] = "Hi ";
    char str2[] = "there!";
    strncat(str1, str2, 3);
    printf("Result concatenated till 3rd index of str2: %s\n", str1); 
    return 0;
}
