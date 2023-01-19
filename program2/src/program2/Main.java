package program2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 4;
			
			 for (int i = 1; i <= n; i++) {
			      //Loop to iterate over each column
			      for (int j = 1; j <= i; j++) {
			        System.out.print(j + " ");
			      }
	
			      //Loop to iterate over each column in reverse order
			      for (int j = i - 1; j >= 1; j--) {
			        System.out.print(j + " ");
			      }
			      System.out.println();
			    }
	} 

}
