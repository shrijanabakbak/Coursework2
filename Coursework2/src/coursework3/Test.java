package coursework3;

import java.util.Arrays; 
class Test { 
	  
    // Returns index of x if it is present 
    // in arr[], else return -1 
    int binarySearch(int arr[], int x) 
    { 
  
        int l = 0, r = arr.length - 1; 
        System.out.println(arr[2]);
        // Iterate until l <= r 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            System.out.println(m);
            // Check if x is at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater than arr[m] 
            // then ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller than arr[m] 
            // ignore right half 
            else
                r = m - 1; 
        } 
  
        // If we reach here, then element 
        // was not present 
        return -1; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        // Create object of this class 
        Test ob = new Test(); 
  
        // Given array arr[] 
        int arr[] = { 2, 3, 4,9, 10, 40,60 }; 
        int n = arr.length;
        System.out.println(n);
        int x = 10; 
        System.out.println(Arrays.asList(arr).contains(10));
        // Function Call 
        int result = ob.binarySearch(arr, x); 
  
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index "
                               + result); 
    } 
} 