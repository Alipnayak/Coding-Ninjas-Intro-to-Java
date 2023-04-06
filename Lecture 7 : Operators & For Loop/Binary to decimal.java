Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
  
  ______________________________________________________
  
  import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int sum = 0, two = 1, place;
        // int count=0;

        while (binary != 0) {
            place = binary % 10;
            sum = sum + (place * two);

            two *= 2;
            binary /= 10;
        }

        System.out.println(sum);

	}
}
