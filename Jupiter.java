import java.util.Scanner;

public class Jupiter extends Motor{
    int waranty;
    Scanner input = new Scanner(System.in);
    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhap waranty: ");
        waranty = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "Jupiter{" +
                "waranty=" + waranty +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num=" + num +
                '}';
    }

    @Override
    public void displayInfo() {

    }
}
