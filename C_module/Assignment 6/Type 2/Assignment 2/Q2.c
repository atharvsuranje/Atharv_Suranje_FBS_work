#include <stdio.h>

int triangleType();
void main() {
    int flag=triangleType();
    if (flag==3) printf("The triangle is Equilateral.\n");
    else if(flag==2) printf("The triangle is Isosceles.\n");
    else if(flag==1) printf("The triangle is Scalene.\n");
    else printf("The given sides do not form a valid triangle.\n");
}

int triangleType(){
    int side1, side2, side3;
    printf("Enter three sides of the triangle: ");
    scanf("%d %d %d", &side1, &side2, &side3);
    
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        if (side1 == side2 && side2 == side3) return 3;
        else if (side1 == side2 || side2 == side3 || side1 == side3) return 2;
        else return 1;            
    } 
    else return 0;

}
