#include <stdio.h>
#include <string.h>

struct Admin{
    int id,salary,allowance;
    char name[20];
};

void main() {
    struct Admin A1,A2;
    A1.id=101,strcpy(A1.name,"abc"),A1.salary=6000,A1.allowance=500;
    printf("Enter id,name,salary,allowance of Admin 2 : ");
    scanf("%d %s %d %d",&A2.id,&A2.name,&A2.salary,&A2.allowance);
    printf("Details of Admin 1 : \n");
    printf("id : %d\nName : %s\nsalary : %d\nallowance : %d",A1.id,A1.name,A1.salary,A1.allowance);
    printf("\nDetails of Admin 2 : \n");
    printf("id : %d\nName : %s\nsalary : %d\nallowance : %d",A2.id,A2.name,A2.salary,A2.allowance);
}