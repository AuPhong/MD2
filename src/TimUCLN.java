import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a: ");
        a = sc.nextInt();
        System.out.println("Insert b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("None");
        }
        else {
            while (a!=b){
                if (a > b) {
                    a = a-b;
                }
                else {
                    b = b-a;
                }
            }
            System.out.println(a+" is greatest comon factor");
        }
    }
}
