package com.programs;

public class MissingNumberArray {
	
	

	public static void main(String[] args) {
		int a[] = {2,4,6,8,12};
		int n = 0;

		int value = ( (n+1) * (n+2) ) / 2 ;
		
		//((n+1)*(n+2))/2;

		int temp = 0 ;

		for( int i = 0; i<n; i++)
		{

			temp = temp+ a[i];

			value = value-temp;


		}
		System.out.println(value);

	}

}
