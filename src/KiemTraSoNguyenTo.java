import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = sc.nextInt();
        if (number<=0){
            System.out.println("Đây không phải số nguyên tố");
        }
        else if (number==1 && number==2){
            System.out.println(number+" là số nguyên tố");
        }
        else {
            for (int i=2; i<number; i++){
                if (number%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number+" là số nguyên tố");
            }
            else {
                System.out.println(number+ " không phải là số nguyên tố");
            }
        }
    }
}
