import java.util.Scanner;

public class Task3 {

    public static int[] Array(Scanner sc, String name) {
        System.out.print("Enter size of " + name + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of " + name + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(name + "[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static boolean areArraysEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = Array(sc, "Array 1");
        int[] arr2 = Array(sc, "Array 2");


        boolean result = areArraysEqual(arr1, arr2);

        if (result) System.out.println(" Arrays are equal.");
            else
                System.out.println(" Arrays are NOT equal.");

        sc.close();
    }
}
