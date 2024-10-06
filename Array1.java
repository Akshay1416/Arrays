package Array;


import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

// Array declare and initialization the statement------------------------------------------------

		//int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		// Even Elements from array-------------------------------------------------------------
		
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//			}
//
//		}
//
//  odd Elements from Array--------------------------------------------------------------------
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] % 2 != 0) {
//				System.out.println(arr[i]);
//			}
//
//		}
		
		
//Print all the elements of the array in Rivers Order--------------------------------------------
		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		
// Create a Duplicate Array for the given array(Its mean We have to create a array and we have to store the elements in to another duplicate  array )-----------------------
		
//		int []array1= {1,2,3,4,5};
//		
//		int []duplicateArray= new int[array1.length];
//		
//		for(int i=0;i<duplicateArray.length;i++) {
//			duplicateArray[i]=array1[i];
//		}
//		
//		for(int i=0;i<duplicateArray.length;i++) {
//			System.out.println(duplicateArray[i]);
//		}

//Reverse a duplicate array ----------------------------------------------------------------------------------
		
		
//		int []array1= {1,2,3,4,5};
//		
//		int []dupArrayReverse= new int[array1.length];
//
//		for(int i=array1.length-1,j=0;j<dupArrayReverse.length;i--,j++) {
//			dupArrayReverse[j]=array1[i];
//		}
//		System.out.println(Arrays.toString(dupArrayReverse));
		
		
//-------------------or Another way to  Reverse a duplicate array-------------------------------------------------
		
		
//		for(int i=array1.length-1;i>=0;i--) {
//			dupArrayReverse[array1.length-1-i]=array1[i];
//		}
//		System.out.println(Arrays.toString(dupArrayReverse));
		
		
		
		
//   Merge the elements of two array in one array----------------------------------------------------------------
		
//		int a[] = {1,2,3,4,5,};
//		int b[] = {6,7,8,9,10};
//		
//		int c[] =new int [a.length+b.length];
//		int memmory=0;
//		
//		for (int i=0;i<a.length;i++,memmory++)	{
//			c[memmory]=a[i];
//		}
//		for (int i=0;i<b.length;i++,memmory++)	{
//			c[memmory]=b[i];
//		}
//		System.out.println(Arrays.toString(c));
		
		
//-------------------or Another way to Merge the elements of two array in one array--------------------------------
		
//		for(int i=0;i<c.length;i++) {
//			if(i<a.length) {
//				c[i]=a[i];
//			}
//			else {
//				c[i]=b[i-a.length];
//			}
//		}
//		System.out.println(Arrays.toString(c));
		
		
//   Copy the elements of two array in one array in alternate meaner ----------------------------------------------
		
//
//		int a1[] = {1,2,3,4,5,};
//		int b1[] = {6,7,8,9,10};
//		
//		int c1[] =new int [a1.length+b1.length];
//		
//		for(int i=0,j=0;i<a1.length;i++) {
//			c1[j]=a1[i];
//			j++;
//			c1[j]=b1[i];
//			j++;
//		}
//		System.out.println(Arrays.toString(c1));
		
		
//   Copy the elements of two different size of array in one array in alternate meaner ----------------------------------------------

		int a2[] = {1,2,3};
		int b2[] = {6,7,8,9,10};
		
		int c2[] =new int [a2.length+b2.length];
		
		if(a2.length<b2.length) {
			for(int i=0,j=0;j<c2.length;) {
				if(i<a2.length) {
					c2[j]=a2[i];
					j++;
					c2[j]=b2[i];
					j++;
					i++;
				}
				else {
					c2[j]=b2[i];
					j++;
					i++;
				}
			}
		}
		
		System.out.println(Arrays.toString(c2));
		
		
		

	}

}
