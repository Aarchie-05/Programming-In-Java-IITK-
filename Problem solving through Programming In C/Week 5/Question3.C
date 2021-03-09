#include <stdio.h>
int main()
{
    int N;
    scanf("%d",&N); /* The value of N is taken from the test case data */
 
/* Complete the code.
Use the printf statements as below
printf("%d is a number that can be expressed as power of 2.",N);
printf("%d cannot be expressed as power of 2.",N);
*/

int T,f;
        
    T=N;
    f=0;
  
    while(T!=1)
    {
        if(T%2!=0){
            f=1;
            break;
        }
        T=T/2;
    }
  
    if(f==0)
        printf("%d is a number that can be expressed as power of 2.",N);
    else
        printf("%d cannot be expressed as power of 2.",N);
      
    return 0;
}
