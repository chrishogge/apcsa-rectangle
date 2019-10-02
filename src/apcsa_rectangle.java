import java.util.Scanner;

public class apcsa_rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nPlease enter a length and width: ");

        System.out.print("\nLength: ");
        double rectLength = in.nextDouble();

        System.out.print("Width: ");
        double rectWidth = in.nextDouble();

        double rectArea = rectLength * rectWidth;

        System.out.println("\nThe area of a " + String.format("%.1f",rectLength)
         + "-by-" + String.format("%.1f",rectWidth) + " rectangle is " +
         String.format("%.1f.",rectArea));



    }
}
