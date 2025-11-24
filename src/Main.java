public class Main {

    private static void printNTimes(String message, int n){
        if (n <= 0) return;
        System.out.println(message);
        printNTimes(message, n - 1);
    }

//    private static void print1ToN(int n){
//        if (n == 0) return;
//        print1ToN(n - 1);
//        System.out.println(n);
//    }
//
//    private static void printNTo1(int n){
//        if (n == 0) return;
//        System.out.println(n);
//        print1ToN(n - 1);
//    }
//
//    private static int sumOfN(int n){
//        if (n == 0) return 0;
//        return n + sumOfN(n - 1);
//    }

    public static void main(String[] args) {
        System.out.println("Message n times : ");
        printNTimes("Hello", 5);
        System.out.println();

//        System.out.println("1 to N");
//        print1ToN(10);
//        System.out.println();
//
//        System.out.println("N to 1");
//        printNTo1(10);
//        System.out.println();
//
//        System.out.println("Sum of N numbers");
//        System.out.println(sumOfN(10));
//        System.out.println();

    }
}