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

    public static void main(String[] args) {
        System.out.println("Message n times : ");
        printNTimes("Hello", 5);
        System.out.println();

        System.out.println("1 to N");
        print1ToN(10);
        System.out.println();

        System.out.println("N to 1");
        printNTo1(10);
        System.out.println();

        System.out.println("Sum of N numbers");
        System.out.println(sumOfN(10));
        System.out.println();

        System.out.println("Factorial");
        System.out.println(facorial(5));
        System.out.println();

        System.out.println("Reverse an array : ");
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Palindromic or not : ");
        String str = "madam";

        if (palindromic(str, 0, str.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    }
