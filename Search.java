import java.util.Scanner;
public class Search {
public static void main(String[] args)
{
	int n,count=0;
	int []arr=new int[] {1,4,6,7,8,9,10};
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int first=0;
	int last=6;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(arr[middle]==n)
		{
		System.out.print(n+" is found at position "+(middle+1));
		break;
		}
		else if(arr[middle]<n)
			first=middle+1;
		else
			last=middle-1;
		middle=(first+last)/2;
	}
	if(first>last)
	{
		System.out.print(n+" is not found in array");
	}
}
}
