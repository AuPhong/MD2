import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm: ");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%100==0&&year%400==0){
            System.out.println(year+" là năm nhuận.");
        }
        else {
            System.out.println(year+" không phải là năm nhuận.");
        }
    }
}
