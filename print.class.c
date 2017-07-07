#include<stdio.h>
#include<conio.h>
int main()
{
int n;
int i;
for(i=0;i<10; i++){
    printf("%d", i);  // print numbers one by one
    if (0 == i % 3)
        printf("\n"); // start new line if current number is divisible by 3}
else
{
printf("the entered number is out of range");
}
}
