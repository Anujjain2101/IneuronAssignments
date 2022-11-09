
public class LaunchBS { // BubbleSort/SinkingSort/ExchangeSort

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,7,5,3,2,1,4,6};
		for(int i=0; i<a.length;i++) 
		{
			for(int j=1; j<a.length-i;j++) 
			{
				if(a[j]<a[j-1]) 
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int elm:a) 
		{
			System.out.print(elm);
		}

	}

}
