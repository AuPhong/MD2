import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert investing money: ");
        double investMoney = sc.nextDouble();
        System.out.println("Insert annual interest: ");
        double anualInterest = sc.nextDouble();
        System.out.println("Insert number of month: ");
        double numMonth = sc.nextDouble();
        double interest = investMoney * anualInterest/12 * numMonth;
        System.out.println("The interset is: "+ interest);
    }
}
