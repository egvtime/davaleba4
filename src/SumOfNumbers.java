public class SumOfNumbers {
    int a;
    int b;
    int k;

    public SumOfNumbers(int a, int b, int k) {
        this.a = a;
        this.b = b;
        this.k = k;

        if (k < b && a < b) {
            findMultiplesRecursive(1);
        } else {
            System.out.println("error");
        }
    }

    private void findMultiplesRecursive(int i) {
        int multiple = i * k;

        if (multiple >= b) {
            return;
        }

        if (multiple > a) {
            System.out.println(multiple);
        }

        findMultiplesRecursive(i + 1);
    }
}
