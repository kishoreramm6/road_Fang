import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements in array:");
        int n = scanner.nextInt();
        System.out.println("Enter the array:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Search s = new Search();
        s.Linear(array);
    }
}

class Search {
    Scanner scanner = new Scanner(System.in);

    public void Linear(int arra[]) {
        System.out.println("Enter number to search:");
        int key = scanner.nextInt();
        int len = arra.length;
        boolean found = false;
        
        for (int i = 0; i < len; i++) {
            if (arra[i] == key) {
                System.out.println(key + " is found at index " + i);
                found = true;
                break;  // Exit the loop once the key is found
            }
        }
        
        if (!found) {
            System.out.println("Key is not found.");
        }
    }
}
