import java.util.Scanner;

public class IfPractice04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var year = sc.nextInt();
        if(year % 4 != 0) { // 4で割り切れない場合はうるう年ではない
            //;
        } else if(year % 100 != 0) { // 4で割り切れるが、100で割り切れない場合はうるう年
            System.out.println("閏年です");
        } else if (year % 400 == 0) {  // 4で割り切れ、100でも割り切れるが、400で割り切れる場合はうるう年
            System.out.println("閏年です");
        } else{ // 4で割り切れ、100でも割り切れるが、400で割り切れない場合はうるう年ではない
            //;
        }


    }
}


