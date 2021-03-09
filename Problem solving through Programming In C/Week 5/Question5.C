#include<stdio.h>
int main()
{
int N;
scanf("%d", &N); /*The value of N is taken as input from the test case */

for (int i = N; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
         printf("*");
      }
      printf("\n");
   }
   return 0;
}
