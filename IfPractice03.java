import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var input = sc.nextInt();
        if (input >= 60 && input % 2 == 0) {
            System.out.println(input);
        }


    }
}


