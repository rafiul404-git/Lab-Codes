class Lab_1 {
    public static void main(String[] args) {
        // method 1: Personal Info
        personalInfo();

        // method 2: Sum and Even/Odd check
        sumAndEvenOddCheck();
        System.out.println();

        // method 3: Sum of numbers 1 to 100
        sumOfNumbers();
        System.out.println();

        // method 4: Multiplication Table of 25
        multiplicationTable();
        System.out.println();

        // method 5: Largest number check
        largestNumber();
        System.out.println();

        // method 6: Prime number check
        int prime = 19;
        prime(prime);
    }

    // Method 1: Personal Info
    static void personalInfo() {
        String name = "Rafi";
        int age = 22;
        double height = 5.11;
        float weight = 82.5f;

        int num1 = 2, num2 = 8;

        System.out.println("Hello " + name + ". I am glad that you are already " + age + " years old");
        System.out.println("As you are " + weight + "kg, you are so healthy.");
        int x = num1 + num2;
        System.out.println("You entered two numbers " + num1 + " & " + num2 + " where the sum is " + x);
    }

    // Method 2: Sum and Even/Odd check
    static void sumAndEvenOddCheck() {
        int[] a = {5, 7, 8, 11, 17, 40};
        int x = 5;
        int sum = 0;

        for (int i = 0; i < x; i++) {
            sum = sum + a[i];
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is Even");
            } else {
                System.out.println(a[i] + " is Odd");
            }
        }
        System.out.println("Sum is " + sum);

        int avg = sum / (x + 1);
        System.out.println("Average is " + avg);
    }

    // Method 3: Sum of numbers 1 to 100
    static void sumOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 1-100 is " + sum);
    }

    // Method 4: Multiplication Table of 25
    static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("25 x " + i + " = " + (25 * i));
        }
    }

    // Method 5: Largest number check
    static void largestNumber() {
        int a = 7, b = 11, c = 2;
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
    }

    // Method 6: Prime number check
    static void prime(int x) {
        int a = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                a++;
            }
            if (a > 0) {
                System.out.println("The number is not prime");
                break;
            }
        }

        if (a == 0) {
            System.out.println("The number is prime");
        }
    }
}
