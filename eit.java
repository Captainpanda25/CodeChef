import java.util.*;

public class eit {

	public static void main(String[] args) {
		int n,k,t,c;
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		c=0;
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			if(t%k==0)
				c++;
		}
		System.out.println(c);
	}

}
