import java.math.BigInteger;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int t,n;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			n=in.nextInt();
			BigInteger fact = BigInteger.valueOf(1);
			for(int i=1;i<=n;i++)
			{
				fact=fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}
}
