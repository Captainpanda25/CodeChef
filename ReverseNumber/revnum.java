import java.util.*;

public class revnum {

	public static void main(String[] args) {
		int t,n,s,i;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			n=in.nextInt();
			int j;
			char[] ch=(""+n).toCharArray();
			char[] re=(""+n).toCharArray();
			for(i=ch.length-1,j=0;i>=0;i--,j++)
			{
				re[j]=ch[i];
			}
		//	System.out.println(re);
			s=Integer.parseInt(String.valueOf(re));
			System.out.println(s);
		}

	}

}
