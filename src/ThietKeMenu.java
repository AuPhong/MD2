import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        System.out.println("Input your choice:\n1.Draw a triangle\n2.Draw a square\n3.Draw a rectangle\n0.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 0:
                break;
            case 1:
                for (int i=0; i<5; i++){
                    for (int j=0; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Insert a side:");
                int a = sc.nextInt();
                for (int i=0; i<a; i++){
                    for (int j=0; j<a; j++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Insert width: ");
                int w = sc.nextInt();
                System.out.println("Insert height: ");
                int h = sc.nextInt();
                for (int i=0; i<w; i++){
                    for (int j=0; j<h; i++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
        }
    }
}
