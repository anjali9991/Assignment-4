import java.util.Scanner;
public class isArmstrong {
	public static void armstrong(int n)
	{
		int rem,rev=0,revv,a;
		a=n;
		while(n!=0)
		{
			rem=n%10;
			rem=rem*rem*rem;
			rev=rem+rev;
			n=n/10;
		}
		if(a==rev)
			System.out.print(a+" is a armstrong number");
		else
			System.out.print(a+" is not a armstrong number");
	}
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	armstrong(n);
}
}
