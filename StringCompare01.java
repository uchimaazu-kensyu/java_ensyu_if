import java.util.Scanner;

public class StringCompare01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var input = sc.nextLine();
        var input2 = sc.nextLine();
        if (input.equals(input2)) {
            System.out.println("入力値が一致しました");
        }else{
            System.out.println("入力値が一致しません");

        }


    }
}