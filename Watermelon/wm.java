import java.util.*;

public class wm {

	public static void main(String[] args) {
		int t,n,s,i;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			s=0;
			n=in.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				s+=a[i];
			}
			if(s>=0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
