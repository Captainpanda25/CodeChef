import java.util.*;
public class sod {

	public static void main(String[] args) {
		int t,n,c;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			c=0;
			n=in.nextInt();
			while(n>0)
			{
				c+=n%10;
				n=n/10;
			}
			System.out.println(c);
		}
	}

}
