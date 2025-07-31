#include <stdio.h>
#include <string.h>

struct SalesManager{
    int id,salary,incentive,target;
    char name[20];
};

void main() {
    struct SalesManager SM1,SM2;
    SM1.id=101,strcpy(SM1.name,"abc"),SM1.salary=6000,SM1.incentive=500,SM1.target=10;
    printf("Enter id,name,salary,incentive,target of HR 2 : ");
    scanf("%d %s %d %d %d",&SM2.id,&SM2.name,&SM2.salary,&SM2.incentive,&SM2.target);
    printf("Details of HR 1 : \n");
    printf("id : %d\nName : %s\nsalary : %d\nincentive : %d\ntarget : %d",SM1.id,SM1.name,SM1.salary,SM1.incentive,SM1.target);
    printf("\nDetails of HR 2 : \n");
    printf("id : %d\nName : %s\nsalary : %d\nincentive : %d\ntarget : %d",SM2.id,SM2.name,SM2.salary,SM2.incentive,SM2.target);
}