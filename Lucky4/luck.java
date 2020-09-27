import java.util.*;

public class luck {

	public static void main(String[] args) {
		int t,n,s,i;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			int c=0;
			n=in.nextInt();
			char[] ch=(""+n).toCharArray();
			for(i=0;i<ch.length;i++)
			{
				s=Integer.parseInt(String.valueOf(ch[i]));
				if(s==4)
					c++;
			}
			System.out.println(c);
		}
	}

}
