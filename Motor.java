import java.util.Scanner;

public class Motor implements IMotor{
    String code;
    String name;
    double capacity;
    int num;

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }
    public Motor(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap code: ");
        code=input.nextLine();
        System.out.println("Nhap name: ");
        name = input.nextLine();
        System.out.println("Nhap capacity: ");
        capacity = Double.parseDouble(input.nextLine());
        System.out.println("Nhap num: ");
        num = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "Motor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num=" + num +
                '}';
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void changeInfor() {

    }
}
