import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var input = sc.nextInt();
        if( 100>= input && input >= 80){
            System.out.println("A評価です");

        }else if (80> input && input >= 60){
            System.out.println("B評価です");
        }else if (60> input && input >= 40){
            System.out.println("C評価です");
        }else if (40> input && input >= 20){
            System.out.println("D評価です");
        }else if (20> input ){
            System.out.println("E評価です");
        }
    }
}