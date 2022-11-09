import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] ar = new int[3];
		int key;
		boolean flag=false;
		
		System.out.print("enter your numbers: ");
		for(int i=0; i<ar.length;i++) 
		{
			ar[i]= scan.nextInt();
		}
		System.out.println("enter number to search: ");
		key = scan.nextInt();
		//System.out.println("Your array");
		
		 for(int i=0; i<ar.length;i++) 
		 { 
			 if(ar[i]==key) {
				 System.out.println("Key "+key+" is present in index:" +i);
				 flag=true;
				 break;
			 }
			 
		 }
		 if(flag==false)
		 System.out.println("Key not present");
		 
		 
		 
		/*for(int pr:ar) 
		{
			System.out.print(pr+" ");
		}*/
		scan.close();
	}

}
