#include <stdio.h>

void ageClassification();
void main() {
    ageClassification();
}
void ageClassification(){
    int age;
    printf("Enter the age :: ");
    scanf("%d", &age);
    if(age<12) printf("CHILD");
    else if(age>=12 && age<=19) printf("TEENAGER");
    else if(age>19 && age<60) printf("ADULT");
    else printf("SENIOR");

}
