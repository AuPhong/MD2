import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {

        System.out.println("Lựa chọn: \n 1.USD to VND \n 2.VND to USD");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Input value to convert: ");
        double value = sc.nextDouble();
        switch (choice){
            case 1:
                System.out.println("VND: "+ value*23000);
                break;
            case 2:
                System.out.println("USD "+ value/23000);
                break;
        }
    }
}
