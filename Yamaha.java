import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chon;
        int n;
        List<Motor> list=new ArrayList<>();

        System.out.println("Nhap so xe muon nhap");
        n = Integer.parseInt(input.nextLine());
        do {
            System.out.println("1. Input\n2. Display\n3. Sort\n4. Search\n5. Exit\nChon so ban can");
            chon = Integer.parseInt(input.nextLine());

            switch (chon){
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("jupiter"+" ["+(i+1)+"] ");
                        Jupiter jupiter=new Jupiter();
                        jupiter.inputInfo();
                        list.add(jupiter);
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("serius"+" ["+(i+1)+"] ");
                        Serius serius=new Serius();
                        serius.inputInfo();
                        list.add(serius);
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 3:
                    Collections.sort(list,(o1, o2) -> {
                        int wanX = 0;
                        int wanY = 0 ;
                        if(o1 instanceof Jupiter){
                            Jupiter jupiter = (Jupiter) o1;
                            wanX = jupiter.waranty;
                        }else {
                            Serius serius=(Serius) o1;
                            wanY= serius.waranty;
                        }
                        if(o2 instanceof Jupiter){
                            Jupiter jupiter = (Jupiter) o2;
                            wanX = jupiter.waranty;
                        }else {
                            Serius serius=(Serius) o2;
                            wanY= serius.waranty;
                        }
                        return wanY-wanX;
                    });
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 4:
                    String tenXe;
                    System.out.println("Nhap ten xe muon tim:");
                    tenXe=input.nextLine();
                    for (Motor motor:list) {
                        if(motor.getName().equals(tenXe)){
                            System.out.println(motor);
                        }
                    }
                    break;
                case 5:
                    System.err.println("Đã thoát chương trình.");
                    return;
                default:
                    System.err.println("Số đã chọn ko có , chọn lại");

            }
        }while (true);
    }
}
