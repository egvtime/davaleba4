public class Car {
    private String Mark;
    private String Model;
    private int YearOfRelease;
    private int GovermentNumber;

    public Car(String Mark, String Model, int YearOfRelease, int GovermentNumber){
        this.Mark = Mark;
        this.Model = Model;
        this.YearOfRelease = YearOfRelease;
        this.GovermentNumber = GovermentNumber;
    }

    public void PrintInfo(){
        System.out.println("The Cars Mark: " + Mark);
        System.out.println("The Cars Model: " + Model);
        System.out.println("The Cars Year of Release: " + YearOfRelease);
        System.out.println("The Cars GovermentNumber: " + GovermentNumber);

    }
}
