Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK

CODE START FROM HERE

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int m;
        char c;
        for(int i=1;i<=N;i++)
        {            m=64+i;
                     c=(char)m;
                     for(int j=0;j<i;j++)
                    {    
                        System.out.print(c);
                        c++;
                    }   
        System.out.println("");
        }

		
	}

}
