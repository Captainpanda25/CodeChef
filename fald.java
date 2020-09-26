import java.util.Scanner;

public class fald {

	public static void main(String[] args) {
		int t,n,c,m,s;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			c=0;
			s=0;
			n=in.nextInt();
			m=n;							//Storing value of the integer in m
			if(n/10<1)
			{
				s=n;						//if n is a single digit number, simply return itself
			}
			else {
			while(n>0)
			{
				c=n%10;						//Storing each digit till we come out of loop, hence retains the last value stored(first digit)
				if(n==m)					//taking the last digit
				{
					s=c;
				}
				n=n/10;
			}
			s+=c;							//Adding the first and last digits
			}
			System.out.println(s);			//printing the sum
		}

	}

}
