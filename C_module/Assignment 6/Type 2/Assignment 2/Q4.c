#include <stdio.h>

int markClassification();
void main() {
    int flag=markClassification();
    if(flag==4) printf("Distinction");
    else if (flag==3) printf("Pass Class");
    else if (flag==2) printf("Second Class");
    else if (flag==1) printf("First Class");
    else printf("Fail");
}

int markClassification(){
    int marks;
    printf("Enter the Marks :: ");
    scanf("%d", &marks);
    if(marks>=75) return 4;
    else if (marks<75 && marks>=65) return 1;
    else if (marks<65 && marks>=55) return 2;
    else if (marks<55 && marks>=40) return 3;
    else return 0;

}