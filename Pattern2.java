
public class Pattern2 {

	public static void main(String[] args) {
		int row = 7;
		for(int i=1;i<row+1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}

//output
/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 

*/