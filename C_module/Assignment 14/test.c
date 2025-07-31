#include <stdio.h>
#include <string.h>

struct Student{
    int rollNo;
    char name[20];
    int marks;
};

void main() {
    struct Student S1,S2,S3;
    printf("Enter rollNo,name,marks of Student 1 : ");
    scanf("%d %s %d",&S1.rollNo,&S1.name,&S1.marks);
    printf("Enter rollNo,name,marks of Student 2 : ");
    scanf("%d %s %d",&S2.rollNo,&S2.name,&S2.marks);
    printf("Enter rollNo,name,marks of Student 3 : ");
    scanf("%d %s %d",&S3.rollNo,&S3.name,&S3.marks);
    printf("Details of Student 1 : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d",S1.rollNo,S1.name,S1.marks);
    printf("\nDetails of Student 2 : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d",S2.rollNo,S2.name,S2.marks);
    printf("\nDetails of Student 3 : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d",S3.rollNo,S3.name,S3.marks);
}