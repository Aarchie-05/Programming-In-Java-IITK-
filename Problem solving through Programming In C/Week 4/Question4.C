#include <stdio.h>
int main()
{

int N, First_digit, Last_digit;

scanf("%d", &N); //The number is accepted from the test case

Last_digit = N%10;
while(N!=0){
  First_digit = N%10;
  N=N/10;
}

printf("Sum of First and Last digit = %d", First_digit + Last_digit);

return 0;
}
