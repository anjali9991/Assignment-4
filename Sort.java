
public class Sort {
public static void main(String[] args)
{
	int temp;
	int[] arr=new int[] {1,1,1,1,0,0,1,0};
	for(int i=0;i<8;i++)
	{
		for(int j=i;j<8;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<8;i++)
		System.out.print(arr[i]);
}
}
