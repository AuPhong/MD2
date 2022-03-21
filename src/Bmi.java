import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập vào chiều cao: ");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height,2);
        if (bmi<18.5){
            System.out.println("Underweight");
        }
        else if (bmi>=18.5 && bmi<25.0){
            System.out.println("Normal");
        }
        else if (bmi>=25.0 && bmi<30.0){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
