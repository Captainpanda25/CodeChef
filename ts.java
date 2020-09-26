import java.util.*;

public class ts {

	public static void main(String[] args) {
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		int a[]=new int[t];
		for(int i=0;i<t;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<t;i++)
		{
			System.out.println(a[i]);
		}
	}

}
