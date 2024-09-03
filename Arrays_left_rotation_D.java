import java.util.*;

public class Arrays_left_rotation_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = scanner.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("How many elements to shift left:");
        int d = scanner.nextInt();

        Rotation rotationObj = new Rotation();
        rotationObj.rotation(array, d);

        System.out.println("Array after left rotation:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

class Rotation {
    public void rotation(int arr[], int d) {
        int n = arr.length;
        
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

       
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
