public class AmountOfTens {
    private int n;

    public AmountOfTens(int n) {
        this.n = n;
        if (n > 1) {
            PrintSum(1);
        } else {
            System.out.println("error");
        }
    }

    private void PrintSum(int i) {

        if ((n/(i*10)) > 1) {
            PrintSum(i + 1);
        } else {
            System.out.println(i);
            return;
        }
    }
}
