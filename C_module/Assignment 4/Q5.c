#include <stdio.h>

void main() {
    int choice, num;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nChoose an operation:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Sum of Digits\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    if (choice == 1) {
        if (num % 2 == 0)
            printf("Even\n");
        else
            printf("Odd\n");
    }

    else if (choice == 2) {
        int isPrime = 1;
        if (num <= 1)
            isPrime = 0;
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        if (isPrime) printf("Prime\n");
        else printf("Not Prime\n");
    }

    else if (choice == 3) {
        int temp = num, rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == num) printf("Palindrome\n");
        else printf("Not Palindrome\n");
    }

    else if (choice == 4) {
        if (num > 0) printf("Positive\n");
        else if (num < 0) printf("Negative\n");
        else printf("Zero\n");
    }

    else if (choice == 5) {
        int rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        printf("Reversed Number = %d\n", rev);
    }

    else if (choice == 6) {
        int sum = 0, temp = (num < 0) ? -num : num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        printf("Sum of digits = %d\n", sum);
    }

    else printf("Invalid choice.\n");
}
