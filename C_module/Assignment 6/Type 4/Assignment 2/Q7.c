#include <stdio.h>

int ageClassfication(int);
void main() {
    int age;
    printf("Enter the age :: ");
    scanf("%d", &age);
    int flag=ageClassfication(age);
    if(flag==1) printf("CHILD");
    else if(flag==2) printf("TEENAGER");
    else if(flag==3) printf("ADULT");
    else printf("SENIOR");
}

int ageClassfication(int age){
    if(age<12) return 1;
    else if(age>=12 && age<=19) return 2;
    else if(age>19 && age<60) return 3;
    else return 4;
}