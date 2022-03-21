import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        System.out.println("Press number to choose:\n1.Print the rectangle\n2.Print the square triangle\nPrint isosceles triangle\n4.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Insert width: ");
                int w = sc.nextInt();
                System.out.println("Insert height: ");
                int h = sc.nextInt();
                for (int i=0; i<h; i++){
                    for (int j=0; j<w; j++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Press to choose:\n1.top-left\n2.top-right\n3.bottom-left\n4.bottom-right");
                int choice2 = sc.nextInt();
//                System.out.println("Input 2 side value of triangle:");
//                int side1 = sc.nextInt();
//                int side2 = sc.nextInt();
                switch (choice2){
                    case 3:
                        for (int i=0; i<5; i++){
                            for(int j=0; j<=i; j++){
                                System.out.print("* ");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 1:
                        for (int i=0; i<5; i++){
                            for (int j=5; j>i; j--){
                                System.out.print("* ");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 2:

                }
                break;
            default:
                System.out.println("Please enter a proper value!");
        }
    }
}
