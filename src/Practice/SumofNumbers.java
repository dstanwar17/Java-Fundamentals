package Practice;


import java.util.Scanner;

class SumofNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n: ");
        int n = sc.nextInt();

        int counter = 0;
        int sum = 0;

        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of numbers is: " + sum);

    }
}

