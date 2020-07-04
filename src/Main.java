import java.util.Scanner;

/**
 * Created by KPS on 7/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a binary number");
        long b = scanner.nextLong();
        System.out.println("please enter a binary number");
        long a = scanner.nextLong();
        int[] sum = new int[20];
        int reminder = 0,i = 0;
        while (a!=0 | b!=0) {
            sum[i++]= (int) ((a % 10 + b % 10 + reminder) % 2);
            reminder= (int) ((a % 10 + b % 10 + reminder) / 2);
            a=a/10;
            b=b/10;
        }
        if (reminder!=0){
            sum[i++]=reminder;
        }
        i--;
        while (i>=0){
            System.out.print(sum[i--]);
        }
    }
}
