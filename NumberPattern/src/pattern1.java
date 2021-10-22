public class pattern1 {

	public static void main(String[] args) {

		int row=3;
        
		
		for(int i=0;i<row;i++) {
			for(int j=i;j<row-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print(i+k+1);
			}
			System.out.println("");
		}

	}

}

//sample output

/*

  1
 234
34567

*/