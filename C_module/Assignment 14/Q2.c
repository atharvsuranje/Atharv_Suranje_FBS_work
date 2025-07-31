#include <stdio.h>
#include <string.h>

struct Employee{
    int id;
    char name[20];
    int salary;
};

void main() {
    struct Employee E1,E2;
    E1.id=101,strcpy(E1.name,"abc"),E1.salary=6000;
    printf("Enter id,name,salary of Employee 2 : ");
    scanf("%d %s %d",&E2.id,&E2.name,&E2.salary);
    printf("Details of Employee 1 : \n");
    printf("id : %d\nName : %s\nsalary : %d",E1.id,E1.name,E1.salary);
    printf("\nDetails of Employee 2 : \n");
    printf("id : %d\nName : %s\nsalary : %d",E2.id,E2.name,E2.salary);
}