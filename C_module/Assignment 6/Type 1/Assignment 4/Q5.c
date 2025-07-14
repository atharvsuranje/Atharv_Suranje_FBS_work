#include <stdio.h>

void isEven();
void isPrime();
void isPalindrome();
void posiNeg();
void reverse();
void digitSum();
int num;
void main()
{
    int choice;

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

    if (choice == 1) isEven();

    else if (choice == 2) isPrime();

    else if (choice == 3) isPalindrome();

    else if (choice == 4) posiNeg();

    else if (choice == 5) reverse();

    else if (choice == 6) digitSum();

    else
        printf("Invalid choice.\n");
}

void isEven(){
    if (num % 2 == 0) printf("Even\n");
    else printf("Odd\n");
}

void isPrime(){
    int isPrime = 1;
    if (num <= 1) isPrime = 0;
    else
    {
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime) printf("Prime\n");
    else printf("Not Prime\n");
}

void isPalindrome(){
    int temp = num, rev = 0;
    while (temp != 0){
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }
    if (rev == num) printf("Palindrome\n");
    else printf("Not Palindrome\n");
}

void posiNeg(){
    if (num > 0) printf("Positive\n");
    else if (num < 0) printf("Negative\n");
    else printf("Zero\n");
}

void reverse(){
    int rev = 0, temp = num;
        while (temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        printf("Reversed Number = %d\n", rev);
}

void digitSum(){
    int sum = 0, temp = (num < 0) ? -num : num;
        while (temp != 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        printf("Sum of digits = %d\n", sum);
}
