import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number to read: ");
        int number = sc.nextInt();
        int phanTram = number / 100;
        int phanChuc1 = phanTram / 10;
        int phanDonvi1 = phanChuc1 % 10;
        int phanChuc = number / 10;
        int phanDonvi = number % 10;
        String tram, chuc1, donVi1, chuc, donvi;

        if (number>100 && number<1000){
            switch (phanTram) {
                case 1:
                    tram = "One Hundred and";
                    break;
                case 2:
                    tram = "Two Hundred and";
                    break;
                case 3:
                    tram = "Three Hundred and";
                    break;
                case 4:
                    tram = "Four Hundred and";
                    break;
                case 5:
                    tram = "Five Hundred and";
                    break;
                case 6:
                    tram = "Six Hundred and";
                    break;
                case 7:
                    tram = "Seven Hundred and";
                    break;
                case 8:
                    tram = "Eight Hundred and";
                    break;
                case 9:
                    tram = "Nine Hundred and";
                    break;
            }

            switch (phanChuc1) {
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;
            }

            switch (phanDonvi1){
                case 1:
                    donVi1 = "one";
                    break;
                case 2:
                    donVi1 = "two";
                    break;
                case 3:
                    donVi1 = "three";
                    break;
                case 4:
                    donVi1 = "four";
                    break;
                case 5:
                    donVi1 = "five";
                    break;
                case 6:
                    donVi1 = "six";
                    break;
                case 7:
                    donVi1 = "seven";
                    break;
                case 8:
                    donVi1 = "eight";
                    break;
                case 9:
                    donVi1 = "nine";
                    break;
            }
        }


    }
}
