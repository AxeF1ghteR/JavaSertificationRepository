package JavaSertification;
import java.util.Scanner;

import static java.lang.Math.*;


public class Template_1_2 {

    public static void template12 (){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("x1=");
            double x1 = in.nextDouble();
            System.out.println("x2=");
            double x2 = in.nextDouble();
            System.out.println("dx=");
            double dx = in.nextDouble();

            double y;
            //double x1 = -2.0, x2 = 4.2, dx=0.3, y;
            System.out.println("  X  |  Y ");

            for (double i=x1; i<=x2; i+=dx ){
                y=(log(i+5)/log(2))/(5-pow(i,3));
                System.out.printf("%.1f  %.2f \n", i,y);

            }
        }
        catch (Exception e){
            System.out.println("Runtime ERROR!");
        }



    }

}
