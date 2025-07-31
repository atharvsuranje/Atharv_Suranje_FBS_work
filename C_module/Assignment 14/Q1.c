#include <stdio.h>
#include <string.h>

struct Student{
    int rollNo;
    char name[20];
    int marks;
};

void main() {
    struct Student S1,S2;
    S1.rollNo=101,strcpy(S1.name,"abc"),S1.marks=60;
    printf("Enter rollNo,name,marks of Student 2 : ");
    scanf("%d %s %d",&S2.rollNo,&S2.name,&S2.marks);
    printf("Details of Student 1 : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d",S1.rollNo,S1.name,S1.marks);
    printf("\nDetails of Student 2 : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d",S2.rollNo,S2.name,S2.marks);
}