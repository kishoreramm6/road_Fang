import java.util.*;

public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the array:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("You entered array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Array element " + (i + 1) + ": " + array[i]);
        }
        Array a = new Array();
        a.largest(array);
        a.set(array);
    }
}

class Array {
    public void largest(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (len - i - 1); j++) {
                if (array[j] < array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }

    public void set(int array[]) {
        int len = array.length;
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < len; i++) {
            sets.add(array[i]); 
        }

        
        Integer [] arrayy= sets.toArray(new Integer[0]);
        System.out.println("remove duplicate array ");
        for(int i=0;i<arrayy.length;i++){
           System.out.println(arrayy[i]) ;
        }
        
        System.out.println(" size  is :" + sets.size());
    }
}