import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Number2.main(args);
    }

}

//Complexity: linear - O(n)
class Number1{
    public static int FindMin(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        if (arr[n - 1] < FindMin(arr, n - 1)) {
            return arr[n - 1];
        } else {
            return FindMin(arr, n - 1);
        }
    }


    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);

        System.out.println("Enter number of elements: ");

        int n = Number.nextInt();

        int arr[] = new int [n];

        System.out.println("Enter your numbers: ");

        for (int i = 0; i < n; i++){
            arr[i] = Number.nextInt();
        }

        int Min = FindMin(arr, n);
        System.out.println(Min);

    }
}

//Complexity: linear - O(n)
class Number2 {
    public static double FindAVG(double[] arr, int n) {
            if (n == 1) {
                return arr[n - 1];
            }
            else{
                return (FindAVG(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
            }

    }


    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = Number.nextInt();

        double arr[] = new double[n];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++){
            arr[i] = Number.nextInt();
        }

        double Avg = FindAVG(arr, n);
        System.out.printf("Your average number is : %f", Avg);
    }
}

//Complexity: linear - O(n)
class Number3{
    public static boolean CheckIfPrime(int n, int i){
        if (n <= 2){
            return false;
        }
        if (i == n) {
            return true;
        }
        if(n % i == 0){
            return false;
        }
        return CheckIfPrime(n, i + 1);
    }

    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = Number.nextInt();
        if (CheckIfPrime(n, 2) == true){
            System.out.println("Prime");
        }
        else{
            System.out.print("Composite");
        }
    }

}

//Complexity: factorial - O(n!)
class Number4{
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = Number.nextInt();
        System.out.printf("Factorial of a number %d is %d", n, factorial(n));
    }
}

//Complexity: Exponential - O(2^n)
class Number5{
    public static int FibbonacciSequence(int n){
        if(n <= 1){
            return n;
        }
        else{
            return  FibbonacciSequence(n - 1) + FibbonacciSequence(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = Number.nextInt();
        System.out.printf("Number under %d th fibbonacci element is: %d", n, FibbonacciSequence(n));
    }
}

//Complexity: Exponential - O(2^n)
class Number6{
    public static int FindDegree(int n, int deg){
        if (deg == 0){
            return 1;
        }
        else{
            return n * FindDegree(n, deg - 1);
        }
    }
    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = Number.nextInt();
        int deg = Number.nextInt();
        System.out.println(FindDegree(n, deg));
    }
}

//Complexity: factorial - O(n!)
class Number7{
    public static void GeneratePerm(String Remaining, String Current){
        if (Remaining.length() == 0){
            System.out.println(Remaining);
            return;
        }
        else{
            System.out.println();
            GeneratePerm(Remaining, Current);
            return;
        }
    }
    public static void main(String[] args){
        Scanner Chars = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String perm = Chars.nextLine();
        GeneratePerm(perm, "");
    }
}

//Complexity: linear - O(n)
class Number8 {
    public static boolean CheckIfClear(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char ch = s.charAt(index);
        if (ch < '0' || ch > '9') {
            return false;
        }
        return CheckIfClear(s, index + 1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String NewStr = input.nextLine();
        if (CheckIfClear(NewStr, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

//Complexity: Factorial - O(n!)
class Number9{
    public static int binomial(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }
        else{
            return binomial(n - 1, k - 1) + binomial(n - 1, k);
        }
    }
    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Write your numbers: ");
        int n1 = Number.nextInt();
        int n2 = Number.nextInt();
        System.out.println(binomial(n1, n2));
    }
}

//Complexity: linear - O(n) I can't prove that it is logarithmic with (log(min(a, b)))
class Number10{
    public static int GCD(int n1, int n2){
        if (n2 == 0){
            return n1;
        }
        else{
            return GCD(n2, n1 % n2);
        }
    }

    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int n1 = Number.nextInt();
        int n2 = Number.nextInt();
        System.out.printf("GCD is: %d", GCD(n1, n2));
    }
}
