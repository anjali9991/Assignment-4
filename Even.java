import java.util.Scanner;
public class Even {

	public static void isEven(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		isEven(n);
	}
}
