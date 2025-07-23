#include <stdio.h>

int mystrspn(char*,char*);
void main() {
    char str1[20];
    char str2[20];
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    int result = mystrspn(str1, str2);
    printf("Length of initial part: %d\n", result);
} 

int mystrspn(char* str1,char* str2){
    int count = 0,i = 0;
    while(str1[i] != '\0'){
        int j=0,found=0;
        while(str2[i] != '\0'){
            if(str1[i] == str2[j]){
                found=1;
                break;
            }
            j++;
        }

    }

    while (str1[i] != '\0') {
        int j = 0;
        int found = 0;
        while (str2[j] != '\0') {
            if (str1[i] == str2[j]) {
                found = 1;
                break;
            }
            j++;
        }
        if (found) count++;
        else break;
        i++;
    }
    return count;
}

