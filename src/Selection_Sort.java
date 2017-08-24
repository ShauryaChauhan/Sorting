import java.util.*;
public class Selection_Sort {

	public static int[] doSelectionSort(int array[]){
        
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) 
                    index = j;
      
            int small_Num = array[index];  
            array[index] = array[i];
            array[i] = small_Num;
        }
        return array;
	}
     
    public static void main(String a[]){
    	Scanner sc=new Scanner(System.in);
        int n; 
        System.out.println("Enter the number of integers:");
        n=sc.nextInt();
        
        
        int[] arr1 =new int[n];
        for(int i=1;i<n;i++)
        {
        	arr1[i]=sc.nextInt();
        }
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.println();
            System.out.print(", ");
        }
    }


}
