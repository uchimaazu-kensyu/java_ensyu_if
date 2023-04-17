import java.util.Scanner;

public class IfPractice01 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var input = sc.nextInt();
        String judge = input >= 60 ? "合格です":"不合格です";
        System.out.println(judge);

    }
}