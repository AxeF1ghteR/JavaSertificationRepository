package JavaSertification;
import java.util.Scanner;

import static java.lang.Math.*;
public class Template_1_1 {
    public static void template11 (){
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("c=");
            double c = in.nextDouble();
            System.out.println("d=");
            double d = in.nextDouble();
            System.out.println("x=");
            double x = in.nextDouble();

            //Double c = 5.6, d = 7.2, x = 3.0;
            Double y, z = 0.0;
            System.out.printf("X = %.1f\n", x);
            y = (c > d ? min(c, d) / (2 - 5) : max(c, d));
            System.out.printf("Y = %.2f\n", y);

            if (abs(x) > abs(y)) {
                z = pow(pow(x, 2) + (1 / sqrt(y)), 1 / 5);
            } else if (x == y) {
                z = (x + 5) / y;
            } else if (abs(x) < abs(y)) {
                z = sin(x) + pow(2.718, cos(y));
            }
            System.out.printf("Z = %.2f\n", z);
        }catch (Exception e){
            System.out.println("Runtime ERROR!");
        }

    }
}
