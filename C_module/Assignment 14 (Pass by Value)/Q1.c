#include <stdio.h>
#include <string.h>

struct Student{
    int rollNo;
    char name[20];
    int marks;
};

struct Student storeData(){
    struct Student temp;
    printf("Enter rollNo,name,marks of Student : ");
    scanf("%d %s %d",&temp.rollNo,&temp.name,&temp.marks);
    return temp;
}

struct Student displayData(struct Student temp){
    printf("Details of Student : \n");
    printf("Roll No : %d\nName : %s\nMarks : %d\n",temp.rollNo,temp.name,temp.marks);
}

void main() {
    struct Student S1,S2;
    S1=storeData();
    S2=storeData();
    displayData(S1);
    displayData(S2);
}

