import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number = 0, remainder = 0, inverted = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(number > 0){
            remainder = number % 10;
            inverted = inverted * 10 + remainder;
            number /= 10;
        }
        System.out.println(inverted);
    }
}
