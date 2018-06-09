import java.util.Scanner;
public class Reverse {
public static int isReverse(int n)
{
	int rem,rev=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rem+rev*10;
		n=n/10;
	}
	return rev;
}
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int num=isReverse(n);
	System.out.print("Reverse of a number is "+num);
}
}
