#include <stdio.h>
#include <string.h>

struct HR{
    int id,salary,commission;
    char name[20];
};

void main() {
    struct HR HR1,HR2;
    HR1.id=101,strcpy(HR1.name,"abc"),HR1.salary=6000,HR1.commission=500;
    printf("Enter id,name,salary,commission of HR 2 : ");
    scanf("%d %s %d %d",&HR2.id,&HR2.name,&HR2.salary,&HR2.commission);
    printf("Details of HR 1 : \n");
    printf("id : %d\nName : %s\nsalary : %d\ncommission : %d",HR1.id,HR1.name,HR1.salary,HR1.commission);
    printf("\nDetails of HR 2 : \n");
    printf("id : %d\nName : %s\nsalary : %d\ncommission : %d",HR2.id,HR2.name,HR2.salary,HR2.commission);
}