#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "abc", str2[] = "abc", str3[] = "abzz";
    printf("Res :: %d",strcmp(str3, str1));
    if (strcmp(str1, str2) == 0)
        printf("Equal\n");
    else
        printf("Not Equal\n");

        
    if (strcmp(str1, str3) == 0)
        printf("Equal\n");
    else
        printf("Not Equal\n");
}
