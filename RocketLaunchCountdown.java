import java.util.Scanner;
public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println( counter);
            counter--;
        }
    }
}
