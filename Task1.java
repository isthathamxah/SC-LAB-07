import java.util.*;

public class Task1 {

    public static void Sortlist(ArrayList<Integer> numbers) {
        numbers.sort(Integer::compare);
        System.out.println("Sorted Array : " + numbers);
    }

    public static int SecondSmallest(ArrayList<Integer> numbers) {
        return numbers.get(1);
    }

    public static int Smallest(ArrayList<Integer> numbers) {
        return numbers.get(0);
    }

    public static int Largest(ArrayList<Integer> numbers) {
        return numbers.get(numbers.size() - 1);
    }

    public static int SecondLargest(ArrayList<Integer> numbers) {
        return numbers.get(numbers.size() - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();


        if (n < 2) {
            System.out.println("List must contain at least two elements!");
            sc.close();
            return;
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Element No " + i + ": ");
            numbers.add(sc.nextInt());
        }

        Sortlist(numbers);

        System.out.println("Smallest: " + Smallest(numbers));
        System.out.println("Second Smallest: " + SecondSmallest(numbers));
        System.out.println("Second Largest: " + SecondLargest(numbers));
        System.out.println("Largest: " + Largest(numbers));

        sc.close();
    }
}
