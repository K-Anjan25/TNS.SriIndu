package com.tnsif.java.day8;

public class JaggedArray {
	
	public static void main(String [] args) {
		/*int[][] jagged=new int[3][];
		jagged[0] = new int[3];
		jagged[1] = new int[4];
		jagged[2] = new int[2]; */
		
		int[][] jagged = {{1,2,3},{4,5,6,7},{8,9}};
		
		/* for(int i=0;i<3;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println(); 
		} */
		
		for(int[] i:jagged) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
