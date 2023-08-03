package com.lumen.scan;

public class OneDimArraySquare {

	public static void main(String[] args) {
		
        int arr[] = {10,28,35,46,58,60};
        
        for(int i=0;i<arr.length;i++)
        {
      
            arr[i] = arr[i]*arr[i];
        }
        
        System.out.println("New array after finding square of each element :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }    

	}

}
