#include <stdio.h>

int mystrcspn(char*,char*);
int main() {
    char str1[20];
    char str2[20];
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    int result = mystrcspn(str1, str2);
    printf("Length of segment before any match: %d\n", result);

    return 0;
}

int mystrcspn(char* str1,char* str2){
    int i = 0;

    while (str1[i] != '\0') {
        int j = 0;
        while (str2[j] != '\0') {
            if (str1[i] == str2[j]) return i;
            j++;
        }
        i++;
    }
    return i;
}

