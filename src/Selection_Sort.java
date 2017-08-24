
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
         
        int[] arr1 = {44,71,33,51,29,21};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }


}
