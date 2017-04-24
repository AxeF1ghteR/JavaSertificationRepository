package JavaSertification;
import java.util.Scanner;


public class Template_1_3 {
    public static void template13 () {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Number(5symbols)=");
            long num = in.nextLong();
            //long num = 19836;
            //System.out.print(num);
            //--------Using string
//        String calc = "" + num;
//        Integer i = 0;
//        while (i < 5) {
//            if (i > 0 && i <= calc.length() - 2) {
//                if (Character.digit((calc.charAt(i)), 10) > Character.digit(calc.charAt(0), 10) + Character.digit(calc.charAt(calc.length() - 1), 10)) {
//                    System.out.print(calc.charAt(i)+" ");
//                }
//            }
//        i++;
//    }
            //--------Using division
            System.out.println();
            Long startch = num % 10, finishch = num / 10000 % 10;
            int k = 10000;
            do {
                k /= 10;
                Long ch = num / k % 10;
                if (ch > startch + finishch) {
                    System.out.print(ch + " ");
                }
            } while (k >= 10);
        } catch (Exception e){
            System.out.println("Runtime ERROR!");
        }

    }
}
