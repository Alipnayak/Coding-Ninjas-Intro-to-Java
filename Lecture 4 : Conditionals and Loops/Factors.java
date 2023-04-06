Factors
Send Feedback
Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
Sample Output 2 :



Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only

CODE START FROM HERE

import java.util.Scanner;
public class Solution {
    
    public static boolean isprime(int n,int value)
    {
      
        boolean prime=true;
        int i=1;
        while((n%i==0) && (i<=value))
        {
            prime=false;
            i++;
        }
              return prime;
    }
              
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=n/2;
        if(isprime(n,value))
        {
            System.out.print("");
        }
        else
        {
            for(int i=2; i<=value; i++)
            {
                if(n%i==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
        
    
        // Write your code here
        
    }
}
