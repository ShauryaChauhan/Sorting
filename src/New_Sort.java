
public class New_Sort
{
	public static void bubble_sort(int array[]) {
        int len = array.length;
        int flag;
        for (int m = len; m >= 0; m--) {
            for (int i = 0; i < len - 1; i++) {
                flag = i + 1;
                if (array[i] > array[flag]) {
                	
                    swapNumbers1(i, flag, array);
                }
            }
            printNumbers1(array);
        }
    }
  
    private static void swapNumbers1(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers1(int array1[]) {
          
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int array2[] = { 19, 12, 95, 64, 23, 112, 34, 10, 14 ,19};
        bubble_sort(array2);
  
    }
}

	

	
