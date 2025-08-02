#include <stdio.h>
#include <string.h>

struct Product{
    char name[50];
    float price;
};

void main() {
    struct Product items[5] ={
        {"Pen", 10.0},
        {"Notebook", 45.0},
        {"Pencil", 5.0},
        {"Eraser", 3.0},
        {"Scale", 12.0}
    };
    int choice, qty;
    float total = 0;
    char cont = 'y';
    while (cont == 'y' || cont == 'Y'){
        printf("\n===== Menu =====\n");
        printf("1. Pen - 10.00\n");
        printf("2. Notebook - 45.00\n");
        printf("3. Pencil - 5.00\n");
        printf("4. Eraser - 3.00\n");
        printf("5. Scale - 12.00\n");
        printf("Enter the item number to add to cart: ");
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 5){
            printf("Enter quantity for %s: ", items[choice - 1].name);
            scanf("%d", &qty);
            total = total+items[choice-1].price*qty;
        } 
        else{
            printf("Invalid choice! Please select a valid item number.\n");
        }

        printf("Do you want to add more items? (y/n): ");
        scanf(" %c",&cont);
    }

    printf("\nTotal Bill: %.2f\n",total);
}
