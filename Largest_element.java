import java.util.*;

public class Largest_element{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("no of elements:");
        int n = scanner.nextInt();
        System.out.println("enter the array:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("you entered array:");
        for (int i = 0; i < n; i++) {
            System.out.println("array element " + (i + 1) + ": " + array[i]);
        }

        ArraysCustom a = new ArraysCustom();
        a.sorted(array);
        a.largest(array);
    }
}

class ArraysCustom {
    public void sorted(int arra[]) {
        int len = arra.length;
     
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arra[j] > arra[j + 1]) {
                    
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
        }

        
        System.out.println("sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }

    public void largest(int arra[]) {
        int len = arra.length;
        System.out.println("largest number in the array: " + arra[len - 1]);
    }
}
