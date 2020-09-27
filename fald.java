import java.util.Scanner;

public class fald {

	public static void main(String[] args) {
		int t,n,s;
		Scanner in =new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
		{
			n=in.nextInt();
			s=0;
			char[] ch = ("" + n).toCharArray();
			s=Integer.parseInt(String.valueOf(ch[0]))+Integer.parseInt(String.valueOf(ch[ch.length-1]));
			System.out.println(s);
		}

	}

}
