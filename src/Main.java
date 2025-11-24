import org.w3c.dom.ls.LSOutput;

public class Main {

    private static void printNTimes(String message, int n){
        if (n <= 0) return;
        System.out.println(message);
        printNTimes(message, n - 1);
    }

    private static void print1ToN(int n){
        if (n == 0) return;
        print1ToN(n - 1);
        System.out.println(n);
    }

    private static void printNTo1(int n){
        if (n == 0) return;
        System.out.println(n);
        print1ToN(n - 1);
    }

    private static int sumOfN(int n){
        if (n == 0) return 0;
        return n + sumOfN(n - 1);
    }

    private static int facorial(int n){
        if (n == 0 || n == 1) return 1;
        return n * facorial(n-1);
    }

    private static void reverseArray(int[] arr, int left, int right){
        if (left >= right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left+1, right-1);
    }

    private static boolean palindromic(String str, int left, int right){
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        return palindromic(str, left+1, right-1);
    }

    private static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("         RECURSION TESTER");
        System.out.println("====================================\n");

        System.out.println("[1] Print message N times");
        System.out.println("------------------------------------");
        printNTimes("Hello", 5);
        System.out.println();

        System.out.println("[2] Print numbers 1 to N");
        System.out.println("------------------------------------");
        print1ToN(10);
        System.out.println();

        System.out.println("[3] Print numbers N to 1");
        System.out.println("------------------------------------");
        printNTo1(10);
        System.out.println();

        System.out.println("[4] Sum of first N numbers");
        System.out.println("------------------------------------");
        System.out.println(sumOfN(10));
        System.out.println();

        System.out.println("[5] Factorial");
        System.out.println("------------------------------------");
        System.out.println(facorial(5));
        System.out.println();

        System.out.println("[6] Reverse an array");
        System.out.println("------------------------------------");
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        System.out.println("[7] Check palindrome");
        System.out.println("------------------------------------");
        String str = "madam";
        System.out.println(palindromic(str, 0, str.length() - 1)
                ? "Palindrome"
                : "Not a palindrome");
        System.out.println();

        System.out.println("[8] Fibonacci number");
        System.out.println("------------------------------------");
        System.out.println(fibonacci(6));
        System.out.println();

        System.out.println("====================================");
        System.out.println("              DONE");
        System.out.println("====================================");
    }




}
