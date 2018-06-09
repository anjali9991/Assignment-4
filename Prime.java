import java.util.Scanner;
public class Prime {
public static void isPrime(int n)
{
	for(int i=1;i<=n;i++)
	{
		int count=0;
		for(int j=1;j<=n;j++)
		{
		if(i%j==0)
		{
			count++;
		}
		}
		if(count==2)
			System.out.println(i);
	}
}
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	isPrime(n);
}
}
