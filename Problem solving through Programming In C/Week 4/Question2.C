#include<stdio.h>
int main()
{
    int a,b,c; 
    scanf("%d %d %d",&a, &b, &c); /*The length of three sides are entered from the test cases */
 
/* Complete the program. Copy and paste from the printf statements mentioned below wherever required for printing the outputs 

printf("Triangle is not possible");
printf("Right-angle Triangle");
printf("Isosceles Triangle");
printf("Equilateral Triangle");
printf("Scalene Triangle");

*/

if((a<b+c) && (b<a+c) && (c<a+b))
{
  if(a==b && b==c && c==a)
    printf("Equilateral Triangle");
  else if(a==b || a==c || b==c)
    printf("Isosceles Triangle");
  else if((a*a==b*b+c*c) || (b*b==c*c+a*a) || (c*c==a*a+b*b))
    printf("Right-angle Triangle");
  else if(a!=b && a!=c && b!=c)
    printf("Scalene Triangle");
}
else
  printf("Triangle is not possible");
return 0;
}
