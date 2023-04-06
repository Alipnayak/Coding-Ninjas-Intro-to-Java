Code : Mirror Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4

      1
    12
  123
1234

Input format :

Integer N (Total no. of rows)

Output format :

Pattern in N lines

Sample Input :

3

Sample Output :

      1 
    12
  123


___________________________________________________________________________________________________________


import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

          Scanner scr = new Scanner(System.in);
       int n = scr.nextInt();
       int i = 1;
       
       while( i<=n ){
           int Start = 1;
           int j =1;
           while( j <= n - i ){
               System.out.print(" ");
             j++;
           }
           while(j<=n){
               System.out.print(Start);
               Start++;
               j++;
           }
           System.out.println();
           i++;
       }
		
	}

}
