import java.util.*;
public class atm {

	public static void main(String[] args) {
		float x,y;
		Scanner in =new Scanner(System.in);
		x=in.nextFloat();
		y=in.nextFloat();
		if(x<=y-0.5)
		{
			if(x%5==0) {
				y-=x+0.5;
			}
		}
		System.out.println(y);
	}

}
