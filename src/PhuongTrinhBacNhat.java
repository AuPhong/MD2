import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b");
        double b = sc.nextDouble();
        if (a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }
        else if (a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Phương trình có nghiệm x = "+ -b/a);
        }
    }
}
