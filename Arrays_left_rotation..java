import java.util.*;

public class Arrays_left_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the array:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arr a = new Arr();
        a.kleft(array);
    }
}

class Arr {
    public void kleft(int[] parr) {
        if (parr.length == 0) return;

       
        int first = parr[0];

     
        for (int i = 0; i < parr.length - 1; i++) {
            parr[i] = parr[i + 1];
        }

       
        parr[parr.length - 1] = first;

        
        System.out.println("Array after left rotation:");
        for (int i = 0; i < parr.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + parr[i]);
        }
    }
}
