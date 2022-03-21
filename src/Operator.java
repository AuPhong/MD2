import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        double width = sc.nextDouble();
        System.out.println("Nhập vào chiều dài: ");
        double length = sc.nextDouble();

        double area = width * length;
        System.out.println("\nDiện tích hình chữ nhật là: "+ area);
    }
}
