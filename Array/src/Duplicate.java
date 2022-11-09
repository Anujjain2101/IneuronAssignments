
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 3, 8, 7, 9, 2, 1};
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);
				}
			}
		}
	}
}
