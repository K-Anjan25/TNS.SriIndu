package com.tnsif.java.day8;

public class multiarr {
	public static void main(String [] args) {
		int[][] nums=new int[4][3];
		//nums[0][0]=1;
		//nums[0][1]=2;
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
}
