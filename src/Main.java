import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car BatMobile = new Car("Batman", "BatMobile", 1939, 1);
        Car car2 = new Car("second Car Brand", "second Model", 2222, 2);

        int a;
        int b;
        int k;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a: ");
        a = scanner.nextInt();
        System.out.print("enter b: ");
        b = scanner.nextInt();
        System.out.print("enter k: ");
        k = scanner.nextInt();

        SumOfNumbers sum = new SumOfNumbers(a, b, k);

        int n;

        System.out.print("enter n: ");
        n = scanner.nextInt();


        NaturalNumbersSum naturalNumbersSum = new NaturalNumbersSum(100);

        AmountOfTens amountOfTens = new AmountOfTens(100);
    }
}
