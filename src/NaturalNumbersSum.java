public class NaturalNumbersSum {
    private int n;
    private int Sum = 0;

    public NaturalNumbersSum(int n) {
        this.n = n;
        if (n > 1) {
            PrintSum(1);
        } else {
            System.out.println("error");
        }
    }

    private void PrintSum(int i) {

        if (i < n) {
            Sum += i;

        } else {
            if (i == n) {
                System.out.println(Sum);
            }
            return;
        }
        PrintSum(i + 1);
    }
}
