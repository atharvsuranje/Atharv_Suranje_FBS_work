#include <stdio.h>

int markClassification(int);
void main() {
    int marks;
    printf("Enter the Marks :: ");
    scanf("%d", &marks);
    int flag=markClassification(marks);
    if(flag==4) printf("Distinction");
    else if (flag==3) printf("First Class");
    else if (flag==2) printf("Second Class");
    else if (flag==1) printf("Pass");
    else printf("Fail");
    
    
}

int markClassification(int marks){
    if(marks>=75) return 4;
    else if (marks<75 && marks>=65) return 3;
    else if (marks<65 && marks>=55) return 2;
    else if (marks<55 && marks>=40) return 1;
    else return 0;

}